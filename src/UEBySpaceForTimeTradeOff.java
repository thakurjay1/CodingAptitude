public class UEBySpaceForTimeTradeOff {
    public static void main(String[] args) {
        int a[] = {1,2,3,3,4,5,5,6,7,8,2};
        int f[] = new int[9];


        int i,n;
        n = a.length;
        for(i=0; i<n; i++){
            f[a[i]]++;      //Counting the frequency of elements.
        }
        for(i=0; i<n; i++){
            if(f[a[i]]==1){
                System.out.println("Unique Elements "+a[i]);
            }
        }
    }
}
