package String;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a sentence or word : ");
        String s= sc.nextLine();
        int count=0;
        for (char c:s.toCharArray()){
            count++;
        }
        System.out.println("Total number of words is : "+count);

    }
}
