import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to NumberGuessingGame");
        int number = 14, guess;
        do{
            System.out.println("Please enter the number you would like to guess in between 1 to 20: ");
            guess = input.nextInt();
        }while(number!=guess);
        System.out.println("You guessed the number " + number + " Is correct");

    }


}
