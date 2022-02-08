package partyManager;

import java.util.Scanner;

public class PartyManager {
    public static void main(String[]args){
        partyManagement();
    }

    public static void partyManagement(){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Chose option: ");
            System.out.println("1. Show guests");
            System.out.println("2. Add a guest");
            System.out.println("3. Show meals");
            System.out.println("4. Search by phone number");
            System.out.println("5. Exit");
        }

    }
}
