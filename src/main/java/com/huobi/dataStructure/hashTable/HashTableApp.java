package com.huobi.dataStructure.hashTable;

import java.io.IOException;

import static com.huobi.dataStructure.binaryTree.tree234.Tree234App.getChar;
import static com.huobi.dataStructure.binaryTree.tree234.Tree234App.getInt;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.dataStructure.hashTable
 * @date 2019-11-19 20:10
 */
public class HashTableApp {
    public static void main(String[] args) throws IOException {
        DataItem aDataItem;
        int aKey,size,n,keysPerCell;
        System.out.print("Enter size of hash table;");
        size = getInt();
        System.out.print("Enter initial number of items: ");
        n = getInt();
        keysPerCell = 10;
        HashTable theHashTable = new HashTable(size);
        for (int j = 0;j < n;j++){
            aKey = (int)(java.lang.Math.random()*keysPerCell*size);
            aDataItem = new DataItem(aKey);
            theHashTable.insert(aDataItem);
        }

        while(true){
            System.out.print("Enter first letter of ");
            System.out.print("show,insert,delete,or find: ");
            char choice = getChar();
            switch (choice){
                case 's':
                    theHashTable.displayTable();
                    break;
                case 'i':
                    System.out.print("Enter key value to insert: ");
                    aKey = getInt();
                    aDataItem = new DataItem(aKey);
                    theHashTable.insert(aDataItem);
                    break;
                case 'd':
                    System.out.print("Enter key value to delete: ");
                    aKey = getInt();
                    theHashTable.delete(aKey);
                    break;
                case 'f':
                    System.out.print("Enter key value to find: ");
                    aKey = getInt();
                    aDataItem = theHashTable.find(aKey);
                    if (aDataItem != null){
                        System.out.print("Found "+aKey);
                    }else{
                        System.out.println("Could not find " + aKey);
                    }
                    break;
                    default:
                        System.out.print("Invalid entry\n");
            }
        }
    }
}
