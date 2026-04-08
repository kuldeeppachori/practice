import java.util.Scanner;

public class arrayInitialize {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the size of array : ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.print("enter the elements of the array : ");
        for (int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("your array is : ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
