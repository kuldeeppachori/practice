import java.util.Scanner;

public class sortZeroOneTwo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the size of array : ");
        int n= sc.nextInt();
        System.out.println("enter elements only from Zero, one or two : ");
        int arr[]=new int[n];
        for (int i=0; i<n;i++ ){
            arr[i]= sc.nextInt();
        }
        int noOfZero=0,noOfOnes=0;
        for (int i=0; i<n;i++){
            if (arr[i]==0) noOfZero++;
            if (arr[i]==1) noOfOnes++;
        }
        for (int i=0;i<n;i++){
            if (i<noOfZero){
                arr[i]=0;
            } else if (i<noOfZero+noOfOnes) {
                arr[i]=1;

            }else {
                arr[i]=2;
            }
        }
        System.out.println("shorted array is : ");
        for (int ele:arr){
            System.out.print(ele +" ");
        }
    }
}
