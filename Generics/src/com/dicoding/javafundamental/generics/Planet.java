package com.dicoding.javafundamental.generics;

public class Planet {
    private String name;
    private Double mass;

    public Planet(String name, Double mass) {
        this.name = name;
        this.mass = mass;
    }

    public void print() {
        System.out.println("Planet " + name + ", mass : " + mass);
    }
}
