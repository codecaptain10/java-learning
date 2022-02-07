package fizzbuzz;

public class Fizzbuzz {
    public static void main(String[]args){
        startFizzBuzzGame(100);
    }

    public static void startFizzBuzzGame(int counter){
        for(int i = 1; i <= counter; i++){
            System.out.println(checkNumber(i));
        }
    }

    public static String checkNumber(int number){
        String status = "";

        if((number%3)==0 && (number%5)==0 ){
            status=number+" FIZBUZZ";
        }else if((number%3)==0 || (number%5)==0){
            if(number%3 == 0){
                status=number+" FIZZ";
            }else if(number%5 == 0){
                status=number+" BUZZ";
            }
        }else{
            status= number+"";
        }


        return status;

    }
}
