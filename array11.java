//n arrary elements and Qqueries on an array for each query calculate sum of all elementsin given range
import java.util.*;
public class array11 {
    public static void main(String[] args ){
        
        int arr[]={-2,5,1,3,4,1,7,-8,2,0};
        int s=arr.length;
        for(int i=0;i<s;i++){
            System.out.print(arr[i]+" ");
        }
       querySum(arr);
    }   
    public static void querySum(int []arr){
        Scanner sc =new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the starting point");
        int f=sc.nextInt();
        System.out.println("Enter the end point");    
        int l=sc.nextInt();
        int s=arr.length;
        int[] pf=new int[s];
        int sum=0;
        if(f==0){
            pf[0]=arr[0];
            for(int i=1;i<=l;i++){
                pf[i]=pf[i-1]+arr[i];
                sum=pf[i];
            }
        }
        else{
            for(int i=f;i<=l;i++){
                pf[i]=pf[i-1]+arr[i];
                sum=pf[i];
            }
        }
        
        System.out.println("The value is "+sum);
    
    }
}
