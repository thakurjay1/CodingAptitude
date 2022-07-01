import java.util.Scanner;

public class Print_First_Occurence_Of_Upper_Case_Character_In_String {
    static void upper(char str[], int i){
        if(str[i]>='A' && str[i]<='Z'){
            System.out.println(str[i]);
            return;
        }
        if(str==null){
            System.out.println("No upper case found");
            return;
        }
        upper(str,i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        //upper(str,0);               ERROR


    }
}
