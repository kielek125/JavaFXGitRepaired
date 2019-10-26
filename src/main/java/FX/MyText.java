package FX;

import javafx.scene.Group;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class MyText {
    public static Text getText1() {
        Text text = new Text();
        text.setFont(new Font(30));
        text.setX(50);
        text.setY(150);

        text.setText("Witaj na kursie java podróżniku");

        return text;
    }
    public static Text getText2() {
        Text text = new Text();
        Font.getFontNames().stream().forEach(System.out::println);
        text.setFont(Font.font("Yu Gothic UI Semilight", FontWeight.BOLD, FontPosture.ITALIC, 20));
        text.setX(50);
        text.setY(250);

        text.setText("Witaj na kursie java podróżniku");

        return text;
    }

    public static Group getGroup() {

        return new Group(getText1(),getText2());

    }
}
