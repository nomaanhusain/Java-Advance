/*
We have been given 2 arrays, one of length of rod, one of price(profit) for that length
We have been given a certain rod of length, say L
we have to cut L in such a way that we maximize our profit
We can cut the rod in same length parts, hence this is a question of Unbound Knapsack

Length array may not be given, but it is obvious that it is from 1 to L
say L=4
lenarr={1,2,3,4}
*/
public class UbKsRodCutting {
    public static void main(String[] args) {
        int []profit=new int[]{6,4,6,7};
        int L=3;
        int rodLen[]=new int[profit.length];
        for(int i=0;i<profit.length;i++){
            rodLen[i]=i+1;
        }
        int t[][]=new int[profit.length+1][L+1];
        for(int i=0;i<=profit.length;i++){
            for(int j=0;j<=L;j++){
                if(i==0 || j==0){
                    t[i][j]=0;
                }
            }
        }

        for(int i=1;i<=profit.length;i++){
            for(int j=1;j<=L;j++){
                if(rodLen[i-1]<=j){
            
                        t[i][j]=Math.max(profit[i-1]+t[i][j-rodLen[i-1]],t[i-1][j]);
                    }
                else{
                    t[i][j]=t[i-1][j];
                }
            }
        }


        //Printing
        for(int i=0;i<=profit.length;i++){
            for(int j=0;j<=L;j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
    }
}