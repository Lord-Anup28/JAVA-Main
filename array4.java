//Rotate the array by K times

import java.util.Scanner;

public class array4{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[] num={10,20,30,40,50};
        int n=num.length;
        for(int i=0;i<n;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println("");
        System.out.println("Enetr the rotation number");
        int k=sc.nextInt();
        // System.out.println("");
        int p=k;
        rotate(p,num);
    }
public static void rotate(int k,int[] arr){
    reverse(arr);
    int e=k-1;
    for(int i=0;i<=e;i++){
        int temp=arr[i];
        arr[i]=arr[e];
        arr[e]=temp;
        e--;
    }
    int n=(arr.length-1);
    for(int i=k;i<=n;i++){
        int temp=arr[i];
        arr[i]=arr[n];
        arr[n]=temp;
        n--;
    }
    n=arr.length;
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println("");
}
public static void reverse(int []arr){
    int e=(arr.length-1);
    for (int i=0;i<e;i++){
        int temp =arr[i];
        arr[i]=arr[e];
        arr[e]=temp;
        e--;
    }
        
}
}