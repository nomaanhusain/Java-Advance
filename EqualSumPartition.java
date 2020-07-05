// Find 2 subsets that have the same sum in a given array, tell if subset exists or not

/*
If we divide an array into 2 subsets, and they have equal sum(lets say s)
then s+s=2s, hence it will ALWAYS be EVEN (Both subsets have unique values)
so it is only possible to divide the array in such subset if sum of array is even

So its safe to say that the sum of each subset will be (sum of array)/2 and this is the sum
we have to find is possible or not. 
*/
public class EqualSumPartition {
    public static void main(String[] args) {
        int []arr=new int[]{1,5,11,5};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        if(sum%2!=0){
            System.out.print(false);
            System.exit(0);
        }
        sum=sum/2;
        boolean [][]t=new boolean[arr.length+1][sum+1];
        //Check
        System.out.println("Array --> ");
        for(int i=0;i<arr.length;i++){
            System.out.print(i+" ");
            }
            System.out.print(" <-- Index");
        System.out.println();
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Sum --> "+sum);

        //Initializing
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
        for(int i=1;i<=arr.length;i++){
            for(int j=1;j<=sum;j++){
                if(arr[i-1]<=j){
                    t[i][j]=t[i-1][j-arr[i-1]] || t[i-1][j];
                }
                else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        //Printing
        System.out.println("Dp Array --> ");
        for(int i=0;i<=arr.length;i++){
            System.out.print(i+" ");
            for(int j=0;j<=sum;j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
    }
}