package SeriesPractice;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number to check palindrome : ");
        int n= sc.nextInt();
        int temp=n;
        int rev=0;
        while (temp>0){
            rev= rev*10+temp%10;
            temp=temp/10;
        }
        if(n==rev){
            System.out.println("Yes number is Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
