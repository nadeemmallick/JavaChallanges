import java.util.Scanner;

class DeleteFromArray {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] Array = ArrayUtility.inputArray();

        System.out.print("Enter the number you want to remove:");
        int numToDelete = input.nextInt();

        int[] newArr = deleteNumber(Array,numToDelete);
        System.out.println("here is your new array :");

        ArrayUtility.displayArray(newArr);

    }
    public static int[] deleteNumber(int[] Array, int numToDelete){
        int occ = Occurrences.occur(Array,numToDelete);
        if(occ==0){
            return Array;
        }
        int newSize = Array.length - occ;
        int[] newArray = new int[newSize];

        int i = 0, j = 0;
        while(i<Array.length){
            if(Array[i]!=numToDelete){
                newArray[j] = Array[i];
                j++;
            }
            i++;
        }


        return newArray;

    }
}
