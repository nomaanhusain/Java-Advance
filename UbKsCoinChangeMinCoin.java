public class UbKsCoinChangeMinCoin {
    public static void main(String[] args) {
        int []coin=new int[]{1,2,3};
        int sum=5;
        int t[][]=new int[coin.length+1][sum+1];
        for(int i=0;i<=coin.length;i++){
            for(int j=0;j<=sum;j++){
                if(j==0){
                    t[i][j]=0;
                    continue;
                }
               /* if(i==0){
                    t[i][j]=0;
                    continue;
                }
                if(i!=0 && j==0){
                    t[i][j]=1;
                    continue;
                }*/
                t[i][j]=sum;
            }
        }
        int c=0;
        for(int i=1;i<=coin.length;i++){
            for(int j=1;j<=sum;j++){
                if(coin[i-1]<=j){
                    
                    t[i][j]=Math.min(t[i-1][j],t[i][j-coin[i-1]]+1);
                }
                else{
                    t[i][j]=t[i-1][j];
                }
            }
        } 

          //Printing
System.out.println("DP Array --> ");
for(int i=0;i<=coin.length;i++){
    for(int j=0;j<=sum;j++){
        System.out.print(t[i][j]+" ");
    }
    System.out.println();
}
        System.out.println("Coins req. --> "+ t[3][5]);
    }
}