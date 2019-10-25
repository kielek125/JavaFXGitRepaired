package FX;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Translate;

public class MyTransformations {
    public static Rectangle getTransformRectangle(){

        Rectangle rectangle = new Rectangle(50, 50, 100, 75);
        rectangle.setFill(Color.BURLYWOOD);
        rectangle.setStroke(Color.BLACK);

        // roatacja, zmiana powoduje obrócenie figury o pewien kąt
        Rotate rotate = new Rotate();
        rotate.setAngle(30);
        rotate.setPivotX(150);
        rotate.setPivotY(225);
        //rotate.setPivotZ(75);

        //zmiana skali figury
        Scale scale = new Scale();
        scale.setX(1.5);
        scale.setY(1.5);
        scale.setPivotX(300);
        scale.setPivotY(135);

        //zmiana położenia figury
        Translate translate = new Translate();
        translate.setX(250);
        translate.setY(30);
        translate.setZ(0);

        rectangle.getTransforms().addAll(rotate,scale,translate);

        return rectangle;
    }

    public static Box getTransformBox(){
        Box box = new Box();
        box.setWidth(100.0);
        box.setHeight(150.0);
        box.setDepth(200.0);

        Translate translate = new Translate();
        translate.setX(200);
        translate.setY(150);
        translate.setZ(25);

        Rotate rxBox = new Rotate(0,0,0,0,Rotate.X_AXIS);
        Rotate ryBox = new Rotate(0,0,0,0,Rotate.Y_AXIS);
        Rotate rzBox = new Rotate(0,0,0,0,Rotate.Z_AXIS);
        rxBox.setAngle(30);
        ryBox.setAngle(30);
        rzBox.setAngle(10);

        box.getTransforms().addAll(translate, rxBox, ryBox, rzBox);

        return box;
    }

    public static Group getGroup(){
        return new Group(getTransformRectangle(), getTransformBox());
    }
}
