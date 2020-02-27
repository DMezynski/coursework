package sample;

public class FreeParking extends Tile{
    private int totalParkingFines;


    public FreeParking() {

    }


    public void addToParkingFine(int money)
    {
        totalParkingFines += money;

    }

    public void receiveParkingFines(Player thePlayer)
    {
        thePlayer.setMoney(thePlayer.getMoney() + totalParkingFines);
        totalParkingFines = 0;

    }
}
