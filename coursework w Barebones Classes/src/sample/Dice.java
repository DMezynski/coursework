package sample;
import javafx.animation.RotateTransition;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.util.Random;


public class Dice {
    private int number1;
    private int number2;



    public int rollDice()
    {
        Random ran = new Random();
        int x = ran.nextInt(3) + 10;
        return x;
    }
}
