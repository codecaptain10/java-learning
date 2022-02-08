package partyManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Party {
    private ArrayList<String> guests = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    //Add new guest
    public void addGuest(){
        System.out.println("Please, give guest's name: ");
        String name = scanner.nextLine();
        guests.add(name);
    }

    //Get guests list
    public void displayGuests(){
        System.out.println("--- Actuall guests list: ---");
        for (String guest:guests) {
            System.out.println(guest);
        }
    }


}
