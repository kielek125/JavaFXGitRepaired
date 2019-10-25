package FX;

import javafx.scene.Group;
import javafx.scene.shape.Line;

public class MyLine {
    public static Line getLine1(){
        Line line = new Line();
        line.setStartX(100.0);
        line.setStartY(50.0);
        line.setEndX(400.0);
        line.setEndY(150.0);

        return line;
    }
    public static Line getLine2(){
        Line line = new Line();
        line.setStartX(100.0);
        line.setStartY(150.0);
        line.setEndX(400.0);
        line.setEndY(50.0);

        return line;
    }
    public static Line getLine3(){
        Line line = new Line();
        line.setStartX(100.0);
        line.setStartY(50.0);
        line.setEndX(100.0);
        line.setEndY(150.0);

        return line;
    }
    public static Line getLine4(){
        Line line = new Line();
        line.setStartX(100.0);
        line.setStartY(50.0);
        line.setEndX(400.0);
        line.setEndY(50.0);

        return line;
    }
    public static Line getLine5(){
        Line line = new Line();
        line.setStartX(400.0);
        line.setStartY(50.0);
        line.setEndX(400.0);
        line.setEndY(150.0);

        return line;
    }
    public static Line getLine6(){
        Line line = new Line();
        line.setStartX(100.0);
        line.setStartY(150.0);
        line.setEndX(400.0);
        line.setEndY(150.0);

        return line;
    }
    public static Line getLine7(){
        Line line = new Line();
        line.setStartX(250.0);
        line.setStartY(50.0);
        line.setEndX(250.0);
        line.setEndY(100.0);

        return line;
    }
    public static Group getGroup(){
        return new Group(getLine1(), getLine2(), getLine3(),getLine4(),getLine5(),getLine6(),getLine7());
    }
}
