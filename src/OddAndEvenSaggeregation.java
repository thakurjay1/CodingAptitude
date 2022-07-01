public class OddAndEvenSaggeregation {
    public static void main(String[] args) {
        int a[] = {4,11,7,9,8,8,5,8,7,6,5,30,4,7,3,10,11,1,};
        int j = -1;
        int temp;
        int n = a.length;
        for(int i=0; i<n; i++){
            if(a[i]%2==0){
                j++;
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
    }
}
