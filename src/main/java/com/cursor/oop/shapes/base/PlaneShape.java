package com.cursor.oop.shapes.base;

import com.cursor.oop.interfaces.AreaMeasurable;
import com.cursor.oop.interfaces.PerimeterMeasurable;
import com.cursor.oop.vertex.Vertex;

import java.util.List;

public abstract class PlaneShape extends Shape implements AreaMeasurable, PerimeterMeasurable {

   protected  List<Vertex> vertex2D;

    public PlaneShape(List<Vertex> vertex2D, String name) {
        super(vertex2D, name);
        this.vertex2D = vertex2D;
    }
}
