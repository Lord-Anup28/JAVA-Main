public class array5 {
    public static void main(String []args){
        int[] num={7,7,7,7,7};
        int n=num.length;
        for(int i=0;i<n;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println("");
        smallelecount(num);
    }    
    public static void smallelecount(int []arr){
        int n=arr.length;
        int b=arr[0];
        int count=0;
        for(int i=1;i<n;i++){
            if(b<arr[i]){
               b=arr[i]; 
            }
        }
        System.out.println(b);
        for(int i=0;i<n;i++){
            if(b>arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
