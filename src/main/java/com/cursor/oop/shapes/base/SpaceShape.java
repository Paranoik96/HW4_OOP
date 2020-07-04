package com.cursor.oop.shapes.base;

import com.cursor.oop.interfaces.AreaMeasurable;
import com.cursor.oop.interfaces.VolumeMeasurable;

import java.util.List;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {

    public SpaceShape(List vertex3D, String name) {
        super(vertex3D, name);
    }
}

