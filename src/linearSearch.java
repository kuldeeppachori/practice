import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array : ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.print("enter the elements of array : ");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("enter the target element : ");
        int x= sc.nextInt();
        boolean flag= false;
        for (int i=0;i<n;i++){
            if (arr[i]==x){
                flag=true;
                break;
            }
        }
        if (flag==true){
            System.out.println("element found in the array ");
        }else {
            System.out.println("element not found in the array ");
        }

    }
}
