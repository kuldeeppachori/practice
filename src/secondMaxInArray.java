import java.util.Scanner;

public class secondMaxInArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the size of array : ");
        int n= sc.nextInt();
        System.out.println("enter the elements of array : ");
        int a[]=new int[n];
        for (int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        System.out.println("your array is : ");
        for (int ele:a){
            System.out.println(ele+" ");
        }
        int max=a[0];
        for (int i=1;i<n;i++){
            if (a[i]>max){
                max=a[i];
            }
        }
        System.out.println("the maximum element of array is "+max);
        int smax=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if (a[i]!=max){
                 smax=Math.max(smax,a[i]);
            }
        }
        System.out.println("the second largest element in array is "+smax);
    }
}
