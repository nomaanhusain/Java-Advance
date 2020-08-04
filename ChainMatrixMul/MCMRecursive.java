//find minimum weight to chain multiply multiple matrix of different dimensions
public class MCMRecursive {
    static int solve(int arr[],int i,int j){
        if(i>=j){
            return 0;
        }
        int min=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int temp=solve(arr,i,k)+solve(arr, k+1, j)+(arr[i-1]*arr[k]*arr[j]);
           
            if(temp<min){
                min=temp;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int dimension[]=new int[]{4,3,2}; //this is 2 arrays, one of dimension (40x30) and one of (30x10)
        System.out.println(solve(dimension, 1, (dimension.length)-1));
    }
    
}
