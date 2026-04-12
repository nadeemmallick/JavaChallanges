import java.util.Scanner;

class monthTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to month checking center");
        System.out.print("Please enter a number between 1 and 12 :");
        int month = input.nextInt();
        String monthName = monthWise(month);
        System.out.print("your month is :"+monthName);

    }

    public static String monthWise(int month){
        return switch (month){
    case 1 -> "January";
    case 2 -> "February";
    case 3 -> "March";
    case 4 -> "April";
    case 5 -> "May";
    case 6 -> "June";
    case 7 -> "July";
    case 8 -> "August";
    case 9 -> "September";
    case 10 -> "October";
    case 11 -> "November";
    case 12 -> "December";
    default -> "Unexpected value ";

};

    }
}
