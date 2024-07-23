import java.util.*;
public class ncr {
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        System.out.println("Enter the value of r");
        int r=sc.nextInt();
        int value=ncrvalue(n,r);
        System.out.println("The Value is "+value);
    }

    public static int ncrvalue(int n,int r){
        int c=facto(n)/facto(n-r)*facto(r);
        return c;
    }
    public static int facto(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = i * ans;
        }
        return ans;
    }
}
