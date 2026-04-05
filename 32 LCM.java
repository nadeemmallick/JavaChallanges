import java.util.Scanner;
class LCM {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number :");
        int first = sc.nextInt();
        System.out.println("enter the second number :");
        int second = sc.nextInt();
        int lcm= lcm(first,second);
        System.out.println("lcm = "+lcm);
    }
    public static int lcm(int first,int second){
        int i =1;
        while(true){
            int factorial = first*i;
            if(factorial%second==0){
                return factorial;
            }
            i++;
        }

    }
}
