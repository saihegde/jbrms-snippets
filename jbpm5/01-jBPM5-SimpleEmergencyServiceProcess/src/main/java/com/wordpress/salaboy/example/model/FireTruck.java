package com.wordpress.salaboy.example.model;

/**
 * Created by IntelliJ IDEA.
 * User: salaboy
 * Date: 2/14/11
 * Time: 8:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class FireTruck implements Vehicle{
    private String name;
    private long id;

    public FireTruck(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return "FireTruck";
    }

    @Override
    public String toString() {
        return "FireTruck{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
