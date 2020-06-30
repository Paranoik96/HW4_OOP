package com.cursor.oop.shapes.base;

import com.cursor.oop.interfaces.AreaMeasurable;
import com.cursor.oop.interfaces.VolumeMeasurable;
import com.cursor.oop.vertex.Vertex;

import java.util.List;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {
    protected List<Vertex> vertex3D;

    public SpaceShape(List<Vertex> vertex3D, String name) {
        super(vertex3D, name);
        this.vertex3D = vertex3D;
    }
}

