public class string0{
    public static void main(String[] args){
        char c='A';
        char d='B';
        // char e=c+d;
        System.out.println(c+d);
        System.out.println('a'+'b');

        System.out.println("if we store 66 in char, then the output will be");
        char ch1=66;
        System.out.println(ch1);

        char ch2='A';
        if(ch2>=90){
            System.out.println("Greater");
        }
        else
        {
            System.out.println("Smaller");
        }
        String st="ALGOPREP";
        System.out.println(st.substring(5,7));

        //char array from string
        char [] arr=st.toCharArray(); 
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"");
        }
        System.out.println();

        //now we can update the index value after convert string to char array

        arr[4]='p';
        String s="".valueOf((arr));
        System.out.println(s);


    }
}