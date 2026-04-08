package StringPractice;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s=sc.nextLine();
        String result="";
        for (int i = 0; i <s.length() ; i++) {
            char c=s.charAt(i);
            boolean seen=false;
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j)==c){
                    seen=true;
                    break;
                }
            }
            if (!seen){
                result =result+c;
            }

        }
        System.out.println("After removing duplicate letters : "+result);
    }
}
