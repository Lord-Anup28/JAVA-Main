//print the 2d array in wave form
public class array8{
    public static void main(String[] args){
        int [][]array={{10,20,30,40,50},
        {11,21,31,41,51},
        {12,22,32,42,52},
        {13,23,33,43,53}};

        int c=array.length;
        int r=array[0].length;
        int a=0;
         for(int i=0;i<c;i++){
            if(i%2==0){
                for(int j=0;j<r;j++){
                    System.out.print(array[i][j]+" ");
                    a=j;
                }
                System.out.println();
            }
            else
            {
                for(int j=a;j>=0;j--){
                    System.out.print(array[i][j]+" ");
                }
                System.out.println();
            }
            
         }
    }
}