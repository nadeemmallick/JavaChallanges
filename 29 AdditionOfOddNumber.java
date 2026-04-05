import java.util.Scanner;

class AdditionOfOddNumber {
    static void main(String[] args) {
        System.out.println("Welcome to odd addition\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number :");
        int num = input.nextInt();
        int sum = oddsum(num);
        System.out.println("oddsum till : " + num + " is " + sum);

    }
    public static int oddsum(int num){
        int sum = 0;
        int i = 1;

        while (i <= num){
            sum += i;
            i += 2;
        }
        return  sum;

    }



}
