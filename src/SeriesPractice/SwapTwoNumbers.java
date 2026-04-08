package SeriesPractice;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number a : ");
        int a= sc.nextInt();
        System.out.print("Enter the second number b : ");
        int b= sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Value of a after swapping : " +a);
        System.out.println("Value of a after swapping "+b);
    }
}
