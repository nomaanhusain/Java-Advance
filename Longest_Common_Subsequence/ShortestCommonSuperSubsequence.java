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
                    t[i][j]=1+t[i-1][j-1];
                }
                else{
                    t[i][j]=Math.max(t[i][j-1], t[i-1][j]);
                }
            }
        }
        int it=x.length;
        int jt=y.length;
        while(it>0&&jt>0){
            if(x[it-1]==y[jt-1]){
                w=w+x[it-1];
                it--;
                jt--;
            }
            else{
                if(t[it][jt-1]>t[it-1][jt]){
                    w=w+y[jt-1];
                    jt--;
                }else{
                    w=w+x[it-1];
                    it--;
                }
            }
        }

        String bt="";
        //Reverse the string
        char[] temp = w.toCharArray(); 
        for (int i = temp.length-1; i>=0; i--) 
            bt=bt+temp[i]; 
        w=bt;

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