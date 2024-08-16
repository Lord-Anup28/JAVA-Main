public class array14 {
    public static void main(String [] args){
        int arr[]={1,2,3,4};
        int n=arr.length;
        int []ps=prefixSum(arr,n);
        int []ans=resultPdt(arr,ps);
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
    public static int[] prefixSum(int [] arr,int n){
        int[] ps=new int[n];
        ps[0]=arr[0];
        for(int i=1;i<n;i++){
            ps[i]=ps[i-1]*arr[i];
        }
        return ps;
    }
    public static int [] resultPdt(int []arr,int []pf){
        int n=arr.length;
        int [] ans=new int [n];
        int suffix=1;
        for(int i=n-1;i>0;i--){
            ans[i]=pf[i-1]*suffix;
            suffix=suffix*arr[i];
        }
        ans[0]=suffix;
        return ans;

    }
}
