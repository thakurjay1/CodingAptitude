import java.util.Scanner;

public class Recursive_Program_To_Find_Factorial {

    static double factorial(double n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number");
        double n = obj.nextDouble();
        System.out.println(factorial(n));

    }
}
