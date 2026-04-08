package SeriesPractice1;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n= sc.nextByte();
        boolean isPrime=true;
        if (n<=1){
            System.out.println("Not Prime");
        }
        else{
            for (int i = 2; i*i <=n ; i++) {
                if (n%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if (isPrime){
            System.out.print("Yes it is prime");
        }else {
            System.out.println("Not prime");
        }
    }
}
