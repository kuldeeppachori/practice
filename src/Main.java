import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        System.out.println("here we find the average of five subjects");
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter  the marks of english ");
        float e=sc.nextFloat();
        System.out.println(" enter the marks  of hindi ");
        float h=sc.nextFloat();
        System.out.println(" enter the marks of science ");
        float s=sc.nextFloat();
        System.out.println("enter  the marks  of mathematics");
        float m=sc.nextFloat();
        System.out.println("enter the marks of social science ");
        float ss=sc.nextFloat();
        float total=e+h+s+m+ss;
        float avg;
        avg=total/5;
        System.out.println("the average is ");
        System.out.println(avg);



    }
}

