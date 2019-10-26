package FX;

import javafx.application.Application;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.stage.Stage;

public class Start extends Application {


    public void start(Stage primaryStage) {

        //Utworz obike box koloru pomaranczowego. Po najechaniu myszka spraw aby sie obracał.
        //Po opuszczeniu kursorem boxa spraw aby sie zatrzymał.

        //Tworzymy obiekt grupy
        Group group = ZadanieFX.getGroup(primaryStage);
        //Tworzymy scene poprzez podanie klasy Group, wysokosci i szerokosci
        Scene scene = new Scene(group, 1200, 800);
        //Ustawiamy kolor tła
        scene.setFill(Color.WHITE);
        //Ustawiamy tytuł okienka
        primaryStage.setTitle("Kurs java fx");
        //Dodajemy scene to stejdza
        primaryStage.setScene(scene);
        //Wyświetlamy okno
        primaryStage.show();
    }
}
