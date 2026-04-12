import java.util.Scanner;

class calsiSwitch {
    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();
        System.out.print("Please enter the operation (+, -, *, /, %): ");
        String operation = sc.next();

        calsiSwitch calsi = new calsiSwitch();
        double calculater = calsi.calculater(n1, n2, operation);
        System.out.println("Result: " + calculater);

    }

    public double calculater(int n1, int n2, String operation){
        return switch (operation){
            case "+" -> n1 + n2;
            case "-" -> n1 - n2;
            case "*" -> n1 * n2;
            case "/" -> {
                if (n2 == 0){
                    System.out.println("Division by zero is not allowed.");
                    yield Double.NaN;
                }
                yield (double) n1 / n2;
            }
            case "%" -> {
                if (n2 == 0){
                    System.out.println("Modulo by zero is not allowed.");
                    yield Double.NaN;
                }
                yield n1 % n2;
            }
            default -> {
                System.out.println("Invalid operation.");
                yield Double.NaN;
            }
        };
    }
}
