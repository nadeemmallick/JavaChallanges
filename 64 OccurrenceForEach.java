
import java.util.Scanner;

class OccurrenceForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to occurrence for each number");
        int [] arr = ArrayUtility.inputArray();
        System.out.println("Please enter the number you would like to search for:");
            int element = input.nextInt();
            int count = countOccurrence(arr, element);
            System.out.println("Number of occurrences: " + count+ " times") ;

    }

    public static int countOccurrence(int [] nums, int element) {
        int count = 0;
        for(int num : nums){
            if(num == element){
                count++;
            }
        }
        return count;
    }
}
