import java.util.Scanner;

class Swap {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to swapping zone\n");
        System.out.print("Enter the value of A :");
        int a = input.nextInt();
        System.out.print("Enter the value of B :");
        int b = input.nextInt();

        int c = a;

        a = b;
        b = c;

        System.out.println("swapped number A is :"+a);
        System.out.println("swapped number B is :"+b);



    }
}
