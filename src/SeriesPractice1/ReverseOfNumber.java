package SeriesPractice1;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n= sc.nextInt();
        int temp=n;
        int rev=0;
        while (temp>0){
            rev=rev*10+temp%10;
            temp=temp/10;
        }
        System.out.println("Reverse fo " + n + " is  : "+rev);
    }
}
