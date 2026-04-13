import java.util.Scanner;

class FloatingPoint {
    static void main(String[] args) {
        System.out.println("Welcome to floating point production\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first floating number :");
        double A = input.nextDouble();
        System.out.print("Enter your second floating number :");
        double B = input.nextDouble();

        double C = A * B;

        System.out.println("The production of two floating number is :" + C);

    }
}
