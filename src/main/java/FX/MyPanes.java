package FX;

import javafx.animation.RotateTransition;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Sphere;
import javafx.scene.text.*;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class MyPanes {
    public static HBox myHBOX(){
        TextField textField = new TextField();
        Button playButton = new Button("Play");
        Button stopButton = new Button("stop");
        HBox hbox = new HBox();
        //HBox.setMargin(textField, new Insets(20, 20, 20, 20));
        //HBox.setMargin(playButton, new Insets(20, 20, 20, 20));
        HBox.setMargin(stopButton, new Insets(20, 20, 20, 20));

        ObservableList list = hbox.getChildren();
        list.addAll(playButton,textField, stopButton);

        return hbox;
    }

    public static VBox myVBOX(){
        TextField textField = new TextField();
        Button playButton = new Button("Play");
        Button stopButton = new Button("stop");

        VBox vbox = new VBox();
        vbox.setSpacing(10);
        VBox.setMargin(textField, new Insets(20, 20, 20, 20));
        VBox.setMargin(playButton, new Insets(20, 20, 20, 20));
        VBox.setMargin(stopButton, new Insets(20, 20, 20, 20));

        ObservableList list = vbox.getChildren();
        list.addAll(textField, playButton, stopButton);

        return vbox;
    }

    public static BorderPane myBorderPane(){
        BorderPane bPane = new BorderPane();

        bPane.setTop(new TextField("Top"));
        bPane.setBottom(new TextField("Bottom"));
        bPane.setLeft(new TextField("Left"));
        bPane.setLeft(new TextField("Left2"));
        bPane.setRight(new TextField("Right"));
        bPane.setCenter(new TextField("Center"));
        bPane.setCenter(new TextField("Centre2"));
        return bPane;
    }

    public static StackPane myStackPane(){
        Circle circle = new Circle(200, 135, 100);
        circle.setFill(Color.DARKSLATEBLUE);
        circle.setStroke(Color.BLACK);

        Sphere sphere = new Sphere(50);

        Text text = new Text("Hej");
        text.setFont(Font.font(null, FontWeight.BOLD, 15));
        text.setFill(Color.BLUE);

        StackPane stackPane = new StackPane();
        stackPane.setMargin(circle, new Insets(50, 50, 50, 50));

        ObservableList list = stackPane.getChildren();
        list.addAll(circle, sphere, text);

        return stackPane;
    }

    public static TextFlow myTextFlow(){
        Text text1 = new Text("Welcome to Tutorialspoint ");
        text1.setFont(new Font(15));
        text1.setFill(Color.DARKSLATEBLUE);
        Text text2 = new Text("We provide free tutorials for readers in various technologies  ");
        text2.setFont(new Font(15));
        text2.setFill(Color.DARKGOLDENROD);
        Text text3 = new Text("\n Recently we started free video tutorials too ");
        text3.setFont(new Font(15));
        text3.setFill(Color.DARKGRAY);
        Text text4 = new Text("We believe in easy learning");
        text4.setFont(new Font(15));
        text4.setFill(Color.MEDIUMVIOLETRED);

        TextFlow textFlowPane = new TextFlow();
        ObservableList list = textFlowPane.getChildren();
        list.addAll(text1, text2, text3, text4, new Circle(23,45,45));

        return textFlowPane;
    }

    public static AnchorPane myAnchorPane(){
        Cylinder cylinder = new Cylinder();

        cylinder.setHeight(180.0f);
        cylinder.setRadius(100.0f);

        PhongMaterial material = new PhongMaterial();
        material.setDiffuseColor(Color.BLANCHEDALMOND);

        cylinder.setMaterial(material);

        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setDuration(Duration.millis(1000));
        rotateTransition.setNode(cylinder);
        rotateTransition.setAxis(Rotate.X_AXIS);
        rotateTransition.setByAngle(360);
        rotateTransition.setCycleCount(RotateTransition.INDEFINITE);
        rotateTransition.setAutoReverse(false);
        rotateTransition.play();

        AnchorPane anchorPane = new AnchorPane();
        AnchorPane.setTopAnchor(cylinder, 250.0);
        AnchorPane.setLeftAnchor(cylinder, 50.0);

        ObservableList list = anchorPane.getChildren();
        list.addAll(cylinder);

        return anchorPane;
    }

    public static TilePane myTilePane(){
        Button[] buttons = new Button[] {
                new Button("Sunday"),
                new Button("Monday"),
                new Button("Tuesday"),
                new Button("Wednesday"),
                new Button("Thursday"),
                new Button("Friday"),
                new Button("Saturday")
        };
        TilePane tilePane = new TilePane();
        tilePane.setOrientation(Orientation.HORIZONTAL);
        tilePane.setTileAlignment(Pos.CENTER);
        tilePane.setPrefTileWidth(140);
        ObservableList list = tilePane.getChildren();
        list.addAll(buttons);

        return tilePane;
    }

    public static FlowPane myFlowPane(){
        Button[] buttons = new Button[] {
                new Button("1"),
                new Button("2"),
                new Button("3"),
                new Button("4"),
                new Button("5"),
                new Button("6"),
                new Button("7"),
                new Button("8"),
                new Button("8"),
                new Button("8"),
                new Button("8"),
                new Button("8"),
                new Button("8"),
                new Button("8"),
                new Button("8"),
                new Button("8"),
                new Button("8"),
                new Button("8"),
                new Button("8"),
                new Button("8"),
                new Button("8"),
                new Button("8"),
                new Button("8"),
                new Button("8"),
                new Button("8"),
                new Button("8"),
                new Button("8"),
        };
        FlowPane flowPane = new FlowPane();
        flowPane.setHgap(10);
       // flowPane.setMargin(button1, new Insets(20, 0, 20, 20));
        ObservableList list = flowPane.getChildren();
        list.addAll(buttons);

        return flowPane;

    }
}
