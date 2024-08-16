//n arrary elements and Qqueries on an array for each query calculate sum of all elementsin given range
public class array12 {
    public static void main(String[]args){
        int arr[]={-2,5,1,3,4,1,7,-8,2,0};
        int s=arr.length;
        int[] pf=new int[s];
        pf=prefixsum(arr);
        for(int i=0;i<s;i++){
            System.out.print(pf[i]+" ");
        }
        System.out.println(); 
        int[][] q={{3,2,0,5,6},
                  {8,4,3,9,6}};
        int l=q.length;
        for(int i=0;i<l;i++){
            int ei=las[i]-1;
            int si=fir[i]-1;
            for(int j=si;j<ei;i++){
                int sum=pf[ei]-pf[si];
                System.out.print(sum+" ");
            }
        }

 
    }
    public static int[] prefixsum(int []arr){
        int s=arr.length;
        int[] pf=new int[s];
        pf[0]=arr[0];
        for(int i=1;i<s;i++){
            pf[i]=pf[i-1]+arr[i];
        }
        return pf;
    }
}
