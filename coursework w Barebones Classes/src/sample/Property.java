package sample;

import java.util.HashMap;
import java.util.Map;

public class Property extends Tile{
    private Player owner;
    private int priceOfProperty;
    private int groupColour;
    private int noOfHouses;
    private boolean hasHotel;
    private boolean isMortgaged;
    private Map<Integer, Integer> costOfHousesAndHotels = new HashMap<Integer, Integer>();

    public Property(int priceOfProperty, int groupColour,Map<Integer, Integer> costOfHousesAndHotels) {
        this.priceOfProperty = priceOfProperty;
        this.groupColour = groupColour;
        this.costOfHousesAndHotels = costOfHousesAndHotels;

    }


    public void addHouse()
    {
        if(noOfHouses == 4 && hasHotel){
            System.out.println("Max houses");
        }
        else if(noOfHouses == 4 && !hasHotel){
            hasHotel = true;
            //reduce player money by hotel price
        }else{
            noOfHouses ++;
            //reduce player money by house price.
        }
    }

    public Player owner(Player owner){
        owner = this.owner;
        return owner;
    }

    public void mortgage(){
        if(!isMortgaged) {
            //increase player money by 1/2 of property value
            isMortgaged = true;
        }else{
            System.out.println("Already mortgaged");
        }
    }

    public boolean isMortgaged(){
        return isMortgaged;
    }



}
