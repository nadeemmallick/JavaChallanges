import java.util.Scanner;

class ReverseArray {
    static void main(String[] args) {
        System.out.println("Welcome to the Reverse Array\n");
        int[] Array = ArrayUtility.inputArray();
        Reverse(Array);
        System.out.println("The reversed array :");
        ArrayUtility.displayArray(Array);

    }

   public static void Reverse(int[] Array) {
int i = 0;
while (i < Array.length/2) {
    int swap = Array[i];
    Array[i] = Array[(Array.length-1)-i];
    Array[(Array.length-1)-i] = swap;

    i++;
}

    }
}
