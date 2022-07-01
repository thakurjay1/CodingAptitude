import java.util.Scanner;

public class Reverse_And_Print_Number_Using_Recursion {
     static int reverse = 0;
     static int reverse(int num){
        //System.out.println(reverse);
        reverse = reverse*10+num%10;
        num = num/10;
        if(num>0){
            reverse(num);
        }
       return reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println(reverse(n));
    }
}
