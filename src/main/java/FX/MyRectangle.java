package FX;

import javafx.scene.Group;
import javafx.scene.shape.Rectangle;

public class MyRectangle {
    public static Rectangle getNormaleRectangle(){
        //Początek x, początek y, szerokość, wysokość
        Rectangle rec = new Rectangle();
        rec.setX(50);
        rec.setY(50);
        rec.setWidth(150);
        rec.setHeight(50);

        return rec;
    }
    public static Rectangle getRoundedRectangle(){
        Rectangle rectangle = new Rectangle();
        rectangle.setX(220.0f);
        rectangle.setY(50.0f);
        rectangle.setWidth(300.0f);
        rectangle.setHeight(150.0f);
        rectangle.setArcWidth(80.0);
        rectangle.setArcHeight(50.0);

        return rectangle;
    }
    public static Group getGroup() {

        return new Group(getNormaleRectangle(), getRoundedRectangle());

    }
}
