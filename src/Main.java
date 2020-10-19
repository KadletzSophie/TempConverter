import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage){
        VBox box_main = new VBox();
        Scene scene = new Scene(box_main,500,500);
        box_main.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));

        Label label_celsius = new Label("Grad Celsius");
        label_celsius.setMinSize(100,20);
        label_celsius.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        label_celsius.setStyle("-fx-font-size:20;-fx-font-weight: bold");

        Label label_fahrenheit = new Label("Grad Fahrenheit");
        label_fahrenheit.setMinSize(100,20);
        label_fahrenheit.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        label_fahrenheit.setStyle("-fx-font-size:20;-fx-font-weight: bold");

        TextField tf_celsius = new TextField();
        tf_celsius.setMinSize(100,20);
        tf_celsius.setStyle("-fx-font-size:20;-fx-font-weight: bold");
        TextField tf_fahrenheit = new TextField();
        tf_fahrenheit.setMinSize(100,20);
        tf_fahrenheit.setStyle("-fx-font-size:20;-fx-font-weight: bold");

        Button b_celsius = new Button("Convert C -> F");
        b_celsius.setMinSize(100,35);

        Button b_fahrenheit = new Button("Convert F -> C");
        b_fahrenheit.setMinSize(100,35);

        EventHandler<MouseEvent> handler1 = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    double celsiusNum = Double.parseDouble(tf_celsius.getText());
                    double fahrenheit = celsiusNum * 1.8 + 32;
                    tf_fahrenheit.setText(String.valueOf(fahrenheit));
                }
                catch (Exception e){
                    System.out.println("Bitte geben sie einen gültigen (numerischen) Wert ein.");
                }
            }

        };

        EventHandler<MouseEvent> handler2 = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
            }

        };

        b_celsius.addEventHandler(MouseEvent.MOUSE_CLICKED, handler1);
        b_fahrenheit.addEventHandler(MouseEvent.MOUSE_CLICKED, handler2);
        box_main.getChildren().addAll(label_celsius,tf_celsius,label_fahrenheit,tf_fahrenheit, b_celsius, b_fahrenheit);
        stage.setTitle("Temp. Converter");
        stage.setScene(scene);
        stage.show();
    }

}
