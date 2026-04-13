import java.util.Scanner;

class PasswordChecker {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to the Password Checker");
        String password;
        do{
            System.out.print("Enter Your Password: ");
            password = sc.nextLine();
        }while(!isValid(password));

        System.out.println("Your password has been checked, Thank you");

     }

    public static boolean isValid(String password){
        return password.length() <= 6;
    }
}
