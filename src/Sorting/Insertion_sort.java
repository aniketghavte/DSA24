package Sorting;

public class Insertion_sort {
    /*
    * In this we check every index to its left side and put it at correct index
    */
    static void Insertion_sort(int[] arr){
        for (int i = 0;i< arr.length-1;i++){
            for (int j= i+1; j>0 ;j--){
                if (arr[j] <arr[j-1]){
                    swap(arr,j,j-1);
                } else {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {


        int arr[] = {11,2,3,454,1};
        Insertion_sort(arr);
        for (int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
