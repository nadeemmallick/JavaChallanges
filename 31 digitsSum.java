import java.util.Scanner;
class digitsSum {
    static void main(String[] args) {
        System.out.println("Welcome to digits sum\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int sum = digit(num);
        System.out.println("digits sum : " + sum);

    }
    public static int digit(int num){
        int sum = 0;
        while(num > 0){
            sum = sum + (num % 10);
            num /= 10;
        }
        return sum;
    }

}
