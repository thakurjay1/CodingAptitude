import java.util.Scanner;

public class PrintNumberInWords {
    public static void main(String[] args) {
        //Write a program to print a number in words(max digits:4)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        String ones[] = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen" };
        String tens[] = {"", "", "twenty", "thirty", "forty", "fifty", "sixty","seventy", "eighty", "ninety"};
        String hundred = "hundred";
        String thousand = "thousand";
        if(n<20){
            System.out.println(ones[n]);
        }
        else if(n>20 && n<100){
            System.out.println(tens[n/10] + ones[n%10]);
        }
        else if(n>=100 && n<1000){
            System.out.println(ones[n/100] + hundred +" and "+tens[n%100]);
        }
        else if(n>=1000 && n<=10000){
            System.out.println(ones[n/1000] );
        }

    }

}
