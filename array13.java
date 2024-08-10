//pivot index
public class array13 {
    public static void main (String[] args){
        int [] arr={-2,6,3,4};
        int l=arr.length;
        // int [] arr={-7,1,5,2,-4,3,0};
        // int l=arr.length;
        int [] pf=new int[l];
        pf= prefixSum(arr);
        int [] sf=new int [l];
        sf=suffixSum(arr);

        for(int i=0;i<l;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<l;i++){
            System.out.print(pf[i]+" ");
        }
        System.out.println();
        for(int i=0;i<l;i++){
            System.out.print(sf[i]+" ");
        }
        System.out.println();

        int pivot=0;
       for(int i=0;i<l;i++){
        if(i==0){
            if(0==sf[i+1]){
                pivot++;
            }
        }
        else if(i==l-1){
            if(0==pf[i-1]){
                pivot++;
            }
        }
        else if(pf[i-1]==sf[i+1]){
            pivot++;
        }
       }
       System.out.println(pivot);
    }
    public static int[] prefixSum(int arr[]){
        int n=arr.length;
        int [] pf=new int[n];
        pf[0]=arr[0];
        for(int i=1;i<n;i++){
            pf[i]=pf[i-1]+arr[i];
        }
        return pf;
    }
    public static int[] suffixSum(int arr[]){
        int n=arr.length;
        int []sf =new int [n];
        sf[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            sf[i]=sf[i+1]+arr[i];
        }
        return sf;
    }  

}
