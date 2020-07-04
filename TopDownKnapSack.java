//Maxminum Value, Minimum Weight, Holding capacity of knapsack is W
//This is a top down DP method to solve this, a recursive solution is also possible

public class TopDownKnapSack {
    public static void main(String[] args) {
        int []val=new int[]{2,7,5,8};
        int []wt=new int[]{2,4,6,7};
        int W=10;
        int [][]t=new int[val.length+1][W+1];
        System.out.println("Val --> ");
        for(int i=0;i<val.length;i++){
            System.out.print(val[i]+" ");
            }
            System.out.println();
            System.out.println("Wt --> ");

        for(int i=0;i<val.length;i++){
            System.out.print(wt[i]+" ");
            }
            System.out.println();
        for(int i=0;i<val.length+1;i++){
            for(int j=0;j<W+1;j++){
                if(i==0){
                    t[i][j]=0;
                }
                if(j==0){
                    t[i][j]=0;
                }
            }
        }

            //Main Thing
            
        for(int i=1;i<=val.length;i++){
            for(int j=1;j<=W;j++){
                if(wt[i-1]<=j){
                    t[i][j]=Math.max(val[i-1] + t[i-1][j-wt[i-1]],t[i-1][j]);
                }
                else{
                    t[i][j]=t[i-1][j];
                }
            }
        }

          //Printing

        for(int i=0;i<=val.length;i++){
            for(int j=0;j<=W;j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
    }
}
