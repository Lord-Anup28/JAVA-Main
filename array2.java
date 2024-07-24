//reverse the array
import java.util.*;
public class array2{
    public static void main(String[] args){
        int[] num={5,10,15,20,25,30};
        int n=num.length;
        for(int i=0;i<n;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println("");
        reverse(num);
        
    }
    public static void reverse(int []arr){
        int s=arr.length;
        int n=s/2;
        for(int i=0;i<n;i++){
            int temp=arr[i];
            arr[i]=arr[s-1];
            arr[s-1]=temp;
            s--;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}