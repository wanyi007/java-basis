package com.huobi.streaming.utils;

import com.alibaba.druid.sql.ast.statement.SQLColumnDefinition;
import com.alibaba.druid.sql.ast.statement.SQLCreateTableStatement;
import com.alibaba.druid.sql.ast.statement.SQLTableElement;
import com.alibaba.druid.sql.dialect.odps.parser.OdpsCreateTableParser;
import org.apache.flink.api.common.typeinfo.Types;
import org.apache.flink.table.descriptors.Schema;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.streaming.utils
 * @date 2020-08-20 22:27
 */
public class FileUtils {
    public static String loadSQL(String path) throws IOException {
        InputStream inputStream = FileUtils.class.getResourceAsStream("/" + path);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line = null;
        StringBuilder sb = new StringBuilder();
        while((line = reader.readLine()) != null){
            sb.append(line+"\n");
        }
        String s = sb.toString();
        return s;
    }

    public static void addField(Schema schema,SQLColumnDefinition element) throws Exception {
        String columName = element.getName().getSimpleName();
        String columType = element.getDataType().getName().toUpperCase();
        switch (columType){
            case "STRING":
                schema.field(columName, Types.STRING);
                break;
            case "DOUBLE":
                schema.field(columName,Types.DOUBLE);
                break;
            case "BIGINT":
                schema.field(columName,Types.LONG);
                break;
                default:
                    throw new Exception("addField: 未识别的字段类型：");
        }
    }

    public static Schema getTableSchema(String tableName) throws Exception {
        String ddls = loadSQL("schema.sql");
        String[] split = ddls.split(";");
        String ddl = null;

        for (String str : split){
            if (str.contains(tableName)){
                ddl = str.replaceAll("EXTERNAL","")
                        .replaceAll("\\$\\{","")
                        .replaceAll("}","");
                break;
            }
        }
        if (ddl == null){
            throw new Exception("找不到DDL，tableName: "+tableName);
        }

        OdpsCreateTableParser odpsCreateTableParser = new OdpsCreateTableParser(ddl);
        SQLCreateTableStatement sqlCreateTableStatement = odpsCreateTableParser.parseCreateTable();
        List<SQLTableElement> tableElementList = sqlCreateTableStatement.getTableElementList();
        List<SQLColumnDefinition> partitionColumns = sqlCreateTableStatement.getPartitionColumns();
        Schema schema = new Schema();

        for (SQLTableElement element:tableElementList){
            SQLColumnDefinition element1 = (SQLColumnDefinition) element;
            addField(schema,element1);
        }

        for(SQLColumnDefinition parpartitionColumn:partitionColumns){
            addField(schema,parpartitionColumn);
        }
        return schema;

    }
}
