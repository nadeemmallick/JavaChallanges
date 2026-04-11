import java.util.Scanner;

class oddevenTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        oddevenTernary obj = new oddevenTernary();
        String oddEven = obj.oddEven(n);
        System.out.println(oddEven);


    }

    public String oddEven(int n){
        return n%2==0? "even":"odd";
    }
}
