package com.kreitek.ocp.shapes.mal;

import java.awt.*;

public class Square extends Shape {
    private Point topLeftCorner;
    private Point bootomRightCorner;

    public Point getTopLeftCorner() {
        return topLeftCorner;
    }

    public void setTopLeftCorner(Point topLeftCorner) {
        this.topLeftCorner = topLeftCorner;
    }

    public Point getBootomRightCorner() {
        return bootomRightCorner;
    }

    public void setBootomRightCorner(Point bootomRightCorner) {
        this.bootomRightCorner = bootomRightCorner;
    }
}
