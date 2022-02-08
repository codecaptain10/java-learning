package partyManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Party {
    private ArrayList<Guest> guests = new ArrayList<>();
    private HashSet<String> meals = new HashSet<>();
    private HashMap<Integer,Guest> phoneToGuest = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    //Add new guest
    public void addGuest(){
        System.out.println("Please, give guest's name: ");
        String name = scanner.nextLine();
        System.out.println("Give prefer meal: ");
        String meal = scanner.nextLine();
        System.out.println("Give phone number: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Are you vegan? (y/n): ");
        String isVeganString = scanner.nextLine();

        boolean isVegan;
        if(isVeganString.equals("y")){
            isVegan= true;
        }else{
            isVegan = false;
        }

        Guest guest = new Guest(name,meal,phoneNumber,isVegan);
        meals.add(meal);
        phoneToGuest.put(phoneNumber,guest);

        guests.add(guest);

    }

    //Get guests list
    public void displayGuests(){
        System.out.println("--- Actuall guests list: ---");
        for (Guest guest:guests) {
            System.out.println();
           guest.displayGuestInformation();

        }
    }

    public void displayMeals(){
        System.out.println("--- Actuall meals list: ---");
        for (String meal:meals) {
            System.out.println(meal);

        }
    }

    public void displayGuestByPhoneNumber(){
        System.out.println("Give searching number: ");
        Integer phoneNumber = Integer.valueOf(scanner.nextLine());
        Guest guest = phoneToGuest.get(phoneNumber);
        System.out.println("Searching by phone ...");

        guest.displayGuestInformation();;

    }


}
