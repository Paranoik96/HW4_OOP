package com.cursor.oop.shapes.base;

import com.cursor.oop.vertex.Vertex;

import java.util.List;

public  class Shape {
    private final List<Vertex> vertex;
    private final String name;

    public Shape(List<Vertex> vertex, String name) {
        this.vertex = vertex;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "vertex=" + vertex +
                ", name='" + name + '\'' +
                '}';
    }
}
