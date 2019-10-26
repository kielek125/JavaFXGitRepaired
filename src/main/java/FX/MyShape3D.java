package FX;

import javafx.scene.Group;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Mesh;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;

public class MyShape3D {
    public static Box getBox(){
        Box box = new Box();

        box.setWidth(150.0);
        box.setHeight(100.0);
        box.setDepth(80.0);

        Rotate rxBox = new Rotate(30,0,0,0,Rotate.X_AXIS);
        Rotate ryBox = new Rotate(30,0,0,0,Rotate.Y_AXIS);
        Rotate rzBox = new Rotate(10,0,0,0,Rotate.Z_AXIS);

        Translate translate = new Translate(200,150,25);

        box.getTransforms().addAll(rxBox, ryBox, rzBox,translate);

        return box;
    }

    public static Cylinder getCylinder(){
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(200.0f);
        cylinder.setRadius(50.0f);

        Rotate rxBox = new Rotate(30,0,0,0,Rotate.X_AXIS);
        Rotate ryBox = new Rotate(30,0,0,0,Rotate.Y_AXIS);
        Rotate rzBox = new Rotate(10,0,0,0,Rotate.Z_AXIS);

        Translate translate = new Translate(200,150,25);

        cylinder.getTransforms().addAll(rxBox, ryBox, rzBox,translate);

        return cylinder;
    }
    public static Sphere getSphere(){
        Sphere sphere = new Sphere(50);
        sphere.setTranslateX(100);
        sphere.setTranslateY(150);

        Translate translate = new Translate(100,100,25);

        sphere.getTransforms().addAll(translate);

        return sphere;
    }
    public static Group getGroup() {
        return new Group(getSphere(),getBox(),getCylinder());
    }
}
