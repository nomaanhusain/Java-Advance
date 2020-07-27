public class tsp_dp_bitmask {
    static int cost[][]=new int[][]{{0,29,32},{33,0,25},{34,23,0}};
    static int n=cost.length;
    
    static int allvisited=(1<<n)-1;
    static int tsp(int mask,int pos){
        if(mask==allvisited){
            return cost[pos][0];
        }
         int mincst=Integer.MAX_VALUE;
         for(int city=0;city<n;city++){
             if((mask&(1<<city))==0){
                int newcost=cost[pos][city]+tsp(mask|(1<<city), city);
             mincst=Math.min(mincst, newcost);
             }
         }
         return mincst;
    }
    public static void main(String[] args) {
        System.out.println(tsp(1, 0));
    }
}