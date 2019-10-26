package FX;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.paint.Material;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Translate;

public class MyTransformations {
    public static Rectangle getTransformRectangle(){

        Rectangle rectangle = new Rectangle(50, 50, 100, 75);
        rectangle.setFill(Color.RED);
        rectangle.setStroke(Color.BLACK);

        // roatacja, zmiana powoduje obrócenie figury o pewien kąt
        Rotate rotate = new Rotate();
        rotate.setAngle(30);
        rotate.setPivotX(150);
        rotate.setPivotY(225);
        //rotate.setPivotZ(75);

        //zmiana skali figury
        Scale scale = new Scale();
        scale.setX(2);
        scale.setY(2);
        scale.setPivotX(50);
        scale.setPivotY(50);

        //zmiana położenia figury
        Translate translate = new Translate();
        translate.setX(250);
        translate.setY(30);
        translate.setZ(0);

        rectangle.getTransforms().addAll(translate);

        return rectangle;
    }

    public static Group getTransformBox(){
        Box box = new Box();
        box.setWidth(100.0);
        box.setHeight(150.0);
        box.setDepth(200.0);
        box.setLayoutX(250);
        box.setLayoutY(220);
        Box box2 = new Box();
        box2.setWidth(100.0);
        box2.setHeight(150.0);
        box2.setDepth(200.0);
        box2.setLayoutX(250);
        box2.setLayoutY(220);

        PhongMaterial phongMaterial = new PhongMaterial();
        PhongMaterial phongMaterial2 = new PhongMaterial();
        phongMaterial.setDiffuseColor(Color.RED);
        phongMaterial2.setDiffuseColor(Color.YELLOW);
        box.setMaterial(phongMaterial);
        box2.setMaterial(phongMaterial2);
        Translate translate = new Translate();
        translate.setX(400);
        translate.setY(250);
        translate.setZ(25);

        Rotate rxBox = new Rotate(30,0,0,0,Rotate.X_AXIS);
        Rotate ryBox = new Rotate(30,0,0,0,Rotate.Y_AXIS);
        Rotate rzBox = new Rotate(90,-50,-75,0,Rotate.Z_AXIS);

        box.getTransforms().addAll(rzBox);

        return new Group(box, box2);
    }

    public static Group getGroup(){
        return new Group(getTransformBox());
    }
}
