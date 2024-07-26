public class array7{
    public static void main(String[] args){
        int [][]array={{10,20,30,40,50},
                      {11,21,31,41,51},
                      {12,22,32,42,52},
                      {13,23,33,43,53}};
                int r=array.length;
                int c=array[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(array[i][j]+" ");
            }System.out.println("");
        }
    }
}