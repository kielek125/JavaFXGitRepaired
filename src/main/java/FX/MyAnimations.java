package FX;

import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.Transition;
import javafx.animation.TranslateTransition;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.util.Duration;

public class MyAnimations {
    public static Polygon getAnimatedPolygon(){
        Polygon hexagon  = new Polygon();
        hexagon.getPoints().addAll(200.0, 50.0,
                400.0, 50.0,
                450.0, 150.0,
                400.0, 250.0,
                200.0, 250.0,
                150.0, 150.0);
        hexagon.setFill(Color.BLUE);

        RotateTransition rotateTransition = new RotateTransition();
        //czas obrotu
        rotateTransition.setDuration(Duration.millis(2000));
        rotateTransition.setNode(hexagon);
        //o ile stopni ma się obrócić
        rotateTransition.setByAngle(360);
        //ile razy ma się obrócić
        rotateTransition.setCycleCount(50);
        rotateTransition.setAutoReverse(false);
        rotateTransition.play();

        //Transition trs = new Tra

        return hexagon;
    }

    public static Circle getAnimatedCircle(){
        Circle circle = new Circle();
        circle.setCenterX(300.0f);
        circle.setCenterY(135.0f);
        circle.setRadius(50.0f);
        circle.setFill(Color.GREEN);

        ScaleTransition scaleTransition = new ScaleTransition();
        scaleTransition.setDuration(Duration.millis(2000));
        scaleTransition.setNode(circle);
        scaleTransition.setByY(1.5);
        scaleTransition.setByX(1.5);
        scaleTransition.setCycleCount(50);
        scaleTransition.setAutoReverse(false);
        scaleTransition.play();

        return circle;
    }

    public static Circle getAnimatedTransCircle(){
        Circle circle = new Circle();
        circle.setCenterX(150.0f);
        circle.setCenterY(135.0f);
        circle.setRadius(100.0f);
        circle.setFill(Color.GREEN);

        TranslateTransition translateTransition = new TranslateTransition();
        translateTransition.setDuration(Duration.millis(2000));
        translateTransition.setNode(circle);
        translateTransition.setByX(300);
        translateTransition.setCycleCount(50);
        translateTransition.setAutoReverse(false);
        translateTransition.play();

        return circle;
    }

    public static Group getGroup(){
        return new Group(getAnimatedTransCircle());
    }
}
