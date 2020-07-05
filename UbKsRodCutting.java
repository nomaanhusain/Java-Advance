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
        int L=2;
        int rodLen[]=new int[L];
        for(int i=1;i<=L;i++){
            rodLen[i]=i;
        }
        
    }
}