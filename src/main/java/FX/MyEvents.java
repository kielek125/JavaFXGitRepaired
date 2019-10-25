package FX;

import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class MyEvents {
    public static Group circleEvent(){
        Circle circle = new Circle();
        circle.setCenterX(300.0f);
        circle.setCenterY(135.0f);
        circle.setRadius(25.0f);
        circle.setFill(Color.BLACK);
        circle.setStrokeWidth(20);

        Text text = new Text("Kliknij w kółko i zobacz co się stanie :)");
        text.setFont(Font.font(null, FontWeight.BOLD, 15));
        text.setFill(Color.BLACK);
        text.setX(150);
        text.setY(50);

        EventHandler<MouseEvent> eventHandler = e -> {
            System.out.println("Hello World");
            circle.setFill(Color.DARKSLATEBLUE);
        };
        circle.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);

        return new Group(circle, text);
    }

    public static Group boxEvent(){
        Box box = new Box();
        box.setWidth(150.0);
        box.setHeight(150.0);
        box.setDepth(100.0);

        box.setTranslateX(350);
        box.setTranslateY(150);
        box.setTranslateZ(50);

        Text text = new Text("Najedź myszką na figurę, następnie kliknij.");
        text.setFont(Font.font(null, FontWeight.BOLD, 15));
        text.setFill(Color.BLACK);
        text.setX(20);
        text.setY(50);

        PhongMaterial material = new PhongMaterial();
        material.setDiffuseColor(Color.DARKSLATEBLUE);
        box.setMaterial(material);

        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setDuration(Duration.millis(1000));
        rotateTransition.setNode(box);
        rotateTransition.setAxis(Rotate.Y_AXIS);
        rotateTransition.setByAngle(360);
        rotateTransition.setCycleCount(50);
        rotateTransition.setAutoReverse(false);

        EventHandler<MouseEvent> eventHandlerTextField = event -> rotateTransition.play();

        box.addEventHandler(MouseEvent.MOUSE_ENTERED, eventHandlerTextField);

        EventHandler<MouseEvent> eventHandlerBox = e -> rotateTransition.stop();

        box.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, eventHandlerBox);

        return new Group(box, text);
    }

    public static Group circleEvent2(){
        Circle circle = new Circle();
        circle.setCenterX(300.0f);
        circle.setCenterY(135.0f);
        circle.setRadius(25.0f);
        circle.setFill(Color.BROWN);
        circle.setStrokeWidth(20);


        MoveTo moveTo = new MoveTo(208, 71);
        LineTo line1 = new LineTo(421, 161);
        LineTo line2 = new LineTo(226,232);
        LineTo line3 = new LineTo(332,52);
        LineTo line4 = new LineTo(369, 250);
        LineTo line5 = new LineTo(208, 71);

        Path path = new Path();
        path.getElements().add(moveTo);
        path.getElements().addAll(line1, line2, line3, line4, line5);

        PathTransition pathTransition = new PathTransition();
        pathTransition.setDuration(Duration.millis(1000));
        pathTransition.setNode(circle);
        pathTransition.setPath(path);
        pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition.setCycleCount(50);
        pathTransition.setAutoReverse(false);

        Rectangle playButton = new Rectangle();
        playButton.setX(260);
        playButton.setY(250);
        playButton.setWidth(20);
        playButton.setHeight(20);

        circle.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("Hello World");
                circle.setFill(Color.DARKSLATEBLUE);
            }
        });
        playButton.setOnMouseClicked((new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                System.out.println("Start");
                pathTransition.play();
            }
        }));

        Rectangle stopButton = new Rectangle();
        stopButton.setX(300);
        stopButton.setY(250);
        stopButton.setWidth(20.0f);
        stopButton.setHeight(20.0f);
        stopButton.setOnMouseClicked((new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                System.out.println("Stop");
                pathTransition.stop();
            }
        }));

        return new Group(circle, playButton, stopButton);
    }
    public static Group getGroup(){
        return new Group(circleEvent2());
    }
}
