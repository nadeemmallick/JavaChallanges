import java.util.Scanner;

class AgeVerfication {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to age verification center");
        System.out.println("Please enter your age :");
        int age = input.nextInt();
        
        if(age >20 && age <= 60){
            System.out.println("Hello adult citizen");
        } else if (age > 60) {
            System.out.println("senior");
        } else if (age <= 20) {
            System.out.println("Teen");

        } else if (age <= 13) {
            System.out.println("Child");

        }

    }
}
