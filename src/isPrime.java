import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number : ");
        int n= sc.nextInt();
        boolean prime=true;
        if(n<=1){
            System.out.println("Not Prime ");
        }
        else {
            for (int i = 2; i*i <=n ; i++) {
                if(n%i==0){
                    prime=false;
                    break;
                }
            }
        }
        if(prime){
            System.out.println("Number is prime ");
        }else {
            System.out.println("Not prime");
        }
    }
}
