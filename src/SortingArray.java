import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int j=0; j<n-1;j++){
            int x = arr[j];
            int x1 = arr[j+1];
            if(x>x1){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                j=-1;
            }
        }
        System.out.println("Sorted elements are:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
