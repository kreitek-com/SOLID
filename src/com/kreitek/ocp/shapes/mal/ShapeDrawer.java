package com.kreitek.ocp.shapes.mal;

import com.kreitek.ocp.shapes.ShapeType;

import java.util.List;

public class ShapeDrawer {

    public void drawAllShapes(List<Shape> shapes) {
        for (Shape shape : shapes) {
            if (shape.getShapeType() == ShapeType.CIRCLE) {
                drawCircle((Circle) shape);
            } else if (shape.getShapeType() == ShapeType.SQUARE) {
                drawSquare((Square) shape);
            }
        }
    }

    private void drawSquare(Square shape) {
        // Dibuja el cuadrado
    }

    private void drawCircle(Circle shape) {
        // Dibuja el círculo
    }

}
