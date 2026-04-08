import java.util.Scanner;

public class reverseOfArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the size of array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        for (int ele:a){
            System.out.print(ele+" ");
        }
        System.out.println();

        for (int i=0;i<n/2;i++){
            int j=n-1-i;
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        System.out.println("the sorted array is :");
        for (int ele:a){
            System.out.print(ele+" ");
        }
    }
}
