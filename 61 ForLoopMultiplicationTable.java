import java.util.Scanner;

class ForLoopMultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the For Loop Multiplication Table");
        System.out.print("please enter the number you want the table :");
        int num = input.nextInt();
        printTable(num);
    }

    public static void printTable(int num) {
        for (int i = 1; i <=10 ; i++) {
            System.out.println(num+" X "+ i + " = " + (num*i));
        }
    }
}
