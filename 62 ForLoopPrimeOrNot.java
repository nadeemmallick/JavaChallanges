import java.sql.SQLOutput;
import java.util.Scanner;

class ForLoopPrimeOrNot {
    public static void main(String[] args) {
        System.out.println("welcome to prime checking number ");
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int num = input.nextInt();
        System.out.println("your number is "+ (isPrime(num) ? " Prime " : " Not Prime "));
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
            }
        return true;

        }
    }
