package com.cursor.oop.shapes;

import com.cursor.oop.shapes.base.SpaceShape;
import com.cursor.oop.vertex.Vertex3D;

import java.util.List;

public class Sphere extends SpaceShape {
    private final double radius;

    public Sphere(Vertex3D vertex3D, double radius) {
        super(List.of(vertex3D), "Sphere");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Sphere: " + "\n" +
                "radius = " + radius + "\n" +
                "Area : " + getArea() + "\n" +
                "Volume: " + getVolume() + "\n";
    }
}
