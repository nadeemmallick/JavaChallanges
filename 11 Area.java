import java.util.Scanner;

class Area {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Area of Triangle\n");
        System.out.print("Enter the breath of triangle :");
        double breath = input.nextDouble();
        System.out.print("Enter the height of triangle :");
        double height = input.nextDouble();

        double Area = 0.5 * breath * height;

        System.out.println(Area);

    }
}
