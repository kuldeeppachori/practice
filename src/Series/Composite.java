package Series;

import java.util.Scanner;

public class Composite {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n= sc.nextInt();
        boolean isComposite=false;
        for (int i = 2; i <=n/2 ; i++) {
            if(n%i==0){
                isComposite=true;
                break;
            }

        }
        if(isComposite){
            System.out.println("Yes, It is composite number ");
        }else {
            System.out.println("NOT composite");
        }
    }
}
