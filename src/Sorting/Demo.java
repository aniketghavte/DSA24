package Sorting;
import java.util.ArrayList;

class Demo {

    public static void Odds(ArrayList<Integer> List){
        int odds = 0;
        for (int i =0; i<List.size();i++){
            if( List.get(i) % 2 != 0){
                odds++;
            }
        }
        System.out.println(odds);
    }

    public static void Even(ArrayList<Integer> List){
        int even = 0;
        for (int i =0; i<List.size();i++){
            if( List.get(i) % 2 == 0){
                even++;
            }
        }
        System.out.println(even);
    }

    static void palindrome(ArrayList<Integer> arr, int n)
    {
        // Initialise flag to zero.
        int flag = 0;

        // Loop till array size n/2.
        for (int i = 0; i <= n / 2 && n != 0; i++) {

            // Check if first and last element are different
            // Then set flag to 1.
            if (arr.get(i) != arr.get(n - i - 1)) {
                flag = 1;
                break;
            }
        }

        // If flag is set then print Not Palindrome
        // else print Palindrome.
        if (flag == 1)
            System.out.println("Not Palindrome");
        else
            System.out.println("Palindrome");
    }


    private static int countPrimeNumbers(ArrayList<Integer> list) {
        int count = 0;
        for (int i : list) {
            if (isPrime(i)) {
                count += 1;
            }
        }
        return count;
    }

    // FYI... logic to find prime number can further be optimised, i will leave it upto you
    private static boolean isPrime(int number) {
        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

        ArrayList<Integer> List= new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(2);
        List.add(1);
        List.add(3);
        List.add(5);
        List.add(6);
        List.add(7);
        List.add(8);
        System.out.println(List);
        System.out.print("No of odd no's in arraylist is::");Odds(List);
        System.out.print("No of odd no's in arraylist is::");Even(List);

        palindrome(List, List.size());
        int result = countPrimeNumbers(List);

        System.out.println("Number of prime numbers = " + result);
    }
}
