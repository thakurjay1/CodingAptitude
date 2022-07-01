import java.util.Scanner;

public class GCD_Max_And_Min {
    static int min;
   static int max;

    static int printMin(int arr[], int length){
        int min;
        min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    static int printMax(int arr[] , int length){
        int max;
        max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    static void GCD(){
        for(int i=1; i<=min; i++){
            if(min%i==0 && max%i ==0);
        }
    }
    public static void main(String[] args) {
        // Given an array, find the maximum and minimum element. Find the GCD of maximum and minimum element of array.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values in an array");
        int f= sc.nextInt();
        System.out.println("Enter the values of array");
        for(int i=0; i<f; i++){
            int arr = sc.nextInt();
        }





    }
}
