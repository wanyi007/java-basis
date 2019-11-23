package com.huobi.dataStructure.hashTable;

import java.io.IOException;

import static com.huobi.dataStructure.binaryTree.tree234.Tree234App.getChar;
import static com.huobi.dataStructure.recursion.TriangleApp.getInt;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.dataStructure.hashTable
 * @date 2019-11-21 13:28
 */
public class HashChainApp {
    public static void main(String[] args) throws IOException {
        int akey;
        Link aDataItem;
        int size,n,keysPerCell = 100;
        System.out.print("Enter size of hash table: ");
        size = getInt();
        System.out.print("Enter initial number of items: ");
        n = getInt();
        HashTableA theHashTable = new HashTableA(size);
        for (int i = 0;i<n;i++){
            akey = (int)(java.lang.Math.random()*keysPerCell*size);
            aDataItem = new Link(akey);
            theHashTable.insert(aDataItem);
        }

        while (true){
            System.out.print("Enter first letter of ");
            System.out.print("show ,insert,delete,of find ");
            char choice = getChar();
            switch (choice){
                case 's':
                    theHashTable.displayTable();
                    break;
                case 'i':
                    System.out.print("Enter value to inster: ");
                    akey = getInt();
                    Link link = new Link(akey);
                    theHashTable.insert(link);
                    break;
                case 'd':
                    System.out.print("Enter value to delete: ");
                    akey = getInt();
                    theHashTable.delete(akey);
                    break;
                case 'f':
                    System.out.println("Enter value to find: ");
                    akey = getInt();
                    aDataItem = theHashTable.find(akey);
                    if (aDataItem != null){
                        System.out.print("Found :"+akey);
                    }else{
                        System.out.print("Could not to find:"+akey);
                    }
                default:
                    System.out.print("Invalid entry \n");

            }
        }

    }
}
