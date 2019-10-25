package FX;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;


public class MyUnion {
    public static Shape union(){
        Circle circle1 = new Circle();
        circle1.setCenterX(250.0f);
        circle1.setCenterY(135.0f);
        circle1.setRadius(100.0f);
        circle1.setFill(Color.DARKORANGE);

        Circle circle2 = new Circle();
        circle2.setCenterX(350.0f);
        circle2.setCenterY(135.0f);
        circle2.setRadius(100.0f);
        circle2.setFill(Color.BLUE);

        Shape shape = Shape.union(circle1, circle2);
        shape.setFill(Color.DARKSLATEBLUE);

        return shape;
    }
    public static Shape intersect(){
        Circle circle1 = new Circle();
        circle1.setCenterX(250.0f);
        circle1.setCenterY(135.0f);
        circle1.setRadius(100.0f);
        circle1.setFill(Color.DARKSLATEBLUE);

        Circle circle2 = new Circle();
        circle2.setCenterX(350.0f);
        circle2.setCenterY(135.0f);
        circle2.setRadius(100.0f);
        circle2.setFill(Color.BLUE);

        Shape shape = Shape.intersect(circle1, circle2);
        shape.setFill(Color.DARKSLATEBLUE);
        return shape;
    }
    public static Shape substract(){
        Circle circle1 = new Circle();
        circle1.setCenterX(250.0f);
        circle1.setCenterY(135.0f);
        circle1.setRadius(100.0f);
        circle1.setFill(Color.DARKSLATEBLUE);

        Circle circle2 = new Circle();
        circle2.setCenterX(350.0f);
        circle2.setCenterY(135.0f);
        circle2.setRadius(100.0f);
        circle2.setFill(Color.BLUE);

        Shape shape = Shape.subtract(circle1, circle2);
        shape.setFill(Color.DARKSLATEBLUE);

        return shape;
    }
    public static Group getGroup() {

        return new Group(substract());
    }
}
