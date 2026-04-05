import java.util.Scanner;

class Factorial {
    static void main(String[] args) {
        System.out.println("Welcome to Factorial Calculator\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        long fact = factorial(num);
        System.out.println("Factorial of " + num + " is " + fact);

    }
    public static long factorial(int num) {
        if(num < 2){
            return 1;
        }
        long fact = 1;
        int i = 2;
        while(i <= num){
            fact*=i;
            i++;

        }
        return fact;

    }
}
