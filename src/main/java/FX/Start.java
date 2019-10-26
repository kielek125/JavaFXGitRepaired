package FX;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Start extends Application {


    public void start(Stage primaryStage) {


        //Tworzymy obiekt grupy
        Group group = MyTransformations.getGroup();


        //Tworzymy scene poprzez podanie klasy Group, wysokosci i szerokosci
        Scene scene = new Scene(group ,1200, 800);
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
