package com.cursor.oop.shapes;

import com.cursor.oop.shapes.base.SpaceShape;
import com.cursor.oop.vertex.Vertex3D;

import java.util.List;

public class SquarePyramid extends SpaceShape {

    private final int baseWidth;
    private final int height;

    public SquarePyramid(Vertex3D vertex3D, int baseWidth, int height) {
        super(List.of(vertex3D), "SquarePyramid");
        this.baseWidth = baseWidth;
        this.height = height;
    }

    @Override
    public double getArea() {
        return Math.pow(baseWidth, 2)
                + (2 * baseWidth
                * Math.sqrt((Math.pow(baseWidth, 2) / 4)
                + Math.pow(height, 2)));
    }

    @Override
    public double getVolume() {
        return Math.pow(height, 2) * (baseWidth / 3.0);
    }

    @Override
    public String toString() {
        return "SquarePyramid: " + "\n" +
                "baseWidth=" + baseWidth + "\n" +
                "height=" + height + "\n" +
                "Area : " + getArea() + "\n" +
                "Volume: " + getVolume() + "\n";
    }
}
