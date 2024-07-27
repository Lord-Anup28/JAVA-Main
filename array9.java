//how to declear an arraylist
import java.util.ArrayList;
public class array9{
    public static void main(String[]args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        //to access index
        list.get(1);
        System.out.println(list.get(1));

        //print the array
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        } 
        System.out.println("");
        System.out.println("Remove last element");
        int l=list.size();
        list.remove(l-1);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        } 
        System.out.println("");
        System.out.println("Change the 3rd index value");
        list.set(2,03);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        } 

    }
}