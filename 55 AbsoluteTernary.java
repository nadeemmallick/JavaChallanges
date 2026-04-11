import java.util.Scanner;

class AbsoluteTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        AbsoluteTernary AB = new AbsoluteTernary();
        int absolute = AB.absolute(n);
        System.out.println(absolute);


    }

    public int absolute(int n){
        return n>=0 ? n : -n;
    }
}
