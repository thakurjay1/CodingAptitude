import java.util.Scanner;

public class Pair_with_Given_Sum {
    public static void main(String[] args) {
        // Find a pair with given sum in an array.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sum");
        int sum = sc.nextInt();
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int x = 0; x < n; x++) {
            arr[x] = sc.nextInt();
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == sum) {
                        System.out.println("Pair found (" + arr[i] + "," + arr[j] + ")");
                    }
                }
            }


        }
    }
}
