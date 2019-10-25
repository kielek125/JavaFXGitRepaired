package FX;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Start extends Application {


    public void start(Stage primaryStage) {

        //Tworzymy obiekt grupy
        TextField textField1 = new TextField();
        Group group = new Group(MyEvents.getGroup());

        //Tworzymy scene poprzez podanie klasy Group, wysokosci i szerokosci
        Scene scene = new Scene(group ,600, 400);

        //Ustawiamy kolor tła
        scene.setFill(Color.RED);

        //Ustawiamy tytuł okienka
        primaryStage.setTitle("Kurs java fx");

        //Dodajemy scene to stejdza
        primaryStage.setScene(scene);

        //Wyświetlamy okno
        primaryStage.show();


    }
}
