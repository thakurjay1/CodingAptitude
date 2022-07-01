public class PowerOf2 {
    public static void main(String[] args) {
        int n = 128;
        /*if(n==0){
            System.out.println("Not a power of 2");
        }
        while(n!=1){
            n = n/2;
            if(n%2 !=0 && n!=1){
                System.out.println("Not a power of 2");
            }
            else{
                System.out.println("Power of 2");
                break;
            }
        }*/

        while(n%2 == 0){
            n = n/2;
        } if(n==1){
            System.out.println("Power of 2");
        }
        else{
            System.out.println("Not a power of 2");
        }
    }
}


// Time Complexity of merge sort in every case is O(n  log n).
