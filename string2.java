//reverse the string
public class string2{
    public static void main (String[] args){
        String st="algoprep";
        System.out.println(st);
        char [] ch=st.toCharArray();
        int e=ch.length-1;
        for(int i=0;i<=e;i++){
            char temp=ch[i];
            ch[i]=ch[e];
            ch[e]=temp;
            e--;
        }
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }
        System.out.println();
    }
}