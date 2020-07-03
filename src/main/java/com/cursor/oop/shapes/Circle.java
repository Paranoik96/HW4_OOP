package com.cursor.oop.shapes;

import com.cursor.oop.shapes.base.PlaneShape;
import com.cursor.oop.vertex.Vertex2D;

import java.util.List;

public class Circle extends PlaneShape {

    private final double radius;

    public Circle(Vertex2D vertex2D, double radius) {
        super(List.of(vertex2D), "Circle");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle: " + "\n" +
                "radius= " + radius + "\n"
                + "Area : " + getArea() + "\n"
                + "Perimeter : " + getPerimeter()+"\n";
    }
}
