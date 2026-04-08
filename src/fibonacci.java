import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no of terms : ");
        int n= sc.nextInt();
        int a=0,b=1;
        System.out.print(a+"  "+b);
        for (int i = 2; i <n ; i++) {
            int c=a+b;
            System.out.println(" " +c);
            a=b;
            b=c;
        }
    }
}
