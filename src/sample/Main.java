package sample;

import com.ayo.game.model.Cell;
import com.ayo.game.model.Player;
import com.ayo.game.model.Section;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

//,nrrjnk

import java.awt.Font;
import java.io.File;
import javafx.scene.text.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

//kjfkuu

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Stage stagePlayer1 = new Stage();
        Stage stagePlayer = new Stage();
        Stage stagePlayer2 = new Stage();
        Stage mainStage = new Stage();

        File file = new File("C:/Users/MAZWIL/Documents/NetBeansProjects/AyoInterface/src/ayointerface/ayo_by_roymagic.jpg");
        Image n = new Image(file.toURI().toString());
        ImageView image = new ImageView(n);
        image.setX(0);
        image.setY(0);
        image.setFitHeight(320);
        image.setFitWidth(640);

        File file2 = new File("C:/Users/MAZWIL/Documents/NetBeansProjects/AyoInterface/src/ayointerface/whitewood1.jpg");
        Image n2 = new Image(file2.toURI().toString());
        ImageView image2 = new ImageView(n2);
        image2.setX(0);
        image2.setY(0);
        image2.setFitHeight(320);
        image2.setFitWidth(640);

        File file3 = new File("C:/Users/MAZWIL/Documents/NetBeansProjects/AyoInterface/src/ayointerface/whitewood.jpg");
        Image n3 = new Image(file3.toURI().toString());
        ImageView image3 = new ImageView(n3);
        image3.setX(0);
        image3.setY(0);
        image3.setFitHeight(320);
        image3.setFitWidth(640);

        File file3b = new File("C:/Users/MAZWIL/Documents/NetBeansProjects/AyoInterface/src/ayointerface/whitewood.jpg");
        Image n3b = new Image(file3b.toURI().toString());
        ImageView image3b = new ImageView(n3b);
        image3b.setX(0);
        image3b.setY(0);
        image3b.setFitHeight(320);
        image3b.setFitWidth(640);

        File fileMain = new File("C:/Users/MAZWIL/Documents/NetBeansProjects/AyoInterface/src/ayointerface/ayo_interface.jpg");
        Image board = new Image(fileMain.toURI().toString());
        ImageView image_board = new ImageView(board);
        image_board.setX(0);
        image_board.setY(0);
        image_board.setFitHeight(460);
        image_board.setFitWidth(780);

        GridPane grid3a = new GridPane();
        grid3a.setAlignment(Pos.CENTER);
        grid3a.setHgap(10);
        grid3a.setVgap(10);
        grid3a.setPadding(new Insets(10, 10, 10, 10));
        Text player1a = new Text("");
        //Player1.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid3a.add(player1a, 0, 0, 2, 1);
        Label player1aName = new Label("ENTER NAME");
        grid3a.add(player1aName, 0, 1);
        TextField enterName1a = new TextField();
        grid3a.add(enterName1a, 1, 1);
        Button player1Btn = new Button("PLAY");
        grid3a.add(player1Btn, 1, 2);

        grid3a.setTranslateX(210);
        grid3a.setTranslateY(100);

        GridPane grid3b = new GridPane();
        grid3b.setAlignment(Pos.CENTER);
        grid3b.setHgap(10);
        grid3b.setVgap(10);
        grid3b.setPadding(new Insets(10, 10, 10, 10));
        Text player1b = new Text("");
        grid3b.add(player1b, 0, 0, 2, 1);
        Label player1bName = new Label("ENTER NAME");
        grid3b.add(player1bName, 0, 1);
        TextField enterName1b = new TextField();
        grid3b.add(enterName1b, 1, 1);
        Text player2 = new Text("");
        grid3b.add(player2, 0, 3, 2, 1);
        Label player2Name = new Label("ENTER NAME");
        grid3b.add(player2Name, 0, 4);
        TextField enterName2 = new TextField();
        grid3b.add(enterName2, 1, 4);
        Button player2Btn = new Button("PLAY");
        player2Btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                mainStage.show();
                stagePlayer2.close();

            }
        });
        grid3b.add(player2Btn, 1, 5);

        grid3b.setTranslateX(210);
        grid3b.setTranslateY(100);

        Group p3 = new Group();
        p3.getChildren().addAll(image3, grid3a);
        Scene scene3a = new Scene(p3, 640, 320);

        Group p3b = new Group();
        p3b.getChildren().addAll(image3b, grid3b);
        Scene scene3b = new Scene(p3b, 640, 320);

        Label displayName1 = new Label("Name 1 here");
        Label displayName2 = new Label("Name 2 here");
        TextField score1 = new TextField();
        TextField score2 = new TextField();
        displayName1.setTranslateX(90);
        displayName1.setTranslateY(30);
        displayName2.setTranslateX(420);
        displayName2.setTranslateY(410);
        score1.setTranslateX(180);
        score1.setTranslateY(30);
        score2.setTranslateX(510);
        score2.setTranslateY(410);

        Button menuBtn = new Button("MENU");
        //action here
        menuBtn.setTranslateX(700);
        menuBtn.setTranslateY(130);
        Group platform = new Group();
        platform.getChildren().addAll(image_board, displayName1, displayName2, score1, score2, menuBtn);
        Scene scene4 = new Scene(platform, 780, 460);
        mainStage.setTitle("AYO v.19.0");
        mainStage.setScene(scene4);
        //scene4.getStylesheets().add(AyoInterface.class.getResource("AyoInterface.css").toExternalForm());

        stagePlayer1.setTitle("AYO v.19.0");
        stagePlayer1.setScene(scene3a);

        stagePlayer2.setTitle("AYO v.19.0");
        stagePlayer2.setScene(scene3b);

        VBox vbox2 = new VBox(14);
        vbox2.setAlignment(Pos.CENTER);

        Text textSelectPlayer = new Text();
        //textSelectPlayer.setWrappingWidth(300);
        textSelectPlayer.setText("");
        textSelectPlayer.setTextAlignment(TextAlignment.JUSTIFY);

        Button btnPlayer1 = new Button("1 PLAYER");
        btnPlayer1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                stagePlayer1.show();
                stagePlayer.close();

            }
        });

        Button btnPlayer2 = new Button("2 PLAYERS");
        btnPlayer2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                stagePlayer2.show();
                stagePlayer.close();

            }
        });
        textSelectPlayer.setTranslateX(260);
        textSelectPlayer.setTranslateY(140);
        btnPlayer1.setTranslateX(280);
        btnPlayer1.setTranslateY(130);
        btnPlayer2.setTranslateX(280);
        btnPlayer2.setTranslateY(130);

        vbox2.getChildren().addAll(textSelectPlayer, btnPlayer1, btnPlayer2);
        Group p2 = new Group();
        p2.getChildren().addAll(image2, vbox2);
        Scene scene2 = new Scene(p2, 640, 320);


        stagePlayer.setTitle("AYO v.19.0");
        stagePlayer.setScene(scene2);
        //scene2.getStylesheets().add(AyoInterface.class.getResource("AyoInterface.css").toExternalForm());

        VBox vbox = new VBox(14);
        vbox.setAlignment(Pos.CENTER);

        Text text = new Text();
        //text.setFont(new Font(50));
        //text.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        //text.setWrappingWidth(300);
        text.setText("");
        text.setTextAlignment(TextAlignment.JUSTIFY);


        Button btn = new Button("START");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                stagePlayer.show();
                primaryStage.close();

            }
        });

        Button btn2 = new Button("EXIT");
        btn2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                //Alert alert = new Alert(AlertType.CONFIRMATION);
                //alert.setTitle("AYO v.19.0");
                //alert.setHeaderText("Do you want to end Ayo");
                //Optional<ButtonType> result = primaryStage.close();

                primaryStage.close();
                stagePlayer.close();
            }
        });
        text.setTranslateX(550);
        text.setTranslateY(180);
        btn.setTranslateX(300);
        btn.setTranslateY(180);
        btn2.setTranslateX(300);
        btn2.setTranslateY(180);

        vbox.getChildren().addAll(text, btn, btn2);
        Group p = new Group();
        p.getChildren().addAll(image, vbox);
        Scene scene = new Scene(p, 640, 320);
        //Group root = new Group(scene, 800, 650);

        primaryStage.setTitle("AYO v.19.0");
        primaryStage.setScene(scene);
        //scene.getStylesheets().add(AyoInterface.class.getResource("AyoInterface.css").toExternalForm());
        //scene4.getStylesheets().add("AyoInterface.css");
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);


        Scanner input = new Scanner(System.in);
        System.out.println("Enter no of players");
        int playerCount = input.nextInt();
        while((playerCount < 1) || (playerCount > 2)){
            System.out.println("no of players must be greater than 0 or less than 2");
            playerCount = input.nextInt();
        }
        Player[] players = new Player[playerCount];

        for (int i = 0 ; i < playerCount; i++){
            Player player = createPlayer(i + 1);
            players[i] = player;
        }

        System.out.println("playerCount = " + playerCount);

        for (Player player :
                players) {
            System.out.println("player.getId() = " + player.getId());
        }

        Section section = new Section(); //player one section
        section.setPalyerId(players[0].getId());

        Section section2 = new Section(); //player two section
        section2.setPalyerId(players[1].getId());

        section.setCellList(createCells(1));
        section2.setCellList(createCells(2));

        //System.out.println("section2 = " + section.getCellList());

        for (Cell cell: section.getCellList()) {
            cell.removeSeed();
            System.out.println("Section 1 = " + cell);
        }
        System.out.println();
        for (Cell cell: section2.getCellList()) {
            cell.removeSeed();
            System.out.println("Section 2 = " + cell);
        }

        System.out.println("###### STARTING NEW GAME ######");
        Player player1 = players[0];
        Player player2  = players[1];
        player1.setSection(section);
        player2.setSection(section2);
        player1.setPlayerTurn(true);
        player2.setPlayerTurn(false);
        System.out.println("Player: " + player1.getId() +  "Enter Cell ID to begin game");

        int cellId = input.nextInt();

        System.out.println(hasCell(player1.getSection().getCellList(), cellId));
        while (!hasCell(player1.getSection().getCellList(), cellId)){
            System.out.println("Please enter a value within player section");
            cellId = input.nextInt();
        }

//        while (player1.getSection().getCellList().)
//
//        boolean res = player1.getSection().getCellList().stream().allMatch(cell -> cellId == cell.getCellId());
//
//        while(!res) {
//            System.out.println("no of players must be greater than 0 or less than 2");
//            cellId = input.nextInt();
//        }
//
//
//            //createPlayer();
//
    }

    private static Player createPlayer(int id) {
        Player player1 = new Player();
        player1.setId(id);
        return player1;

    }

    private static Section createSection(){
        return null;
    }

    private static List<Cell> createCells(int sectionId){
        List<Cell> cells = new ArrayList<>();

        for (int i= 0; i < 6; i++) {
            if (sectionId == 1) {
                Cell cell = new Cell(i + 1, 4, sectionId);
                cells.add(cell);
            } else {
                Cell cell = new Cell(7 + i, 4, sectionId);
                cells.add(cell);
            }
        }
        return cells;
    }

    private static boolean hasCell(List<Cell> cells, final int cellId){
        return cells.stream().anyMatch((Predicate<Cell>) cell -> cellId == cell.getCellId());
//        boolean v = false
//        for (Cell c : cells) {
//            return c.getCellId() == cellId;
//        }
//        return false;
    }
}
