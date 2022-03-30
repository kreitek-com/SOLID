package com.kreitek.ocp.shapes.bien;

import com.kreitek.ocp.shapes.ShapeType;
import java.util.List;

public class ShapeDrawer {

    public void drawAllShapes(List<Shape> shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

}
