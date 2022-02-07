import java.util.Scanner;

public class Fundamentals {

    public static void main(String[]args){
        //Start information
        //System.out.println("Let's learning Java basic!");

      //Variables: String, int, boolean
        giveYourData();
    }

    public static void giveYourData(){

        Scanner scanner = new Scanner(System.in);
        //String
        System.out.println("Give your name: ");
        String name = scanner.nextLine();
        //Integer
        System.out.println("Give your age: ");
        int age = Integer.parseInt(scanner.nextLine());
        //Boolean
        System.out.println("Do you like programming? (yes/no): ");
        boolean doYouLikeProgramming;
        String message;
        String answer = scanner.nextLine();
        if(answer.equals("yes")){
            doYouLikeProgramming = true;
        }else if(answer.equals("no")){
            doYouLikeProgramming=false;
        }

        if(doYouLikeProgramming = true){
            message = "you like programming :)";
        }else{
            message = "you don't like programming";
        }

        System.out.println("Your name is "+name+", you "+age+" years old and "+message);

    }
}
