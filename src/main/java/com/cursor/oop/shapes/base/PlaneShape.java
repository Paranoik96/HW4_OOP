package com.cursor.oop.shapes.base;

import com.cursor.oop.interfaces.AreaMeasurable;
import com.cursor.oop.interfaces.PerimeterMeasurable;

import java.util.List;

public abstract class PlaneShape extends Shape implements AreaMeasurable, PerimeterMeasurable {

    public PlaneShape(List vertex2D, String name) {
        super(vertex2D, name);
    }
}
