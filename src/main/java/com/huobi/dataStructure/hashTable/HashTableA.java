package com.huobi.dataStructure.hashTable;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.dataStructure.hashTable
 * @date 2019-11-20 20:13
 */
public class HashTableA {
    private SortedList[] hashArray;
    private int arraySize;

    public HashTableA(int size){
        arraySize = size;
        hashArray = new SortedList[arraySize];
        for (int j = 0;j<arraySize;j++){
            hashArray[j] = new SortedList();
        }
    }

    public void displayTable(){
        for (int j = 0;j<arraySize;j++){
            System.out.print(j+". ");
            hashArray[j].dispalyList();
        }
    }

    public int hashFunc(int key){
        return key % arraySize;
    }

    public void insert(Link theLink){
        int key = theLink.getKey();
        int hashVal = hashFunc(key);
        hashArray[hashVal].insert(theLink);
    }

    public void delete(int key){
        int hashVal = hashFunc(key);
        hashArray[hashVal].delete(key);
    }

    public Link find(int key){
        int hashVal = hashFunc(key);
        Link link = hashArray[hashVal].find(key);
        return link;
    }
}
