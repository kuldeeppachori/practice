import java.util.Scanner;

public class merge2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the size of first array : ");
        int l= sc.nextInt();
        int a[]=new int[l];
        System.out.println("enter the elements of first array : ");
        for (int i=0;i<l;i++){
            a[i]= sc.nextInt();
        }
        System.out.print("enter the size of second array : ");
        int m= sc.nextInt();
        System.out.print("enter the elements of second array: ");
        int b[]=new int[m];
        for (int i=0;i<m;i++){
            b[i]= sc.nextInt();
        }
        int n=a.length+b.length;
        int c[]=new int[n];
        int i=l-1,j=m-1,k=n-1;
        while (i>=0 && j>=0){
            if (a[i]>=b[j]){
                c[k]=a[i];
                i--;
                k--;
            }else {
                c[k]=b[j];
                j--;
                k--;
            }
        }
        if (i<0){
            while (j>=0){
                c[k]=b[j];
                j--;
                k--;
            }
        }
        if (j<0){
            while (i>=0){
                c[k]=a[i];
                i--;
                k--;
            }
        }
        System.out.println("sorted array is : ");
        for (int ele:c){
            System.out.print(ele+" ");
        }
    }
}
