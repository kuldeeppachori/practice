package StringPractice;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first string s1: ");
        String s1=sc.nextLine();
        System.out.print("Enter the second string s2 : ");
        String s2=sc.nextLine();
        int [] f1=new int[256];
        int [] f2=new int[256];
        for (int i = 0; i <s1.length() ; i++) {
            char c=s1.charAt(i);
            if(c!=' '){
                if (c>='A' && c<='Z'){
                    c=(char) (c+('a'-'A'));
                }
                f1[c]++;
            }
        }
        for (int i = 0; i <s2.length() ; i++) {
            char c=s2.charAt(i);
            if (c!=' '){
                if (c>='A'&& c<='Z'){
                    c=(char) (c+('a'-'A'));
                }
                f2[c]++;
            }
        }
        boolean anagram=true;
        for (int i = 0; i <256 ; i++) {
            if (f1[i]!=f2[i]){
                anagram=false;
                break;
            }

        }
        System.out.println( anagram ? "Anagram" : "Not Anagram");

    }
}
