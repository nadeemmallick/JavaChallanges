import java.util.Scanner;

class OddEven {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to checking the odd and even number");
        System.out.println("Please enter the number you want to check :");
        int number = input.nextInt();

        if(number%2==0) {
            System.out.println("The entered number is even");
        }
        else{
            System.out.println("the entered number is odd");
        }

    }
}
