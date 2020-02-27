package sample;


import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Player {

    public Circle playerIcon;
    private int money;
    private int noOfTimesPassedGo;
    private int turnPosition;
    private Property[] propertiesOwned;
    private Tile tileOn;
    private boolean inJail;
    private int turnsLeftInJail;
    private boolean getOutOfJailFree;



    public Player()
    {
        money = 1500;
        noOfTimesPassedGo = 0;
        inJail = false;
        turnsLeftInJail = 0;
        getOutOfJailFree = false;


    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void reduceMoney(int money){ money = money - this.money; }

    public void addMoney(int money) { money = money + this.money; }

    public void createIcon()
    {

        Circle circle = new Circle();

        //Setting the position of the circle
        circle.setCenterX(1100.0f);
        circle.setCenterY(135.0f);

        //Setting the radius of the circle
        circle.setRadius(12.5f);

        //Setting the color of the circle
        circle.setFill(Color.BROWN);

        //Setting the stroke width of the circle
        circle.setStrokeWidth(20);

        //Setting the text


        //Creating the mouse event handler
        EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                System.out.println("Hello World");
                circle.setCenterY(circle.getCenterY() +100);
            }
        };
        //Registering the event filter
        circle.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
        playerIcon = circle;

    }

    public void moveIcon()
    {

    }

    public Circle getPlayerIcon() {
        return playerIcon;
    }

    public void setPlayerIcon(Circle playerIcon) {
        this.playerIcon = playerIcon;
    }
}
