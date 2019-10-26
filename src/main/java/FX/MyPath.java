package FX;

import javafx.scene.Group;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;

public class MyPath {
    public static Path getPath(){

        Path path = new Path();

        MoveTo moveTo = new MoveTo(108, 71);

        LineTo line1 = new LineTo(321, 161);

        LineTo line2 = new LineTo(126,232);

        LineTo line3 = new LineTo(232,52);

        LineTo line4 = new LineTo(269, 250);

        LineTo line5 = new LineTo(108, 71);


        path.getElements().add(moveTo);
        path.getElements().addAll(line1, line2, line3, line4, line5);

        return path;
    }
    public static Path getPath2(){
        Path path = new Path();
        MoveTo moveTo = new MoveTo(50, 50);
        LineTo line1 = new LineTo(150, 150);
        LineTo line2 = new LineTo(550,75);
        LineTo line3 = new LineTo(550,350);
        LineTo line4 = new LineTo(50, 250);
        LineTo line5 = new LineTo(50, 50);
        path.getElements().add(moveTo);
        path.getElements().addAll(line1, line2, line3, line4, line5);
        return path;
    }
    public static Group getGroup(){
        return new Group(getPath2());
    }
}
