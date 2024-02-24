package org.demo.epam;

public class Q2 {
    public static void main(String[] args) {
        System.out.println(elementsLenForASum());
    }

    static int elementsLenForASum() {
        int combinationCount = 0;
        int[] arr = {15, 4, -2, 2, -3, 1, 3, 3, 0};
        int targetSum = 4;
        /*
            4 => len 1
            4 + -2 + 2 => len 3
            -----
            4 + -2 + 2 + -3 + 1 + 3 =? len 7
         */

        for (int i = 0; i < arr.length; i++) {
            int tempCount = 1;
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                if (sum >= targetSum) {
                    break;
                }
                tempCount++;
                sum += arr[j];
            }

            if (combinationCount < tempCount) {
                combinationCount = tempCount;
            }
        }

        return combinationCount;
    }
}
