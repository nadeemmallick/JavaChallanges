import java.util.Scanner;

class ParameterOfRectangle {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Parameter of Rectangle\n");

        System.out.print("First side of Rectangle :");
        int A = input.nextInt();
        System.out.print("Second side of Rectangle :");
        int B = input.nextInt();
        System.out.print("Third side of Rectangle :");
        int C = input.nextInt();
        System.out.print("Fourth side of Rectangle :");
        int D = input.nextInt();

        int Parameter = A+B+C+D;

        System.out.println("Parameter of Rectangle is :" + Parameter);

    }
}
