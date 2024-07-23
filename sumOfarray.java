//Sum of the all elemnts
public class sumOfarray {
    public static void main(String []args){
        int [] num={10,20,30,40,50};
        int n=num.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+num[i];
        }
        System.out.println("The sum of the array is "+sum);
    }
}
