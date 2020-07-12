package Longest_Common_Subsequence;
/*
    a --> AGGTAB
    B --> GXTXAYB
    shortestcommonsubsequence --> AGGXTXAYB
    Write the common characters only once, and write the rest. 
    answer string should contain elements of both strings in the same order, the 
    placement can be changed.
    
    So we find LCS of both string, then length of both string combined
    then substract the LCS from it.
*/
public class ShortestCommonSuperSubsequenceCount {
    public static void main(String[] args) {
        char x[]=new char[]{'A','G','G','T','A','B'};
        char y[]=new char[]{'G','X','T','X','A','Y','B'};
        int MnLen=x.length+y.length;
        int t[][]=new int[x.length+1][y.length+1];
        for(int i=0;i<x.length;i++){
            for(int j=0;j<y.length;j++){
                if(i==0||j==0){
                    t[i][j]=0;
                }
            }
        }
        //LCS
        for(int i=1;i<x.length+1;i++){
            for(int j=1;j<y.length+1;j++){
                if(x[i-1]==y[j-1]){
                    t[i][j]=1+t[i-1][j-1];
                }
                else{
                    t[i][j]=Math.max(t[i][j-1], t[i-1][j]);
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
        System.out.println("Shortest Common Subsequence Length : "+(MnLen-t[x.length][y.length]));
    }
}