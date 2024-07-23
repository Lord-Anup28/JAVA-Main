//swap two element
import java.util.*;
public class array1{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        int f;
        int l;
        int[] num={5,10,15,20,25};
        int n=num.length;
        for(int i=0;i<n;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println("Write the indexes which you want to swap");
            f=sc.nextInt();
            l=sc.nextInt();
        swap(f,l,num);
    }
    public static void swap(int f,int l, int [] arr){
        int temp=arr[f-1];
        arr[f-1]=arr[l-1];
        arr[l-1]=temp;
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}