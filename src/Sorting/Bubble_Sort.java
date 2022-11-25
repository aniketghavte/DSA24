package Sorting;

public class Bubble_Sort {
    static void bubble_sort(int[] arr){
        for (int i=0; i<arr.length; i++){
            for (int j =1; j<arr.length - i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {

        int arr[] = {11,2,3,454,1};
        bubble_sort(arr);
        for (int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
