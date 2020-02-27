package sample;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
//import jdk.management.resource.ResourceRequest;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public Pane goTile; //This is the Pane that represents the "Go" Tile on the board (the name of the variable == the fx-id of the Pane)
    public Circle player1; //

    public Dice theDice;
    public Player thePlayer1;


    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        theDice = new Dice();
        thePlayer1 = new Player();
        thePlayer1.setPlayerIcon(player1);

    }



    public void paneClicked()
    {
        System.out.println("click");

    }

    public void MovePlayer(ActionEvent actionEvent) {

        int x;
        x = theDice.rollDice();

        thePlayer1.getPlayerIcon().setCenterX(player1.getCenterX() - x);
    }
}
