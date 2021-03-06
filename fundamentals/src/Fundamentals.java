import java.util.*;

import fizzbuzz.Fizzbuzz;
import randomNumberGame.RandomNumberGame;
import partyManager.PartyManager;

public class Fundamentals {

    public static void main(String[]args){
        //0 ----- Start information -----
        //System.out.println("Let's learning Java basic!");

        //1 ----- Variables: String, int, boolean -----
        //giveYourData();

        //2 ----- If...else conditional -----
        //System.out.println(isWoman("Julia"));
        //buyBeer(17,3.20);

        //3 ----- for loop -----
        //printMessageXTimes("I like programming in Java.",10);

        //4 ----- break, continue -----
        //breakLoop();

        //5 ----- Fizzbuzz game -----
        //Fizzbuzz fizbuzz = new Fizzbuzz();
        //fizbuzz.main(args);

        //6 ----- Random Number game -----
        //RandomNumberGame game = new RandomNumberGame();
        //game.main(args);

        //7 ----- Array and for each method -----
        //getSquad();

        //8 ----- ArrayList and methods -----
        //showListElements();

        //9 ----- HashSet -----
        //showMeals();

        //10 ----- HashMap -----
        //showClubs();

        //11 ----- Party Manager Game -----
        PartyManager partyManager = new PartyManager();
        partyManager.main(args);


    }

    //Example about using variables
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

    //Example about using if...else
    public static boolean isWoman(String name){
        if(name.endsWith("a")){
            return true;
        }else{
            return false;
        }
    }

    //Second example about if...else and operators && and II
    public static void buyBeer(int age, double cash){
        if(age >= 18 && cash >= 2.59 ){
            System.out.println("You are able to buy a beer.");
        }else if(age >= 18 || cash >= 2.59){
            System.out.println("You are to young or you have to less money.");
        }else{
            System.out.println("You aren't able to buy a bear.");
        }
    }

    //Example with for loop
    public static void printMessageXTimes(String message, int howMuch){

        for(int i = 1; i <= howMuch; i++){
            System.out.println(i+". "+message);
        }

    }

    //Example with break and continue
    public static void breakLoop(){
        //Show: 1,2,3,4,5
        System.out.println("----------");
        for(int i=1; i < 10; i++){
            System.out.println(i);
            if(i == 6){
                System.out.println("Break... ");
                break;
            }
        }

        //Show: 1,2,3,4,5,7,8,9,10
        System.out.println("----------");
        for(int i=1; i<11; i++){
            System.out.println(i);
            if(i == 6){
                System.out.println("Continue... ");
                continue;
            }
        }

    }

    public static void getSquad(){
        String [] players = {"Szcz??sny","Glik","Lewandowski","Krychowiak","Zieli??ski"};

        //for each
        for(String player: players){
            System.out.println(player);
        }

    }


    public static void showListElements(){

        ArrayList <String> methods = new ArrayList<>();

        methods.add("add()");
        methods.add("remove()");
        methods.add("clear()");
        methods.add("addAll()");
        methods.add("contains()");
        methods.add("get()");
        methods.add("isEmpty()");

        methods.contains("remove()"); //true
        methods.get(0); // add()

        //Sort ArrayList
        Collections.sort(methods);

        //Show ArrayList
        for (String method: methods){
            System.out.println(method);
        }

    }


    public static void showMeals(){
        Set <String> meals = new HashSet<>();

        meals.add("Pizza");
        meals.add("Kebab");
        meals.add("Salat");
        meals.add("Pizza");

        for(String meal:meals){
            System.out.println(meal); //Pizza, Kebab, Salat  !No Pizza duplicate!
        }
    }


    public static void showClubs(){
        HashMap <String, String> clubs = new HashMap<>();

        clubs.put("Messi","PSG");
        clubs.put("Lewandowski","Bayern");
        clubs.put("Ronaldo", "Manchaster");

        clubs.get("Lewndowski"); //Bayern

        //Show keys
        Set <String> keys = clubs.keySet();
        System.out.println("KEYS:");
        for(String key:keys){
            System.out.println(key);
        }

        Collection <String> values = clubs.values();
        System.out.println("VALUES:");
        for(String value:values){
            System.out.println(value);
        }

    }





}
