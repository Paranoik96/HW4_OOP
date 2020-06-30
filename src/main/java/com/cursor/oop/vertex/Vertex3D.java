package com.cursor.oop.vertex;

public class Vertex3D extends Vertex{

    private final double x;
    private final double y;
    private final double z;

    public Vertex3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double getDistance(Vertex3D a, Vertex3D b, Vertex3D c) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2)
                + Math.pow(a.getY() - b.getY(), 2)
                + Math.pow(c.getZ() - c.getZ(), 2));
    }

    @Override
    public String toString() {
        return "Vertices in 3D is : " +
                "x=" + x +
                ", y=" + y +
                ", z=" + z ;
    }
}
