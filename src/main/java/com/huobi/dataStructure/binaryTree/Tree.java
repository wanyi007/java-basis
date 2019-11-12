package com.huobi.dataStructure.binaryTree;

import java.util.Stack;

/**
 * @author wanyi
 * @version V1.0
 * 二叉树的基本方法
 * @Package com.huobi.dataStructure.binaryTree
 * @date 2019-10-28 14:06
 */
public class Tree {
    private Node root;

    public Node find(int key){
        Node current = root;
        while(current.iData != key){
            if (key<current.iData){
                current = current.leftChild;
            }else{
                current = current.rightChild;
            }

        }
        if (current==null){
            return null;
        }
        return current;
    }

    //向树节点插入数据
    public void insert(int id,double value){
        Node newNode = new Node();
        newNode.iData = id;
        newNode.dData = value;

        if (root == null){
            root = newNode;
        }else {
            Node current = root;
            Node parent;

            while(true){
                parent = current;
                if (id < current.iData){
                    current = current.leftChild;
                    if (current == null){
                        parent.leftChild = newNode;
                        return;
                    }
                }else{
                    current = current.rightChild;
                    if (current == null){
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    //删除没有节点的子节点
    public boolean delete(int key){
       Node current = root;
       Node parent = root;
       boolean isLeftChild = true;
       while(current.iData != key){
            parent = current;
            if (key < current.iData){
                isLeftChild = true;
                current = current.leftChild;
            }else{
                isLeftChild = false;
                current = current.rightChild;
            }
            if (current == null){
                return false;
            }
       }

       if (current.leftChild==null && current.rightChild==null){
           if (current==root){
               root=null;
           }else if(isLeftChild){
               parent.leftChild = null;
           }else{
               parent.rightChild = null;
           }

       }else if (current.rightChild==null){
           if (current==root){
               root = current.leftChild;
           }else if(isLeftChild){
                parent.leftChild = current.leftChild;
           }else{
               parent.rightChild = current.leftChild;
           }
       }else if (current.leftChild==null){
           if (current==root){
               root = current.rightChild;
           }else if (isLeftChild){
               parent.leftChild = current.rightChild;
           }else {
               parent.rightChild = current.rightChild;
           }
       }else{
           Node successor = getSuccessor(current);
           if (current==root){
               root = successor;
           }else if(isLeftChild){
                parent.leftChild = successor;
           }else {
               parent.rightChild = successor;
           }
           successor.leftChild = current.leftChild;
       }
    return true;
    }

    //找到delNode的后继节点
    public Node getSuccessor(Node delNode){
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.rightChild;
        while(current!=null){
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }
        if (successor!=delNode.rightChild){
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = delNode.rightChild;
        }
        return successor;
    }

    public void traverse(int traverseType){
        switch (traverseType){
            case 1:
                System.out.print("\nPreorder traversal: ");
                preOrder(root);
                break;
            case 2:
                System.out.print("\nInorder traversal: ");
                inOrder(root);
                break;
            case 3:
                System.out.print("\nPostorder traversal: ");
                postOrder(root);
                break;
        }
        System.out.println();
    }
    public void preOrder(Node localRoot){
        if (localRoot!=null){
            System.out.print(localRoot.iData+" ");
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }

    }
    //遍历树节点，这个采用的是中序遍历
    public void inOrder(Node localRoot){
        if(localRoot != null){
            inOrder(localRoot.leftChild);
            System.out.println(localRoot.iData+" ");
            inOrder(localRoot.rightChild);
        }
    }

    public void postOrder(Node localRoot){
        if (localRoot!=null){
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            System.out.println(localRoot.iData+" ");
        }
    }
    public void displayTree(){
        Stack stack = new Stack();
        stack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println("...............................................");
        while(isRowEmpty==false){
            Stack localStack = new Stack();
            isRowEmpty = true;
            for (int j=0;j<nBlanks;j++){
                System.out.print("    ");
            }
            while (stack.isEmpty()==false){
                Node temp = (Node) stack.pop();
                if (temp!=null){
                    System.out.println(temp.iData);
                    localStack.push(temp.leftChild);
                    localStack.push(temp.rightChild);
                    if (temp.leftChild!=null || temp.rightChild!=null){
                        isRowEmpty = false;
                    }
                }else{
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j=0;j<nBlanks*2-2;j++){
                    System.out.print(" ");
                }
            }
            System.out.println();
            nBlanks /= 2;
            while (localStack.isEmpty()==false){
                stack.push(localStack.pop());
            }
            System.out.println("..................................................");
        }
    }}

