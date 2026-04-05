import java.util.Scanner;

class PercentageRemark {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to your result checking center");

        System.out.println("Please enter your % :");
        int mark = input.nextInt();

        if (mark >= 90) {
            System.out.println("well done you got A grade");
        } else if (mark >= 75) {
            System.out.println("well done you got B grade");
        } else if (mark >= 60) {
            System.out.println("well done you got C grade");
        } else if (mark >= 30) {
            System.out.println("well done you got D grade");
        }else{
            System.out.println("you have to focus on your self you got F");
    }
    }
}