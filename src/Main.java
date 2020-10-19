import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {

    }

    @Override
    public void start(Stage stage){
        VBox box_main = new VBox();
        Scene scene = new Scene(box_main,500,500);
        box_main.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));

        box_main.getChildren().addAll();
        stage.setTitle("Temp. Converter");
        stage.setScene(scene);
        stage.show();
    }

}
