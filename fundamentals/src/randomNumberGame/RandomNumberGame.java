package randomNumberGame;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[]args){
        playGame();
    }


    public static void playGame(){
        System.out.println("----- Play game! -----");

        //Counter how many times you try
        int counter;
        //Random number
        Random random = new Random();
        int randomNumber = random.nextInt(10)+1;


        int userNumber;
        System.out.println("Give your number: ");
        Scanner scanner = new Scanner(System.in);
        userNumber = Integer.parseInt(scanner.nextLine());
        checkNumber(userNumber,randomNumber);



    }

    public static void checkNumber(int userNumber, int randomNumber){

        Scanner scanner = new Scanner(System.in);
        if(userNumber > randomNumber){
            System.out.println("Too BIG...Try again!");
            System.out.println("Give your number: ");
            userNumber = Integer.parseInt(scanner.nextLine());
            checkNumber(userNumber,randomNumber);
        }else if(userNumber < randomNumber){
            System.out.println("Too SMALL...Try again!");
            System.out.println("Give your number: ");
            userNumber = Integer.parseInt(scanner.nextLine());
            checkNumber(userNumber,randomNumber);
        }else{
            System.out.println("YEEES! That was "+randomNumber+". You won!");
            System.out.println("----- FINISHED -----");
        }

    }


}
