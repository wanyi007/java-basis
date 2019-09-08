package com.huobi.designPatterns.factoryMode;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.designPatterns
 * @date 2019-08-14 00:07
 */
public class OperationMain {
    public static void main(String[] args) {
        Operation_v1 oper = new Operation_v1();
        Operation_v1 v1 = oper = OperationFactory.createOperate("+");
        oper.setNumberA(22);
        oper.setNumberB(33);
        try {
            double result = oper.GetResult();
            System.out.printf("result:"+result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
