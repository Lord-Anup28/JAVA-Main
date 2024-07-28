//check the number is odd or even 
import java.util.*;
public class bit1{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int s=n&1;
        if(s==0){
            System.out.println("The number is Even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}