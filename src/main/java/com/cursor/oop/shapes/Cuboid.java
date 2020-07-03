package com.cursor.oop.shapes;

import com.cursor.oop.shapes.base.SpaceShape;

import com.cursor.oop.vertex.Vertex3D;

import java.util.List;

public class Cuboid extends SpaceShape {

    private final int width;
    private final int height;
    private final int depth;

    public Cuboid(Vertex3D vertex3D, int width, int height, int depth) {
        super(List.of(vertex3D), "Cuboid");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double getArea() {
        return 2 * ((width * height) + (width * depth) + (height * depth));
    }

    @Override
    public double getVolume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return "Cuboid: " + "\n" +
                "width=" + width + "\n" +
                "height=" + height + "\n" +
                "depth=" + depth + "\n" +
                "Area : " + getArea() + "\n" +
                "Volume: " + getVolume() + "\n";
    }
}
