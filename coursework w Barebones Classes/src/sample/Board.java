package sample;

public class Board {
    private Tile[] allTiles;
    private Dice[] theDice;
    private Player[] players;
    private Bank theBank;


    public Board()
    {

    }

    public Tile[] getAllTiles() {
        return allTiles;
    }

    public void setAllTiles(Tile[] allTiles) {
        this.allTiles = allTiles;
    }

    public Dice[] getTheDice() {
        return theDice;
    }

    public void setTheDice(Dice[] theDice) {
        this.theDice = theDice;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public Bank getTheBank() {
        return theBank;
    }

    public void setTheBank(Bank theBank) {
        this.theBank = theBank;
    }
}
