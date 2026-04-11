import java.util.Scanner;

class MinimumOfTwoNumber {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n = sc.nextInt();
        System.out.print("Enter the second number: ");
        int m = sc.nextInt();

        MinimumOfTwoNumber ternary= new MinimumOfTwoNumber();
        int min = ternary.min(n, m);
        System.out.println("Minimum of two numbers is " + min);

    }


    public int min(int n, int m) {
        return n < m ? n : m;
    }
}
