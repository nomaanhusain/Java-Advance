public class SubsetSum {
    public static void main(String[] args) {
        int []arr=new int[]{2,3,7,8,10,1};
        int sum=5;
        boolean [][]t=new boolean[arr.length+1][sum+1];
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

        for(int i=0;i<=arr.length;i++){
            System.out.print(i+" ");
            for(int j=0;j<=sum;j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}