package com.cursor.oop.shapes;

import com.cursor.oop.shapes.base.PlaneShape;
import com.cursor.oop.vertex.Vertex2D;

import java.util.List;

public class Triangle extends PlaneShape {
    private final Vertex2D FirstVertex2D;
    private final Vertex2D SecondVertex2D;
    private final Vertex2D ThirdVertex2DT;
    private final double ab;
    private final double bc;
    private final double ac;


    public Triangle(Vertex2D a, Vertex2D b, Vertex2D c) {
        super(List.of(a, b, c), "Triangle");
        this.FirstVertex2D = a;
        this.SecondVertex2D = b;
        this.ThirdVertex2DT = c;
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
        return "Triangle: " + "\n"
                + FirstVertex2D + "\n"
                + SecondVertex2D + "\n"
                + ThirdVertex2DT + "\n"
                + "AB = " + ab + "\n"
                + "BC =" + bc + "\n"
                + "AC = " + ac + "\n"
                + "Area : " + getArea() + "\n"
                + "Perimeter : " + getPerimeter() + "\n";
    }
}
