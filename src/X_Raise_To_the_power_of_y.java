import java.util.Scanner;

public class X_Raise_To_the_power_of_y {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        System.out.println("Enter the value of y");
        int y = sc.nextInt();
        int result = 1;
        while(y!=0){
            result*=x;
            y--;
        }
        System.out.println(result);

    }
}
