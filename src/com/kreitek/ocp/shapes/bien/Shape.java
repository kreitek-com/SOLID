package com.kreitek.ocp.shapes.bien;

import com.kreitek.ocp.shapes.ShapeType;

public abstract class Shape {
    private ShapeType shapeType;

    public ShapeType getShapeType() {
        return shapeType;
    }

    public void setShapeType(ShapeType shapeType) {
        this.shapeType = shapeType;
    }

    public abstract void draw();
}
