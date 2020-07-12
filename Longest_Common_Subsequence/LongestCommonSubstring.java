package Longest_Common_Subsequence;
//Not Done Yet!!! THis is incomplete!!
public class LongestCommonSubstring {
    public static void main(String[] args) {
        String a="acvtr";
        String b="vttyx";
        char x[]=a.toCharArray();
        char y[]=b.toCharArray();


        int t[][]=new int[x.length+1][y.length+1];
        for(int i=0;i<x.length;i++){
            for(int j=0;j<y.length;j++){
                if(i==0||j==0){
                    t[i][j]=0;
                }
            }
        }

        for(int i=1;i<x.length+1;i++){
            for(int j=1;j<y.length+1;j++){
                if(x[i-1]==y[j-1]){
                    t[i][j]=1+t[i-1][j-1];
                }
                else{
                    t[i][j]=0;
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
        //For answer retrun max of matrix
        int max=0;

        for(int i=0;i<=x.length;i++){
            for(int j=0;j<=y.length;j++){
            if(t[i][j]>max){
                max=t[i][j];
            }
            }
        }
    }
}