package pattern;

import java.util.Scanner;

public class starDiamond {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number : ");
        int n= sc.nextInt();
        int noOfSpaces=n-1;
        int noOfStar=1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=noOfSpaces;j++){
                System.out.print(" "+" ");
            }
            for (int j=1;j<=noOfStar;j++){
                System.out.print("*"+" ");
            }
            noOfSpaces--;
            noOfStar+=2;
            System.out.println();
        }
        noOfStar=noOfStar-4;
        noOfSpaces=1;
        for (int i=1;i<=n-1;i++){
            for (int j=1;j<=noOfSpaces;j++){
                System.out.print(" "+" ");
            }
            for (int j=1;j<=noOfStar;j++){
                System.out.print("*"+" ");
            }
            noOfSpaces++;
            noOfStar-=2;
            System.out.println();
        }
    }
}
