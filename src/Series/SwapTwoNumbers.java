package Series;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a= sc.nextInt();
        System.out.print("Enter the second number : ");
        int b= sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Now the value of a after reversing is : "+ a);
        System.out.println("Now the value of b after reversing is : "+b);
    }
}
