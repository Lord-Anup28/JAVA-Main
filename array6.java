public class array6{
    public static void main(String[]args){
        int[] num={2,-1,0,3,2,5,7};
        int k=8;
        //  int[] num={1,3,-2,6};
        //  int k=5;
        // int []num={2,4,-3,7,10};
        // int k=8;
        int n=num.length;
        for(int i=0;i<n;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println("");
        boolean ans=checksum(num,k);
        System.out.println(ans);
    }
    public static boolean checksum(int arr[],int k){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(i==j){
                    continue;
                }
                else{
                    int s=arr[i]+arr[j];
                // System.out.println(s);
                if(s==k){
                    return true;
                }
                }
                
            }
        }
        return false;
    }
}