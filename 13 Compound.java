import java.util.Scanner;

class Compound {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your principle  $");
        int P = input.nextInt();
        System.out.println("Enter your intrest  rate :");
        float R = input.nextFloat();
        System.out.println("Enter the year of broweing  :");
        float T = input.nextFloat();

        double Compound = P * Math.pow((1+R/100), T);
        System.out.println(Compound);

    }
}
