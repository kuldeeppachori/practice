package Series;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of terms of the series : ");
        int n= sc.nextInt();
        int a=0,b=1;
        for (int i = 2; i <n ; i++) {
            int c=a+b;
            System.out.println(" "+c);
            a=b;
            b=c;
        }
    }
}
