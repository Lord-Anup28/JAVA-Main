//smallest k elements 
import java.util.Collections;
import java.util.PriorityQueue;
public class heap03 {
    public static void main(String[]args){
        PriorityQueue<Integer> PQ=new PriorityQueue<>(Collections.reverseOrder());
        int[] arr={6,8,2,4,3,11,10,7,14,1};
        int k=4;
        int n=arr.length;
        for(int i=0;i<k;i++){
            PQ.add(arr[i]);
        } 
        for(int i=k;i<n;i++){
            if(PQ.peek()>arr[i]){
                PQ.remove();
                PQ.add(arr[i]);
            }
        }
        while(PQ.size()>0){
            System.out.println(PQ.remove());  
        }
           
        
    }
}
