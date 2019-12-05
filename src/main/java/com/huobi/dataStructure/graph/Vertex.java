package com.huobi.dataStructure.graph;

/**
 * @author wanyi
 * @version V1.0
 * 定义顶点对象
 * @Package com.huobi.dataStructure.map
 * @date 2019-11-29 15:56
 */
public class Vertex {
    public char label;
    public boolean wasVisited;

    public Vertex(char lab){
        label = lab;
        wasVisited = false;
    }
}
