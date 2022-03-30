package com.kreitek.ocp.shapes.bien;

import java.awt.*;

public class Circle extends Shape {
    private Point center;
    private int radius;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        // Dibuja el círculo
    }
}
