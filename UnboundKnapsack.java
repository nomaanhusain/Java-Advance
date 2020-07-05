/*
In unbound knapsack we can take an element multiple times
if an element can be included we dont move from it, as it might me taken again
but if an element cannot be taken, we should move from it and not check again

so the only code variation from TopDownKnapSack (01 Knapsack) is that when condition is true
we take val[i-1]+t[i][j-arr[i-1]] instead of val[i-1]+t[i-1][j-arr[i-1]]

and we have unbound knapsack!
*/

public class UnboundKnapsack {
    public static void main(String[] args) {
        int []val=new int[]{2,7,5,8};
        int []wt=new int[]{2,4,6,7};
        int W=5;
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
                    t[i][j]=Math.max(val[i-1] + t[i][j-wt[i-1]],t[i-1][j]);
                }
                else{
                    t[i][j]=t[i-1][j];
                }
            }
        }

          //Printing
System.out.println("DP Array --> ");
        for(int i=0;i<=val.length;i++){
            for(int j=0;j<=W;j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
    }
}