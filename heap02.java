import java.util.*;
public class heap02 {
    public static void main(String[] args ){
        PriorityQueue <Integer> PQ=new PriorityQueue<>(Collections.reverseOrder());
        int[] arr={5,6,8,2,4,-3,0};
        //8 will be the answer
        int n=arr.length;
        for(int i=0;i<n;i++){
            PQ.add(arr[i]);
        }
        System.out.println(PQ.peek());
    }
}
