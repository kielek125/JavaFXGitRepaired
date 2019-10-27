package FX;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.*;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class MyGui {
    public static GridPane gui(Stage stage) {
        Text nameLabel = new Text("Name");

        TextField nameText = new TextField();
        Text dobLabel = new Text("Date of birth");
        DatePicker datePicker = new DatePicker();
        Text genderLabel = new Text("gender");
        ToggleGroup groupGender = new ToggleGroup();
        RadioButton maleRadio = new RadioButton("male");
        maleRadio.setToggleGroup(groupGender);
        RadioButton femaleRadio = new RadioButton("female");
        femaleRadio.setToggleGroup(groupGender);

        Text reservationLabel = new Text("Reservation");

        ToggleButton yes = new ToggleButton("Yes");
        ToggleButton no = new ToggleButton("No");
        ToggleGroup groupReservation = new ToggleGroup();
        yes.setToggleGroup(groupReservation);
        no.setToggleGroup(groupReservation);

        Text technologiesLabel = new Text("Technologies Known");

        CheckBox javaCheckBox = new CheckBox("Java");
        javaCheckBox.setIndeterminate(true);

        CheckBox dotnetCheckBox = new CheckBox("DotNet");
        dotnetCheckBox.setIndeterminate(false);

        Text educationLabel = new Text("Educational qualification");

        ObservableList<String> names = FXCollections.observableArrayList(
                "Engineering", "MCA", "MBA", "Graduation", "MTECH", "Mphil", "Phd");
        ListView<String> educationListView = new ListView<String>(names);

        Text locationLabel = new Text("location");

        ChoiceBox locationchoiceBox = new ChoiceBox();
        //locationchoiceBox.getItems().addAll
             //   ("Hyderabad", "Chennai", "Delhi", "Mumbai", "Vishakhapatnam");
        locationchoiceBox.getItems().addAll(new Temp("Bartosz", 25), new Temp("Kasia",30));

        Button buttonRegister = new Button("Register");

        GridPane gridPane = new GridPane();

        gridPane.setMinSize(500, 500);
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        gridPane.setVgap(5);
        gridPane.setHgap(5);

        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameText, 1, 0);

        gridPane.add(dobLabel, 0, 1);
        gridPane.add(datePicker, 1, 1);

        gridPane.add(genderLabel, 0, 2);
        gridPane.add(maleRadio, 1, 2);
        gridPane.add(femaleRadio, 2, 2);
        gridPane.add(reservationLabel, 0, 3);
        gridPane.add(yes, 1, 3);
        gridPane.add(no, 2, 3);

        gridPane.add(technologiesLabel, 0, 4);
        gridPane.add(javaCheckBox, 1, 4);
        gridPane.add(dotnetCheckBox, 2, 4);

        gridPane.add(educationLabel, 0, 5);
        gridPane.add(educationListView, 1, 5);

        gridPane.add(locationLabel, 0, 6);
        gridPane.add(locationchoiceBox, 1, 6);

        gridPane.add(buttonRegister, 2, 7);

        buttonRegister.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Bla bla");
            File file = fileChooser.showOpenDialog(stage);
            if(file != null){
                System.out.println(file.getPath());
            }

        });
        buttonRegister.addEventHandler(MouseEvent.MOUSE_ENTERED, event -> {
            ProgressBar p2 = new ProgressBar();
            gridPane.getChildren().addAll(p2);
        });
        buttonRegister.setStyle(
                "-fx-background-color: #a8a832; -fx-textfill: white;");
        buttonRegister.setStyle("");

        nameLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        dobLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        genderLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        reservationLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        technologiesLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        educationLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        locationLabel.setStyle("-fx-font: normal bold 15px 'serif' ");

        gridPane.setStyle("-fx-background-color: BEIGE;");

        return gridPane;
    }

    public static Label myLabel() {
        Label lbl = new Label("Lala piękny jest ten świat");
        lbl.setLayoutX(50);
        lbl.setLayoutY(100);
        lbl.setFont(new Font(20));

        return lbl;
    }

    public static Button myButton(Stage stage) {
        Button btn = new Button("Kliknij mnie!");
        btn.setLayoutX(70);
        btn.setLayoutY(100);
        btn.fire();
        /*btn.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            FileChooser.ExtensionFilter extentionFilter = new FileChooser.ExtensionFilter("TXT files", "*.txt");

            FileChooser fc = new FileChooser();
            fc.getExtensionFilters().add(extentionFilter);
            fc.setTitle("Podaj plik");
            fc.setInitialDirectory(new File(System.getProperty("user.dir") + File.separator));
            File openedFile = fc.showOpenDialog(stage);
            if (openedFile != null) {
                System.out.println(openedFile.getPath());
            }
            //fc.showOpenMultipleDialog(stage);
        });*/
        btn.setOnAction(x -> {
            FileChooser.ExtensionFilter extentionFilter = new FileChooser.ExtensionFilter("TXT files", "*.txt");

            FileChooser fc = new FileChooser();
            fc.getExtensionFilters().add(extentionFilter);
            fc.setTitle("Podaj plik");
            fc.setInitialDirectory(new File(System.getProperty("user.home")));
            File openedFile = fc.showOpenDialog(stage);
            if (openedFile != null) {
                System.out.println(openedFile.getPath());
            }
            //fc.showOpenMultipleDialog(stage);
        });

        return btn;
    }

    public static Group myColorPicker(){
        Circle c = new Circle(130,185,30);

        ColorPicker cp = new ColorPicker(Color.BLUE);
        cp.setLayoutX(70);
        cp.setLayoutY(100);
        cp.setOnAction(e -> {
            c.setFill(cp.getValue());
        });
        return new Group(c, cp);
    }

    public static CheckBox myCheckBox(){
        CheckBox checkBox = new CheckBox("nazwa checkboxa");
        checkBox.setLayoutX(70);
        checkBox.setLayoutY(100);
        checkBox.setIndeterminate(true);
        checkBox.fire();
        checkBox.setOnAction(e -> {
            System.out.println(checkBox.isSelected());
        });
        return checkBox;
    }

    public static Group myRadioButton(){
        ToggleGroup groupGender = new ToggleGroup();

        RadioButton maleRadio = new RadioButton("Mężczyzna");
        maleRadio.setToggleGroup(groupGender);
        maleRadio.setLayoutX(70);
        maleRadio.setLayoutY(100);

        RadioButton femaleRadio = new RadioButton("Kobieta");
        femaleRadio.setToggleGroup(groupGender);
        femaleRadio.setLayoutX(170);
        femaleRadio.setLayoutY(100);

        maleRadio.setOnAction(e -> {
            System.out.println("Zaznaczyłeś mężczyzną");
            RadioButton selected = (RadioButton)groupGender.getSelectedToggle();
            System.out.println(selected.getText());
        });

        femaleRadio.setOnAction(e -> {
            System.out.println("Zaznaczyłeś kobietę");
            RadioButton selected = (RadioButton)groupGender.getSelectedToggle();
            System.out.println(selected.getText());
        });
        return new Group(maleRadio, femaleRadio);
    }

    public static ListView myListView(){
        ListView lv = new ListView();
        lv.setLayoutX(100);
        lv.setLayoutY(70);
        lv.getItems().addAll("Ania","Tomek","Ja");
        lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        lv.getSelectionModel().selectedItemProperty().addListener((ChangeListener<String>) (observable, oldValue, newValue) -> {
            System.out.println(observable);
            System.out.println(observable.getClass().getTypeName());
            System.out.println(observable.getClass().getName());
            ReadOnlyObjectProperty<String> observe = (ReadOnlyObjectProperty)observable;
            //System.out.println("ListView selekcja zmieniona z = "
                 //   + oldValue + " na = " + newValue);

            //System.out.println(lv.getSelectionModel().getSelectedItems());
        });

        return lv;

    }

    public static Group myTextField(){
        TextField textField = new TextField();
        textField.setLayoutX(100);
        textField.setLayoutY(70);

        TextField textField2 = new TextField();
        textField2.setLayoutX(100);
        textField2.setLayoutY(120);

        textField.setOnAction(x -> {
            System.out.println(textField.getText());
        });

        textField2.focusedProperty().addListener((arg0, oldPropertyValue, newPropertyValue) -> {
            if (newPropertyValue)
            {
                System.out.println("Zaznaczony");
            }
            else
            {
                //to jest bardzo ważne
                System.out.println("Odznaczony");
            }
        });
        return new Group(textField, textField2);
    }

    public static PasswordField myPasswordField(){
        PasswordField passwordField = new PasswordField();
        passwordField.setLayoutX(100);
        passwordField.setLayoutY(70);
        passwordField.textProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println("Teskt zmieniony z |" + oldValue + "| na |" + newValue + "|");
        });
        return passwordField;
    }

    public static TextArea myTextArea(){
        TextArea textArea = new TextArea("Abc");
        textArea.setLayoutX(100);
        textArea.setLayoutY(70);
        textArea.getText();

        return textArea;
    }

    public static Slider mySlider(){
        Slider slider = new Slider();
        slider.setLayoutX(100);
        slider.setLayoutY(70);
        slider.setMax(1000);
        slider.setMin(10);
        slider.getValue();
        slider.valueProperty().addListener((ov, old_val, new_val) -> {
            System.out.println("Stara wartość: " + old_val.doubleValue() + ", nowa wartość: " + new_val.doubleValue());
        });

        return slider;
    }

    public static Group getGroup(Stage stage) {

        return new Group(myListView());
    }

}
class Temp{
    public String name;
    public int age;

    public Temp(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}
