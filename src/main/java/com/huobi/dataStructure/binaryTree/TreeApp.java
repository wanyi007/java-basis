package com.huobi.dataStructure.binaryTree;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.dataStructure.binaryTree
 * @date 2019-10-28 14:09
 */
public class TreeApp {
    public static void main(String[] args) throws IOException{
        Tree theTree = new Tree();
        int value;
        theTree.insert(50,1.5);
        theTree.insert(25,1.7);
        theTree.insert(75,1.9);
        theTree.insert(76,1.2);
        theTree.insert(77,1.5);
        theTree.insert(78,1.7);
        theTree.insert(79,1.2);
        theTree.insert(23,1.5);
        theTree.insert(44,1.7);
        theTree.insert(54,1.2);
        theTree.insert(45,1.5);
        theTree.insert(66,1.7);

        while(true){
            System.out.print("Enter first letter of show, ");
            System.out.print("insert, find, delete, or traverse: ");
            int choice = getChar();
            switch (choice){
                case 's':
                    theTree.displayTree();
                    break;
                case 'i':
                    System.out.print("Enter value to insert: ");
                    value = getInt();
                    theTree.insert(value,value+0.9);
                    break;
                case 'f':
                    System.out.print("Enter value to find: ");
                    value = getInt();
                    Node found = theTree.find(value);
                    if (found != null){
                        System.out.print("Found: ");
                        found.displayNode();
                        System.out.print("\n");
                    }else{
                        System.out.print("Could not find");
                        System.out.print(value+"\n");
                    }
                    break;
                case 'd':
                    System.out.print("Enter value to delete: ");
                    value = getInt();
                    boolean delete = theTree.delete(value);
                    if (delete){
                        System.out.print("Deteted"+value+"\n");
                    }else{
                        System.out.print(value + "\n");
                    }
                    break;
                case 't':
                    System.out.print("Enter type 1,2 or 3:  ");
                    value = getInt();
                    theTree.traverse(value);
                    break;
                default:
                    System.out.print("Invalid entry: \n");
            }
        }


    }
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static char getChar() throws IOException{
        String s = getString();
        return s.charAt(0);
    }

    public static int getInt() throws IOException{
        String s = getString();
        return Integer.parseInt(s);
    }
}
