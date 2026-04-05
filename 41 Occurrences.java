import java.util.Scanner;

class Occurrences {
    static void main(String[] args) {
        System.out.println("Welcome to check the occurrences of elements\n");
        Scanner sc = new Scanner(System.in);
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Now enter the number you want to find :");
        int num = sc.nextInt();
        int occurrences = occur(numArr, num);
        System.out.println(occurrences + " occurrences");
//        int[] check = {12,23,43,54,65,56,67,78,65};
    }
    public static int occur(int[] numArr,int num){
        int occurrences = 0;
        int i = 0;
        while(i < numArr.length){
            if(numArr[i] == num){
                occurrences++;
            }
            i++;
        }
        return occurrences;
    }
//    public static int occur(int[] numArr ,int num){
//        int occ = 0;
//        int i = 0;
//        while(i < numArr.length){
//            if(numArr[i] == num){
//                occ++;
//            }
//            i++;
//        }
//        return  occ;
//
//    }
}
