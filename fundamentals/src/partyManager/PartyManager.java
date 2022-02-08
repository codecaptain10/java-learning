package partyManager;

import java.util.Scanner;

public class PartyManager {
    public static void main(String[]args){
        partyManagement();
    }

    public static void partyManagement(){

        //Values
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;
        Party party = new Party();

        System.out.println("W E L C O M E  T O  T H E  P A R T Y");
        while(shouldContinue){
            System.out.println();
            System.out.println("--------  M E N U   ---------");
            System.out.println("| 1. Show guests            |");
            System.out.println("| 2. Add a guest            |");
            System.out.println("| 3. Show meals             |");
            System.out.println("| 4. Search by phone number |");
            System.out.println("| 5. Exit                   |" );
            System.out.println("-----------------------------");
            System.out.println();
            System.out.println("Chose option: ");

            int userChoice = scanner.nextInt();

            //switch instruction since JAVA 12
            switch (userChoice){
                case 1 -> party.displayGuests();
                case 2 -> party.addGuest();
                case 3 -> System.out.println("Option 3");
                case 4 -> System.out.println("Option 4");
                case 5 -> shouldContinue = false;
            }
        }

    }
}
