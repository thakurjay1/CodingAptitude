import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String");
        String a =sc.next();
        System.out.println("Enter Second String");
        String b = sc.next();
        boolean isAnagram = false;

        boolean isUsed[] = new boolean[b.length()];
        if(a.length() == b.length()){
            for(int i=0; i<a.length(); i++){
                char c = a.charAt(i);
                isAnagram = false;
                for(int j=0; j<b.length(); j++){
                    if(b.charAt(j) == c && !isUsed[j]){
                        isUsed[j] = true;
                        isAnagram = true;
                        break;
                    }
                }
                if(!isAnagram){
                    break;
                }
        }

        }
        if(isAnagram){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }




    }
}
