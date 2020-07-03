package com.cursor.oop.shapes;

import com.cursor.oop.shapes.base.PlaneShape;
import com.cursor.oop.vertex.Vertex2D;

import java.util.List;

public class Triangle extends PlaneShape {
    private final double ab;
    private final double bc;
    private final double ac;

    public Triangle(Vertex2D a, Vertex2D b, Vertex2D c) {
        super(List.of(a, b, c), "Triangle");
        this.ab = a.getDistance(a, b);
        this.bc = b.getDistance(b, c);
        this.ac = c.getDistance(a, c);
    }

    @Override
    public double getArea() {
        double p = (ab + bc + ac) / 2.0;
        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
    }

    @Override
    public double getPerimeter() {
        return ab + bc + ac;
    }

    @Override
    public String toString() {
        return "Triangle: "+ "\n"
                + "AB = " + ab + "\n"
                + "BC =" + bc + "\n"
                + "AC = " + ac + "\n"
                + "Area : " + getArea() + "\n"
                + "Perimeter : " + getPerimeter() + "\n";
    }
}
