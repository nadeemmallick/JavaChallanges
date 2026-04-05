import java.util.Scanner;
class GreatestOfThree {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the world of theee\n");
        System.out.println("please enter the first number: ");
        int first = input.nextInt();
        System.out.println("please enter the second number: ");
        int Second = input.nextInt();
        System.out.println("please enter the Third number: ");
        int Third = input.nextInt();

        if(first >= Second && first >= Third){
            System.out.println("First number is greatest");
        }else if(Second >= Third && Second >= first){
            System.out.println("second is greatest");
        }else{
            System.out.println("third is greatest");
        }

    }
}
