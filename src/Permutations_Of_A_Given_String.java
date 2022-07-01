import java.util.Scanner;

public class Permutations_Of_A_Given_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = sc.next();
        char s[] = input.toCharArray();
        for(int i=0; i<s.length; i++){
            char temp;
            for(int j=i+1; j<s.length; j++){
                temp = s[i];
                s[i] = s[j];
                s[j] = temp;
                System.out.println(s);
            }
        }
    }

}
