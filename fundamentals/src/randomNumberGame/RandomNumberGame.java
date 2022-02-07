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
        int counter = 0;
        //Random number
        Random random = new Random();
        int randomNumber = random.nextInt(100)+1;
        checkNumber(randomNumber,counter);


    }

    public static void checkNumber(int randomNumber, int counter){

        int userNumber;
        System.out.println("Give your number: ");
        Scanner scanner = new Scanner(System.in);
        userNumber = Integer.parseInt(scanner.nextLine());
        counter++;

        if(userNumber > randomNumber){
            System.out.println("Too BIG...Try again!");
            checkNumber(randomNumber,counter);
        }else if(userNumber < randomNumber){
            System.out.println("Too SMALL...Try again!");
            checkNumber(randomNumber,counter);
        }else{
            System.out.println("YEEES! That was "+randomNumber+". You won in "+counter+ " attempt.");
            System.out.println("----- FINISHED -----");
        }

    }


}
