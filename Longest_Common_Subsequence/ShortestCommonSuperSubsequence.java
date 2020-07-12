package Longest_Common_Subsequence;

public class ShortestCommonSuperSubsequence {
    public static void main(String[] args) {
        char x[]=new char[]{'A','G','G','T','A','B'};
        char y[]=new char[]{'G','G','T','X','A','Y','B'};
        int MnLen=x.length+y.length;
        int t[][]=new int[x.length+1][y.length+1];
        for(int i=0;i<x.length;i++){
            for(int j=0;j<y.length;j++){
                if(i==0||j==0){
                    t[i][j]=0;
                }
            }
        }
     
        String w="";
        for(int i=1;i<x.length+1;i++){
            for(int j=1;j<y.length+1;j++){
                if(x[i-1]==y[j-1]){
                    char temx=x[i-1];
                    char temy=y[j-1];
                    t[i][j]=1+t[i-1][j-1];
                    w=w+y[j-1];
                }
                else{
                    t[i][j]=Math.max(t[i][j-1], t[i-1][j]);
                    //w=w+y[j-1];
                }
            }
        }

        for(int i=0;i<=x.length;i++){
            System.out.print(i+" --> ");
            for(int j=0;j<=y.length;j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Shortest Common Subsequence Length : "+w);
    }
}