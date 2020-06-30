package com.cursor.oop.shapes;

import com.cursor.oop.shapes.base.PlaneShape;
import com.cursor.oop.vertex.Vertex2D;
import java.util.List;


public class Rectangle extends PlaneShape {

    private final Vertex2D vertex2D;
    private final double width;
    private final double height;

    public Rectangle(Vertex2D vertex2D, double width, double height) {
        super(List.of(vertex2D), "Rectangle");
        this.vertex2D = vertex2D;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width+height)*2;
    }

    @Override
    public String toString() {
        return "Rectangle: " +"\n"+ vertex2D +
                "width = " + width + "\n"
                +"height = " + height + "\n"
                + "Area : " + getArea() + "\n"
                + "Perimeter : " + getPerimeter()+"\n";
    }
}
