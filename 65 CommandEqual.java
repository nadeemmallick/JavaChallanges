import java.util.Scanner;

class CommandEqual {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter command: ");
            String command = sc.nextLine();
            if(command.equalsIgnoreCase("exit")){
                break;
            }

        }
        System.out.println("you successfully escape");
    }
}
