public class DuplicateElementsInArray {
    public static void main(String[] args) {
        int i,j,count = 0;
        int arr[] = {1,2,4,3,2,4,5,7,3,8,8,4,3,2};
        int n = arr.length;
        for(i=0; i<n; i++){
            count = 1;
            for(j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    count++;
                    arr[j] = 0;
                }
            }
            if(count>1 && arr[i]!=0){
                System.out.println("Duplicate elements "+arr[i]);
            }
        }
    }
}
