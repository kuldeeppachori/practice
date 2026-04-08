package SeriesPractice1;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n= sc.nextInt();
        int temp=n;
        int t=temp;
        int count=0;
        while (t>0){
            t=t/10;
            count++;
        }
        int sum=0;
        while (temp>0){

            int num=temp%10;
            int pow=1;
            for (int i = 1; i <=count ; i++) {
                pow*=num;
            }
            sum=sum+pow;
            temp=temp/10;
        }
        if(sum==n){
            System.out.println("Yes Number is armstrong ");
        }else {
            System.out.println("Not Armstrong ");
        }
    }
}
