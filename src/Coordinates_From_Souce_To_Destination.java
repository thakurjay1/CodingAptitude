import java.util.Scanner;

public class Coordinates_From_Souce_To_Destination {


   public static  boolean coordinate(int x1, int y1, int x2, int y2){
       boolean b = false;
       while(x1<=x2 || y1<=y2){
           if(x1+y1 ==x2 || y1+x1 == y2){
              b = true;
           }
           else {
               b = false;
           }
       }
       return b;
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1");
        int x1 = sc.nextInt();
        System.out.println("Enter y1");
        int y1 =sc.nextInt();
        System.out.println("Enter x2");
        int x2 = sc.nextInt();
        System.out.println("Enter y2");
        int y2 = sc.nextInt();
        System.out.println(coordinate(x1,y1,x2,y2));
    }
}
