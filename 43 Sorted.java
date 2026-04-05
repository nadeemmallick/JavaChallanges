class Sorted {
    static void main(String[] args) {
        System.out.println("Welcome to Sorted\n");
        int [] numArr = ArrayUtility.inputArray();
        boolean isInc = isIncreasing(numArr);
        boolean isDec = isDecreasing(numArr);
        if(isInc || isDec){
            System.out.println("Your array is sorted");
        }else {
            System.out.println("Your array is not sorted");
        }
//        System.out.println(sort ? "Sorted" : "Unsorted");

    }
    public static  boolean isDecreasing(int [] numArr) {
        int i = 1;
        while(i < numArr.length){
            if(numArr[i] < numArr[i-1]){
                return false;

            }
            i++;
        }
        return true;
    }
    public static  boolean isIncreasing(int [] numArr) {
        int i = 1;
        while(i < numArr.length){
            if(numArr[i] > numArr[i-1]){
                return false;

            }
            i++;
        }
        return true;
    }


//    public static boolean isSorted(int[] numArr){
//        int i = 0;
//        while (i < numArr.length-1){
//            if (numArr[i] > numArr[i+1]){
//                return false;
//            }
//            i++;
//        }
//        return true;
//
//    }

}
