import java.util.Scanner;

class LeapYear {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to leap year checking center ");
        System.out.println("please enter your year :");
        int year = input.nextInt();

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("It is a leap year");
        }else {
            System.out.println("It is not a leap year");
        }

    }
}
