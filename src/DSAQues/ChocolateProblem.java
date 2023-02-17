package DSAQues;

import java.util.Arrays;

public class ChocolateProblem {
    public static int MinimumDiff(int arr[], int m){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int min = arr[arr.length- 1];
        for (int i=0 ; i < arr.length-m+1 ;i++) {
            int diff = arr[i+m-1] - arr[i];
            if (min > diff){
                min = diff;
            }
        }
        return min;
    }
    public static void main(String[] args) {

        int arr[] = {17, 83, 59, 25, 38, 63, 25, 1, 37};

        System.out.println(MinimumDiff(arr, 9));
    }
}
