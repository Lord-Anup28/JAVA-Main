//prefix sum
// ex: arr[5]={4,1,6,-2,7}
//     pf[5]={4,5,11,9,16}
import java.util.*;
public class array10{   
     public static void main(String[]args){
        int arr[]={4,1,6,-2,7};
        int s=arr.length;
        int[] pf=new int[s];
        pf=prefixsum(arr);
        for(int i=0;i<s;i++){
            System.out.print(pf[i]+" ");
        }
        System.out.println(); 

    }
    public static int[] prefixsum(int []arr){
        int s=arr.length;
        int[] pf=new int[s];
        pf[0]=arr[0];
        for(int i=1;i<s;i++){
            pf[i]=pf[i-1]+arr[i];
        }
        return pf;
    }
}