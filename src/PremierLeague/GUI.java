package PremierLeague;

import javafx.application.Application;
import javafx.geometry.Insets;

import javafx.print.Collation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.ArrayList;
import static PremierLeague.Main.premierLeagueManager;

public class GUI extends Application {
    Scene scene1, scene2, scene3, scene4, scene5, scene6, scene7;


    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Welcome To Premier League");
        Label lbm = new Label("Welcome To League !!");
        lbm.setLayoutX(95);
        lbm.setLayoutY(20);
        lbm.setStyle("-fx-font: normal bold 23px 'opensans';-fx-alignment: center ");

        Button btnA = new Button("List order by ClubPoints");
        btnA.setLayoutX(50);
        btnA.setLayoutY(100);
        btnA.prefWidth(400);
        btnA.prefHeight(30);
        btnA.setStyle("-fx-background-color: aqua;-fx-font: normal bold 15px 'opensans';-fx-text-fill:black");
btnA.setOnAction(event -> primaryStage.setScene(scene2));

        Button btnB = new Button("List order by scored Goals");
        btnB.setLayoutX(50);
        btnB.setLayoutY(160);
        btnB.prefWidth(400);
        btnB.prefHeight(30);
        btnB.setStyle("-fx-background-color: aliceblue;-fx-font: normal bold 15px 'opensans';-fx-text-fill:black");
        btnB.setOnAction(event -> primaryStage.setScene(scene3));

        Button btnC = new Button("List order by Wins");
        btnC.setLayoutX(50);
        btnC.setLayoutY(220);
        btnC.prefWidth(400);
        btnC.prefHeight(30);
        btnC.setStyle("-fx-background-color: #00ffff;-fx-font: normal bold 15px 'opensans';-fx-text-fill:black");
        btnC.setOnAction(event -> primaryStage.setScene(scene4));

        Button btnD = new Button("List order by Scored Goals");
        btnC.setLayoutX(50);
        btnC.setLayoutY(280);
        btnC.prefWidth(400);
        btnC.prefHeight(30);
        btnC.setStyle("-fx-background-color: aqua;-fx-font: normal bold 15px 'opensans';-fx-text-fill:black");
        btnC.setOnAction(event -> primaryStage.setScene(scene5));

        Button btnE = new Button("List order by scored goals");
        btnE.setLayoutX(50);
        btnE.setLayoutY(340);
        btnE.prefWidth(400);
        btnE.prefHeight(30);
        btnE.setStyle("-fx-background-color: aqua;-fx-font: normal bold 15px 'opensans';-fx-text-fill:black");
        btnE.setOnAction(event -> primaryStage.setScene(scene6));

        Button btnF = new Button("List order by scored goals");
        btnF.setLayoutX(50);
        btnF.setLayoutY(400);
        btnF.prefWidth(400);
        btnF.prefHeight(30);
        btnF.setStyle("-fx-background-color: aqua;-fx-font: normal bold 15px 'opensans';-fx-text-fill:black");
        btnF.setOnAction(event -> primaryStage.setScene(scene7));

        Button btnG = new Button("EXIT");
        btnG.setLayoutX(50);
        btnG.setLayoutY(460);
        btnG.prefWidth(400);
        btnG.prefHeight(30);
        btnG.setStyle("-fx-background-color: aqua;-fx-font: normal bold 15px 'opensans';-fx-text-fill:black");
        btnG.setOnAction(event -> primaryStage.close());

        Pane root1 = new Pane();
        root1.getChildren().addAll(lbm, btnA, btnB, btnC, btnD, btnE, btnF, btnG);
        scene1 = (new Scene(root1, 550, 590));
        primaryStage.setScene(scene1);
        primaryStage.show();

        primaryStage.setTitle("List of Clubs in League according to the Total Points");

        TableView table = new TableView();

        TableColumn< String, FootballClub > clubName = new TableColumn<>("Club Name");
        clubName.setCellValueFactory(new PropertyValueFactory<>("clubName"));
        clubName.setMinWidth(110);

        TableColumn< String, FootballClub > clubPoints = new TableColumn<>("Club Points");
        clubPoints.setCellValueFactory(new PropertyValueFactory<>("clubPoints"));
        clubPoints.setMinWidth(110);

        TableColumn< String, FootballClub > totalWins = new TableColumn<>("Total Wins");
        totalWins.setCellValueFactory(new PropertyValueFactory<>("Total Wins"));

        TableColumn< String, FootballClub > totalDraws = new TableColumn<>("Total Draws");
        totalDraws.setCellValueFactory(new PropertyValueFactory<>("Total Draws"));

        TableColumn< String, FootballClub > totalDefeats = new TableColumn<>("Total Defeats");
        totalDefeats.setCellValueFactory(new PropertyValueFactory<>("Total Defeats"));

        TableColumn< String, FootballClub > scrGoals = new TableColumn<>("Scored Goals");
        scrGoals.setCellValueFactory(new PropertyValueFactory<>("Scored Goals"));
        scrGoals.setMinWidth(110);

        TableColumn< String, FootballClub > recGoals = new TableColumn<>("Received Goals");
        recGoals.setCellValueFactory(new PropertyValueFactory<>("Received Goals"));
        recGoals.setMinWidth(110);

        TableColumn< String, FootballClub > totalMatches = new TableColumn<>("Total played Matches");
        totalMatches.setCellValueFactory(new PropertyValueFactory<>("Total Matches"));

        table.getColumns().addAll(clubName, clubPoints, totalWins, totalDraws, totalDefeats, scrGoals, recGoals, totalMatches);
        table.getItems().addAll(premierLeagueManager.clubs);

        Button bt1 = new Button("Back");
        bt1.setLayoutX(335);
        bt1.setLayoutY(455);
        bt1.setPrefWidth(80);
        bt1.setPrefHeight(30);
        bt1.setStyle(
                "-fx-background-color: aqua;-fx-font: normal bold 15px'opensans';-fx-text-fill:black");
        bt1.setOnAction(event -> primaryStage.setScene(scene1));

        Pane rootA = new Pane(table,bt1);
        scene2 = (new Scene(rootA, 730, 590));
        primaryStage.setScene(scene3);


        primaryStage.setTitle("List of Clubs  to the Wins!!");

        TableView table2 = new TableView();

        TableColumn< String, FootballClub > clubName2 = new TableColumn<>("Club Name");
        clubName2.setCellValueFactory(new PropertyValueFactory<>("clubName"));
        clubName2.setMinWidth(110);

        TableColumn< String, FootballClub > clubPoints2 = new TableColumn<>("Club Points");
        clubPoints2.setCellValueFactory(new PropertyValueFactory<>("Club Points"));
        clubPoints2.setMinWidth(110);

        TableColumn< String, FootballClub > totalWins2 = new TableColumn<>(" Total Wins");
        totalWins2.setCellValueFactory(new PropertyValueFactory<>(" Total Wins"));

        TableColumn< String, FootballClub > totalDraws2 = new TableColumn<>("Total Draws");
        totalDraws2.setCellValueFactory(new PropertyValueFactory<>("Total Draws"));

        TableColumn< String, FootballClub > totalDefeats2 = new TableColumn<>("Total Defeats");
        totalDefeats2.setCellValueFactory(new PropertyValueFactory<>("Total Draws"));

        TableColumn< String, FootballClub > scrGoals2 = new TableColumn<>("Scored Goals");
        scrGoals2.setCellValueFactory(new PropertyValueFactory<>("Scored Goals"));
        scrGoals2.setMinWidth(110);

        TableColumn< String, FootballClub > recGoals2 = new TableColumn<>("Received Goals");
        recGoals2.setCellValueFactory(new PropertyValueFactory<>("Received Goals"));
        recGoals2.setMinWidth(110);

        TableColumn< String, FootballClub > totalMatches2 = new TableColumn<>(" Total Played Matches");
        totalMatches2.setCellValueFactory(new PropertyValueFactory<>("Total Played Matches"));


        table2.getColumns().addAll(clubName2, clubPoints2, totalWins2, totalDraws2, totalDefeats2, scrGoals2, recGoals2, totalMatches2);
        table2.getItems().addAll(premierLeagueManager.clubs);

        Button btn2 = new Button("Back");
        btn2.setLayoutX(335);
        btn2.setLayoutY(455);
        btn2.setPrefWidth(80);
        btn2.setPrefHeight(30);
        btn2.setStyle(
                "-fx-background-color: aqua;-fx-font: normal bold 15px 'opensans';-fx-text-fill:black");
        btn2.setOnAction(event -> primaryStage.setScene(scene1));

        Pane root4 = new Pane(table2,btn2);
        scene4 = (new Scene(root4, 730,590));
        primaryStage.setScene(scene4);


    }

    public static void main (String[]args){
        launch(args);
    }

}






























