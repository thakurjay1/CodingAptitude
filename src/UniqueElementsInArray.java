import java.util.Scanner;

public class UniqueElementsInArray {
    public static void main(String[] args) {
//        Write a program to print all the unique elements of an array.
         int i,j,count=0;
         int arr[] = {1,1,2,3,4,2,5,6,4};
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter");
        for(int x=0; x<n; x++){
            arr[x] = sc.nextInt();
        }*/
        for(i=0;i<arr.length;i++){
            count = 0;
            for(j=0; j< arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.println("Unique elements "+ arr[i]);
            }
        }
    }
}
