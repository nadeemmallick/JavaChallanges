import java.util.Scanner;

class ArthemiticOperator {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int NumberOne = input.nextInt();
        System.out.print("Enter the second number :");
        int SecondOne = input.nextInt();

       int Addition = NumberOne + SecondOne;
       int Substraction = NumberOne - SecondOne;
       int Multiplication = NumberOne * SecondOne;
       int Division = NumberOne / SecondOne;
       int Mudulo = NumberOne % SecondOne;

        System.out.println("Addition of number :" + Addition);
        System.out.println("Substraction of number is :" + Substraction);
        System.out.println("Multiplication of number is :" +Multiplication);
        System.out.println("Division of number is :" +Division);
        System.out.println(("Mudulo of number is :" +Mudulo));

    }


}
