import java.util.Scanner;

public class productOfArrayElements {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the size of array : ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.print("enter the elements of array : ");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int product=1;
        for (int i=1;i<n;i++){
            product=product*arr[i];
        }
        System.out.println("Product of the array is : "+product);
    }
}
