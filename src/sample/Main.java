package sample;

import com.ayo.game.model.Cell;
import com.ayo.game.model.Player;
import com.ayo.game.model.Section;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        //launch(args);


        Scanner input = new Scanner(System.in);
        System.out.println("Enter no of palyers");
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

        Section section = new Section();
        section.setPalyerId(players[0].getId());

        Section section2 = new Section();
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
