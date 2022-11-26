package Sorting;

public class Selection_sort {
    public static void Selection_sort(int[] arr){
        for (int i=0; i< arr.length; i++){
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr , maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i<=end; i++){
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int arr[] = {11,2,3,454,1};
        Selection_sort(arr);
        for (int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
