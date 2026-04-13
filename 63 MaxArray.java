class MaxArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Max Array");
        int[] arr = ArrayUtility.inputArray();

        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (max < num){
                max = num;
            }
        }
        System.out.println("Max Array is "+max);

    }
}
