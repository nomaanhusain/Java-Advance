//Count number of subsets where given sum is possible
public class CountSubsetSum {
    public static void main(String[] args) {
        int []arr=new int[]{2,3,7,5,4,1};
        int sum=5;

        int [][]t=new int[arr.length+1][sum+1];

        //Initialization
        for(int i=0;i<arr.length+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0){
                    t[i][j]=0;
                }
                if(j==0){
                    t[i][j]=0;
                }
            }
        }
int c=0;

        for(int i=1;i<=arr.length;i++){
            for(int j=1;j<=sum;j++){
                if(arr[i-1]<=j){
                    if(arr[i-1]+t[i-1][j-arr[i-1]]==j){
                        t[i][j]=arr[i-1]+t[i-1][j-arr[i-1]];
                        if(j==sum){
                            c++;
                        }
                    }
                    else{
                        t[i][j]=t[i-1][j];
                    }
                }
                else{
                    t[i][j]=t[i-1][j];
                }
            }
        }

          //Printing

          for(int i=0;i<=arr.length;i++){
            System.out.print(i+" --> ");
            for(int j=0;j<=sum;j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Count is = "+c);
    }
}