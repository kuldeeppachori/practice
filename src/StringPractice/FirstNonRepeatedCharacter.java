package StringPractice;

import java.util.Scanner;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s1=sc.nextLine();
        int [] freq=new int[256];
        for (int i = 0; i <s1.length() ; i++) {
            freq[s1.charAt(i)]++;
        }
        char first=0;
        for (int i = 0; i <s1.length() ; i++) {
            if (freq[s1.charAt(i)]==1){
                first=s1.charAt(i);
                break;
            }

        }
        if (first!=0){
            System.out.println("First non repeated character is : "+first);
        }else {
            System.out.println("No non-repeated character found");
        }
    }
}
