package partyManager;

import java.util.ArrayList;

public class Party {
    private ArrayList<String> guests = new ArrayList<>();

    //Add new guest
    public void addGuest(String name){
        guests.add(name);
    }

    //Get guests list
    public ArrayList<String> getGuests(){
        return guests;
    }


}
