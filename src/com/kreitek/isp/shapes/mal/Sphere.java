package com.kreitek.isp.shapes.mal;

public class Sphere implements GeometricalShape {

    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        throw new RuntimeException("No válido");
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return 4 * Math.PI * Math.pow(radius, 3) / 3;
    }
}
