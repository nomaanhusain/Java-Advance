public class SubsetUsingBitmask {
    public static void main(String[] args) {
        char arr[]=new char[]{'A','B','C'};
        int n=arr.length;
        int tot=1<<n;
        for(int mask=0;mask<tot;mask++){
            for(int i=0;i<n;i++){
                if((mask&(1<<i))!=0){ //check if i exist in mask, if not then go inside if
                    System.out.print(arr[i]);
                    //System.out.print("  i = "+i +", mask = "+mask+", 1<<i ="+(1<<i)+", mask&(1<<i) = "+(mask&(1<<i)));
                }
            }
            System.out.println();
        }
    }
    
}