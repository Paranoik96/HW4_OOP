package com.cursor.oop.vertex;

public class Vertex2D{
    private final double x;
    private final double y;

    public Vertex2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
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
