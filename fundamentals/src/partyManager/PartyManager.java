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


        while(shouldContinue){
            System.out.println("Chose option: ");
            System.out.println("1. Show guests");
            System.out.println("2. Add a guest");
            System.out.println("3. Show meals");
            System.out.println("4. Search by phone number");
            System.out.println("5. Exit");

            int userChoice = scanner.nextInt();

            //switch instruction since JAVA 12
            switch (userChoice){
                case 1 -> System.out.println("Option 1");
                case 2 -> System.out.println("Option 2");
                case 3 -> System.out.println("Option 3");
                case 4 -> System.out.println("Option 4");
                case 5 -> shouldContinue = false;
            }
        }

    }
}
