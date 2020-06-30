package com.cursor.oop;

import com.cursor.oop.shapes.*;
import com.cursor.oop.shapes.base.Shape;
import com.cursor.oop.vertex.Vertex2D;
import com.cursor.oop.vertex.Vertex3D;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Triangle(new Vertex2D(1,1),new Vertex2D(2,4),new Vertex2D(5,6)));
        shapes.add(new Rectangle(new Vertex2D(1,2),4,5));
        shapes.add(new Circle(new Vertex2D(1,3),3));
        shapes.add(new SquarePyramid(new Vertex3D(1,3,2),3,2));
        shapes.add(new SquarePyramid(new Vertex3D(1,3,2),3,2));
        shapes.add(new Cuboid(new Vertex3D(2,3,4),2,3,5));
        shapes.add(new Sphere(new Vertex3D(2,3,4),2));

        for (Shape shape:shapes) {
            System.out.println(shape);
        }
    }
}
