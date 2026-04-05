import java.util.Scanner;

class PositiveNegative {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Check weather the number is positive or negative \n");
        System.out.println("Please enter the number you want to check :");
        int number = input.nextInt();

        if(number < 0){
            System.out.println("The number you taken is negative");
        }else if(number > 0){
            System.out.println("The number you taken  is positive");
        }
        else {
            System.out.println("It a zero number");
        }
    }
}
