package FX;

import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Shape;

public class MyCircle {
    public static Circle getCircle(){
        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(50);

        return circle;
    }

    public static Ellipse getEllipse(){
        Ellipse ellipse = new Ellipse();
        ellipse.setCenterX(300);
        ellipse.setCenterY(100);
        ellipse.setRadiusX(80);
        ellipse.setRadiusY(50);

        return ellipse;
    }

    public static Group getGroup(){
        return new Group(getCircle(), getEllipse());
    }
}
