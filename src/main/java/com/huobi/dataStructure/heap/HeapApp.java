package com.huobi.dataStructure.heap;

import java.io.IOException;

import static com.huobi.dataStructure.binaryTree.tree234.Tree234App.getChar;
import static com.huobi.dataStructure.binaryTree.tree234.Tree234App.getInt;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.dataStructure.heap
 * @date 2019-11-27 13:29
 */
public class HeapApp {
    public static void main(String[] args)throws IOException {
        int value,value2;
        Heap theHeap = new Heap(31);
        boolean success;

        theHeap.insert(70);
        theHeap.insert(40);
        theHeap.insert(50);
        theHeap.insert(70);
        theHeap.insert(80);
        theHeap.insert(90);
        theHeap.insert(20);
        theHeap.insert(30);
        theHeap.insert(200);
        theHeap.insert(99);

        while(true){
            System.out.print("Enter first letter of ");
            System.out.print("show ,insert ,remove ,change ");
            int choice = getChar();
            switch (choice){
                case 's':
                    theHeap.displayHeap();
                    break;
                case 'i':
                    System.out.print("Enter value to insert");
                    value = getInt();
                    success = theHeap.insert(value);
                    break;
                case 'r':
                    if (!theHeap.isEmpty()){
                        theHeap.remove();
                    }else{
                        System.out.print("Can't remove:heap enpty");
                    }
                    break;
                case 'c':
                    System.out.println("Enter current index of item: ");
                    value = getInt();
                    System.out.println("Enter new Key ");
                    value2 = getInt();
                    success = theHeap.change(value, value2);
                    if (!success){
                        System.out.println("Invalid index");
                    }
                    break;
                 default:
                     System.out.println("Invalid entry: ");
                }
            }
        }
    }

