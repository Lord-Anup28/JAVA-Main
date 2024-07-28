public class string1{
    public static void main(String []args){
        String st="ALGOPREP";
        char[] ch=st.toCharArray();
        System.out.println(ch.length);
        for(int i=0;i<ch.length;i++){
            int s;
            if(ch[i]<97){
                s=ch[i];
                s=s+32;
                ch[i]=(char)s;
            }
            else{
                s=ch[i];
                s=s-32;
                ch[i]=(char)s;
            }
        }
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]+"");
        }
        System.out.println();
    }
}