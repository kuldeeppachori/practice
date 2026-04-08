package StringPractice;

import java.util.Scanner;

public class CountVowelConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s=sc.nextLine();
        int vowel=0,consonant=0;
        for (int i = 0; i <s.length() ; i++) {
            char c=s.charAt(i);
            if(c>='A' && c<='Z'){
                c=(char) (c+('a'-'A'));
            }
            if (c>='a' && c<='z'){
                if (c=='a' || c=='e' ||c=='i'||c=='o'||c=='u'){
                    vowel++;
                }else {
                    consonant++;
                }
            }
            
        }
        System.out.println("Vowels : " +vowel);
        System.out.println("Consonants : " +consonant);
    }
}
