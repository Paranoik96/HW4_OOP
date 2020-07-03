package com.cursor.oop.vertex;

public class Vertex3D extends Vertex{

    public Vertex3D(double x, double y, double z) {
        super(x,y,z);
    }

    public Vertex3D(double x, double y) {
        super(x, y);
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

    public double getDistance(Vertex3D a, Vertex3D b, Vertex3D c) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2)
                + Math.pow(a.getY() - b.getY(), 2)
                + Math.pow(c.getZ() - c.getZ(), 2));
    }

    @Override
    public String toString() {
        return "Vertices in 3D is : " +
                "x=" + getX() +
                ", y=" + getY() +
                ", z=" + getZ() ;
    }
}
