import java.sql.SQLOutput;
import java.util.Scanner;

class SimpleIntrest {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your principle $");
        int P = input.nextInt();
        System.out.println("Enter your intrest rate :");
        float R = input.nextFloat();
        System.out.println("Enter the year of broweing :");
        float T = input.nextFloat();

        double SimpleIntrest = (P*R*T)/100;

        System.out.println(SimpleIntrest);

    }
}
