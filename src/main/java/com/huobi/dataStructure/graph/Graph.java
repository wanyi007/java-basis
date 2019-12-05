package com.huobi.dataStructure.graph;


import com.huobi.dataStructure.queue.Queue;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.dataStructure.map
 * @date 2019-11-29 15:58
 */
public class Graph {
    private final int MAX_VERTS = 20;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;
    private StackX theStack;
    private Queue theQueue;


    public Graph(){
        vertexList = new Vertex[MAX_VERTS];
        nVerts = 0;
        for (int j = 0;j < MAX_VERTS;j++){
            for (int k = 0;k < MAX_VERTS;k++){
                adjMat[j][k] = 0;
            }
            theStack = new StackX();
        }
    }

    public void addVertex(char lab){
        vertexList[nVerts++] = new Vertex(lab);
    }

    public void addEdge(int start,int end){
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void displayVertex(int v){
        System.out.println(vertexList[v].label);
    }

    //基于深度优先的遍历
    public void dfs(){
        vertexList[0].wasVisited = true;
        displayVertex(0);
        theStack.push(0);

        while(!theStack.isEmpty()){
            int v = getAdjUnvisitedVertex(theStack.peek());
            if (v == -1){
                theStack.pop();
            }else{
                vertexList[v].wasVisited = true;
                displayVertex(v);
                theStack.push(v);
            }
        }

        for (int j = 0;j < nVerts;j++){
            vertexList[j].wasVisited = false;
        }

    }

    //基于广度优先的遍历
    public void bfs(){
        vertexList[0].wasVisited = true;
        displayVertex(0);
        theQueue.insert(0);
        int v2;

        while(!theQueue.isEmpty()){
            long v1 = theQueue.remove();
            while((v2=getAdjUnvisitedVertex((int)v1))!=-1){
                vertexList[v2].wasVisited = true;
                displayVertex(v2);
                theQueue.insert(v2);
            }
        }

        for (int j = 0;j<nVerts;j++){
            vertexList[j].wasVisited = false;
        }
    }

    public int getAdjUnvisitedVertex(int v){
        for (int j=0;j<nVerts;j++){
            if (adjMat[v][j] == 1 && vertexList[j].wasVisited == false){
                return j;
            }
        }
        return -1;
    }

}
