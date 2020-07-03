package com.cursor.oop.vertex;

public class Vertex2D extends Vertex {
    public Vertex2D(double x, double y) {
        super(x, y);
    }

    public Vertex2D(double x, double y, double z) {
        super(x, y, z);
    }

    @Override
    public double getX() {
        return super.getX();
    }

    @Override
    public double getY() {
        return super.getY();
    }

    @Override
    public double getZ() {
        return super.getZ();
    }

    public double getDistance(Vertex2D a, Vertex2D b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2)
                + Math.pow(a.getY() - b.getY(), 2));
    }

    @Override
    public String toString() {
        return "Vertices in 2D is : " +
                "x=" + getX() +
                ", y=" + getY();
    }
}
