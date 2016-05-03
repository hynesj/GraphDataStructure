package com.example.hynesj.graphdatastructure;

/**
 * Created by hynesj on 5/2/16.
 */
public class GraphEdge
{
    private City origin;
    private City destination;
    private double weight;

    public GraphEdge(City city1, City city2, double weight)
    {
        origin = city1;
        destination = city2;
        this.weight = weight;
    }

    public City getOrigin()
    {
        return origin;
    }
    public City getDestination()
    {
        return destination;
    }
}
