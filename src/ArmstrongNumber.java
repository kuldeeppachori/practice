import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n= sc.nextInt();
        int temp=n;
        int count=0;
        int t=temp;
        while (t>0){
            t=t/10;
            count++;
        }
        temp=n;
        int sum=0;
        while (temp>0){
            int digit=temp%10;
            int power=1;
            for (int i = 1; i <=count ; i++) {
                power=power*digit;
            }
            sum+=power;
            temp=temp/10;
        }
        if(sum==n){
            System.out.println("Yes , It is ");
        }else {
            System.out.println("NO , It is not ");
        }

    }
}
