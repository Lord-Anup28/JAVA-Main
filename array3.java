//reverse a part of an array
import java.util.*;
public class array3{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int[] num={5,10,15,20,25,30};
        int n=num.length;
        for(int i=0;i<n;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println("");
        System.out.println("Enter indeces");
        int f=sc.nextInt();
        int l=sc.nextInt();
        // System.out.println("");
        reverse(num,f,l);
    }

    public static void reverse(int []arr,int f,int l){
        int s=f-1;
        int e=l-1;
        int n=(e-s);
        for(int i=s;i<n;i++){
            int temp=arr[i];
            arr[i]=arr[e-1];
            arr[e-1]=temp;
            e--;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}