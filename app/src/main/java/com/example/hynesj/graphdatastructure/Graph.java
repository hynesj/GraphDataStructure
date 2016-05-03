package com.example.hynesj.graphdatastructure;

import java.util.LinkedList;

/**
 * Created by hynesj on 5/2/16.
 */
public class Graph
{
    private LinkedList<City> cities;
    private LinkedList<GraphEdge> edges;

    public Graph()
    {
        cities = null;
        edges = null;
    }

    public LinkedList<City> getCities()
    {
         return cities;
    }
    public LinkedList<GraphEdge> getEdges()
    {
        return edges;
    }
    public void addCity(String name)
    {
        cities.add(new City(name));
    }
}
