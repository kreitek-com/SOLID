package com.kreitek.isp.shapes.mal;

public class Circle implements GeometricalShape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        throw new RuntimeException("No válido");
    }
}
