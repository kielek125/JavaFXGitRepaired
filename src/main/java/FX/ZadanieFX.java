package FX;

import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;


public class ZadanieFX {
    public static Box zadanie1() {
        //Utworz obike box koloru pomaranczowego. Po najechaniu myszka spraw aby sie obracał.
        //Po opuszczeniu kursorem boxa spraw aby sie zatrzymał.
        Box box = new Box();
        box.setWidth(150.0);
        box.setHeight(150.0);
        box.setDepth(100.0);

        box.setTranslateX(350);
        box.setTranslateY(150);
        box.setTranslateZ(150);

        PhongMaterial material = new PhongMaterial();
        material.setDiffuseColor(Color.ORANGE);
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

        box.addEventHandler(MouseEvent.MOUSE_EXITED, eventHandlerBox);

        return box;
    }

    public static Circle zadanie2(Stage stage) {
        Path path = new Path();
        MoveTo moveTo = new MoveTo(50, 50);
        LineTo line1 = new LineTo(150, 150);
        LineTo line2 = new LineTo(550, 75);
        LineTo line3 = new LineTo(550, 350);
        LineTo line4 = new LineTo(50, 250);
        LineTo line5 = new LineTo(50, 50);
        path.getElements().add(moveTo);
        path.getElements().addAll(line1, line2, line3, line4, line5);

        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(50);

        PathTransition pathTransition = new PathTransition();
        pathTransition.setDuration(Duration.millis(1000));
        pathTransition.setNode(circle);
        pathTransition.setPath(path);
        pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition.setCycleCount(50);
        pathTransition.setAutoReverse(false);

        stage.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
            if (event.getCode() == KeyCode.SPACE) {
                pathTransition.play();
            }
            if (event.getCode() == KeyCode.SHIFT) {
                pathTransition.stop();
            }
        });

        return circle;
    }

    public static Rectangle zadanie3(Stage stage) {
        //Napisz program w którym pojawi się obiekt rectangle o wymiarach 400 na 100;
        //Po każdorazowym kliknięciu w spacje usuń 1/4 początkowej wartości figury.
        Rectangle rectangle = new Rectangle(50, 50, 400, 100);
        final double initialWidth = rectangle.getWidth();
        stage.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            // event.getY
        });
        return rectangle;
    }

    public static void zadanie4(Stage stage, Group group) {
        //Napisz program który maluje kółeczka tam gdzie kliknąłeś myszką :)
        stage.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            Circle circle = new Circle(event.getX(), event.getY(), 20);
            circle.setFill(Color.BLUE);
            stage.addEventHandler(KeyEvent.KEY_PRESSED, event1 -> {
                if (event1.getCode() == KeyCode.SHIFT) {
                    circle.setFill(Color.RED);
                }
            });
            group.getChildren().add(circle);
        });
    }

    public static void zadanie04(Stage stage, Group group) {
        stage.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
            Circle circle = new Circle();
            circle.setCenterX(mouseEvent.getSceneX());
            circle.setCenterY(mouseEvent.getSceneY());
            circle.setRadius(5);
            circle.setFill(Color.DARKGREEN);
            stage.addEventHandler(MouseEvent.MOUSE_DRAGGED, mouseEvent1 -> circle.setCenterX(circle.getCenterX() + 1));
            group.getChildren().add(circle);
        });
    }

    public static Group zadanko1() {
        //Zadanie 1, korzystamy ze slider, tworzymy dwie labelki pokazujace wartosc minimalna i maksymalna
        //oraz pole tekstowe pokazujace aktualna wartosc ze slidera z przedzialu 1 do 100;
        Slider slider = new Slider();
        slider.setMin(1.0);
        slider.setMax(100.0);
        Label label1 = new Label(slider.getMin() + "");
        Label label2 = new Label(slider.getMax() + "");

        TextField result = new TextField("Result here");

        //POSITIONING
        label1.setLayoutX(50);
        label1.setLayoutY(100);

        slider.setLayoutX(120);
        slider.setLayoutY(100);
        slider.setScaleX(1.5);

        label2.setLayoutX(300);
        label2.setLayoutY(100);

        result.setLayoutX(100);
        result.setLayoutY(200);
        result.setScaleX(2.0);
        result.setScaleY(2.0);

        //HERE IT HAPPENS
        slider.getValue();
        slider.valueProperty().addListener((observable, oldValue, newValue) -> {
            result.setText(newValue + "");
        });

        return new Group(label1,label2,result,slider);
    }
    public static GridPane zadanko2(){
        GridPane gridPane = new GridPane();
        TextField firstFiled = new TextField();
        TextField secondFiled = new TextField();
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("+", "-", "/", "*");
        Label resultLabel = new Label();

        Button button = new Button("Calculate");
        button.setOnAction(x -> {
            try {
                resultLabel.setText("");
                resultLabel.setText(Double.toString(operation(comboBox.getSelectionModel().getSelectedItem(),
                        Double.valueOf(firstFiled.getText()),
                        Double.valueOf(secondFiled.getText()))));
            }catch (Exception e){
                resultLabel.setText("Check input data");
            }
        });

        gridPane.add(firstFiled, 0, 0);
        gridPane.add(secondFiled, 1, 0);
        gridPane.add(comboBox, 2, 0);
        gridPane.add(button, 0, 1);
        gridPane.add(resultLabel, 0, 2);
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        return gridPane;
    }

    private static double operation(String operator, double a, double b) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "/":
                return a / b;
            case "*":
                return a * b;
            default:
                return 0;
        }
    }
    public static GridPane getGroup() {
        return zadanko2();
    }
}

