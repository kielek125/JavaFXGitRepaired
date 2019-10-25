package FX;

import javafx.scene.Group;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;

public class MyPolygon {
    public static Polygon getHexagon() {
        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(200.0, 50.0,
                400.0, 50.0,
                450.0, 150.0,
                400.0, 250.0,
                200.0, 250.0,
                150.0, 150.0);

        return polygon;
    }
    public static Polyline getPolyline() {
        Polyline polygon = new Polyline();
        polygon.getPoints().addAll(200.0, 50.0,
                400.0, 50.0,
                450.0, 150.0,
                400.0, 250.0,
                200.0, 250.0,
                150.0, 150.0);

        return polygon;
    }

    public static Group getGroup() {

        return new Group(getPolyline());

    }
}
