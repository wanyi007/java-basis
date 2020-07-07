package com.huobi.dataStructure.graph;

/**
 * @author wanyi
 * @version V1.0
 * 带权图
 * @Package com.huobi.dataStructure.graph
 * @date 2019-12-05 13:55
 */
public class Edge {
    public int srcVert;
    public int destVert;
    public int distance;

    public Edge(int sv,int dv,int d){
        srcVert = sv;
        destVert = dv;
        distance = d;
    }

}
