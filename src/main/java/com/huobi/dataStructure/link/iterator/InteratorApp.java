package com.huobi.dataStructure.link.iterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.dataStructure.link.iterator
 * @date 2019-08-27 00:21
 */
public class InteratorApp {
    public static String main(String[] args) throws IOException {
        LinkList theList = new LinkList();
        LinkIterator iterator = theList.getIterator();
        long value;
        iterator.insertAfter(20);
        iterator.insertAfter(30);
        iterator.insertAfter(40);
        iterator.insertBefore(80);

        while(true){
            System.out.println("Enter first letter of show, reset ");
            System.out.println("next, get , before, after. delete");
            System.out.flush();
            int choice = getChar();
            switch(choice){
                case 's':
                    if (!theList.isEmpty()){
                        theList.displayList();
                    }else{
                        System.out.println("List is Empty");
                        break;
                    }
                case 'r':
                    iterator.reset();
                    break;
                case 'n':
                    if (!theList.isEmpty() && !iterator.atEnd()){
                        iterator.nextLink();
                    }else{
                        System.out.println("can not go to next link");
                    }
                    break;
                case 'g':
                    if(!theList.isEmpty()){
                         value = iterator.getCurrent().dData;
                        System.out.println("Returned "+value);
                    }else{
                        System.out.println("list is Empty");
                        break;
                    }
                case 'b':
                    System.out.println("Enter value to insert");
                    System.out.flush();
                    value = getInt();
                    iterator.insertBefore(value);
                    break;
                case 'a':
                    System.out.println("Enter value to insert");
                    System.out.flush();
                    value = getInt();
                    iterator.insertAfter(value);
                    break;
                case 'd':
                    if(!theList.isEmpty()){
                        value = iterator.deleteCurrent();
                        System.out.println("Deleted "+value);
                    }else{
                        System.out.println("Can't delete");
                    }
                    break;
                    default:
                        System.out.println("Invalid entry");
            }
        }
    }
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    public static int getInt() throws IOException {
        String string = getString();
        return Integer.parseInt(string);
    }
}
