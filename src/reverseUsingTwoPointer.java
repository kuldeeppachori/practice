import java.util.Scanner;

public class reverseUsingTwoPointer {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the size of array : ");
        int n= sc.nextInt();
        System.out.print("enter the elements of array : ");
        int a[]= new int[n];
        for (int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        System.out.println("your array is : ");
        for (int ele:a){
            System.out.print(ele+" ");
        }
        System.out.println();
        int i=0,j=n-1;
        while (i<=j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        System.out.println("reversed array is : ");
        for (int ele:a){
            System.out.print(ele+" ");
        }
    }
}
