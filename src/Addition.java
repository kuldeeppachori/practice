import java.util.Scanner;
public class Addition {
    public static void main(String[]args){

         Scanner sc=new Scanner(System.in);
          System.out.println("enter the first number ");
        float a=sc.nextFloat();
        System.out.println(" enter the second  number ");
        float b=sc.nextFloat();
        System.out.println(" enter the third  number ");
        float c=sc.nextFloat();
        float sum=a+b+c;
        System.out.println(sum);
    }
}