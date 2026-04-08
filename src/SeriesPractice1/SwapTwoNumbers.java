package SeriesPractice1;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the first number a : ");
        int a= sc.nextInt();
        System.out.print("enter the second number b : ");
        int b= sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("value of a after swaping : "+a);
        System.out.println("value of b after swapping : "+b);
    }
}
