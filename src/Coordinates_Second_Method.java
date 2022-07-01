public class Coordinates_Second_Method {

    static boolean check(int x1, int y1, int x2, int y2){
        if(x1>x2 && y1>y2){
            return false;
        }
        if(x1==x2 && y1==y2){
            return true;
        }
        return(check(x1+y1, y1,x2,y2)) || check(x1,x1+y1,x2,y2);
    }
    public static void main(String[] args) {
        int x1 = 2, y1 = 10, x2 = 26, y2 = 12;
        if(check(x1,y1,x2,y2))
            System.out.println(true);
    }
}
