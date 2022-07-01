public class X_Raise_to_the_Power_Y_Using_Recursion {

     static int power(int x, int y) {
        int temp;
        if (y == 0)
            return 1;
            temp = power(x, y / 2);
            if (y % 2 == 0) {
                return temp * temp;
            } else {
                return temp * temp * x;
            }
        }

    public static void main(String[] args) {
        int x = power(2,3);
        System.out.println(x);

    }
}
