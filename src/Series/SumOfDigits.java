package Series;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        int temp= n,sum=0;
        while (temp>0){
            int digit=temp%10;
            sum=sum+digit;
            temp=temp/10;
        }
        System.out.println("Sum of the digits of "+ n +" is "+ sum);
    }
}
