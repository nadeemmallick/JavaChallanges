import java.util.Scanner;

class Fahreinhit {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entwer your temperature in F :");
        float Fah = input.nextFloat();

        float C = (Fah - 32 ) * 5/9;

        System.out.println(C);
    }
}
