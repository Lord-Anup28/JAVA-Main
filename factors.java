import java.util.*;
import java.lang.ArithmeticException;
public class factors{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int value=factorValue(n);
        System.out.println("It has "+value+" factors");
        sc.close();
    }
    public static int factorValue(int n){
        if(n==1){return 1;}
        int ans=0;
        for(int i=0;i<=n;i++){
            if(n%i==0){
                ans++;
            }
        }
        return ans;
    }
}

