public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 5;
        if(n==2 || n==3 || n==5 || n==7){
            System.out.println("Prime Number");
            return;
        }
        if(n%2==0){
            System.out.println("Not Prime");
            return;
        }
        for(int i=3; i<=Math.sqrt(n); i= i+2){
            if(n%i == 0){
                System.out.println("Not Prime");
                return;
            }
            else{
                System.out.println("Prime Number");
                return;
            }
        }
    }
}
