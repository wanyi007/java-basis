package com.huobi.interFace;

/**
 * @author wanyi
 * @version V1.0
 * 对象排序的自定义对象
 * @Package com.huobi.interFace
 * @date 2019-07-25 17:24
 */
public class Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person(String last,String first,int a){
        lastName = last;
        firstName = first;
        age = a;
    }
    public void displayPerson(){
        System.out.printf("Last Name:"+lastName);
        System.out.printf(",First Name:"+firstName);
        System.out.printf(",Age:"+age);
    }
    public String getLastName(){
        return lastName;
    }
}
