import java.util.*;
public class prime {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        boolean s=checkPrime(n);
        System.out.println(s);
    }
    public static boolean checkPrime(int n){
        int ans=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                ans++;
            }
            continue;
        }
        // System.out.println(ans);
        if(ans==2){
            return true;
        }
        return false;
    }
}
