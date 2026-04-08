import java.util.Scanner;

public class mergeTwoArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of first array : ");
        int l= sc.nextInt();
        System.out.println("enter the elements of first array : ");
        int a[]=new int[l];
        for (int i=0;i<l;i++){
            a[i]= sc.nextInt();
        }
        System.out.print("Enter the size of second array : ");
        int m= sc.nextInt();
        System.out.print("enter the elements of second array : ");
        int b[]=new int[m];
        for (int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        int c[]=new int[a.length+b.length];
        int i=0,j=0,k=0;
        while (i<a.length && j<b.length){
              if(a[i]>=b[j]){
                  c[k]=a[i];
                  i++;
                  k++;
              }else {
                  c[k]=b[j];
                  j++;
                  k++;
              }
        }
        if(i==a.length){
            while (j<b.length){
                c[k]=b[j];
                j++;
                k++;
            }
        }
        if(j==b.length){
            while (i<a.length){
                c[k]=a[i];
                i++;
                k++;
            }
        }
        System.out.println("merged array is : ");
        for(int ele:c){
            System.out.print(ele+" ");
        }
    }
}
