package com.kreitek.ocp.shapes.bien;

import java.awt.*;

public class Triangle extends Shape {

    // Campos para el triángulo
    private Point punto1;
    private Point punto2;
    private Point punto3;

    public Point getPunto1() {
        return punto1;
    }

    public void setPunto1(Point punto1) {
        this.punto1 = punto1;
    }

    public Point getPunto2() {
        return punto2;
    }

    public void setPunto2(Point punto2) {
        this.punto2 = punto2;
    }

    public Point getPunto3() {
        return punto3;
    }

    public void setPunto3(Point punto3) {
        this.punto3 = punto3;
    }

    @Override
    public void draw() {
        // Dibuja el triángulo
    }
}
