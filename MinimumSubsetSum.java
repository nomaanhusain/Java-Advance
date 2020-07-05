import java.util.ArrayList;

/*We make 2 subset from a given array, lets say sum of both subsets are s1 and s2.
  We have to find minimum difference between their sum, ie. abs(s1-s2)=minimum value
  lets say array is [1,2,7], what can be the extreme values of the subset?
  it can be empty hence sum=0, or it can be {1,2,7}, hence(1+2+7), sum = 10, so range is 0-10
    hence value of s1 and s2 will exist between 0 and 10
    
  Now there are some sums that are simply not possible from this subset
  0,1,2,3,4(x),5(x),6(x),7,8,9,10 . we remove 4,5 and 6 from the possibility of being a subset sum
  (solved using subset sum problem, last row of DP array)
    so value of s1 and s2 would be from --> arposibility[]={0,1,2,3,7,8,9,10} 
    and s1+s2=10

    now if we know s1, s2= 10-s1 (as sum of array is 10)
    (s2-s1=min)
    10-s1-s1=(minimum value) ie. 10-2*s1=(minimum value)

    now lets say s1 will exist from index 0 to arposobolity/2
    put all possible values of s1 in 10-2*s1, the minimum value is the answer

    s1=0,1,2,3
    val-->
      10-0=10
      10-2=8
      10-4=6
      10-6=4
    min is 4, so 4 is answer
*/
public class MinimumSubsetSum {
 public static void main(String[] args) {
    int []arr=new int[]{1,2,7};
    int sum=0;
    for(int i=0;i<arr.length;i++){
        sum=sum+arr[i];
    }
    boolean [][]t=new boolean[arr.length+1][sum+1];
//First find impossible vals of s1 and s2
    //Initialize
    for(int i=0;i<arr.length+1;i++){
        for(int j=0;j<sum+1;j++){
            if(i==0){
                t[i][j]=false;
            }
            if(j==0){
                t[i][j]=true;
            }
        }
    }
    ArrayList<Integer> arposibility=new ArrayList<Integer>();
    for(int i=1;i<=arr.length;i++){
        for(int j=1;j<=sum;j++){
            if(arr[i-1]<=j){
                t[i][j]=t[i-1][j-arr[i-1]] || t[i-1][j];
            }
            else{
                t[i][j]=t[i-1][j];
            }
            if(i==arr.length && t[i][j]==true){
                arposibility.add(j);
            }
        }
    }
    int min=Integer.MAX_VALUE;
    for(int i:arposibility){ //different from the description here i used all values of arposibility
                             //as s1, calculated sum-2*s1, and found the min.
        if(Math.abs(sum-2*i)<min){
            min=sum-2*i;
        }
    }
    System.out.println(min);
 }   
}