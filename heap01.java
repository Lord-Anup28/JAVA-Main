import java.util.*;
//min heap
public class heap01{
    public static void main(String []args){
        PriorityQueue<Integer> PQ=new PriorityQueue<>();
        int[] arr={5,6,8,2,4,-3,0};
        int n=arr.length;
        for(int i=0;i<n;i++){
            PQ.add(arr[i]);
        }

        System.out.println(PQ.peek());
    }
}