package sample;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;

public class guiroy extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("my AYO v.19.0");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_CENTER);

        grid.setHgap(10);
        grid.setVgap(30);
        grid.setPadding(new Insets(25, 25, 25, 25));


        Scene scene = new Scene(grid, 800, 450);
        Text scenetitle = new Text("AYO");
        //scenetitle.setFont(Font.font("Tacoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);
        
        Button btn = new Button("START");
        HBox hbBtn = new HBox(30);
        hbBtn.setAlignment(Pos.CENTER);

        //hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
