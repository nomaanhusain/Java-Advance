public class MaxAvgSubset {
    static int findAvg(int []arr,int strt,int end){
        if((end==0&&strt==0) || (end==strt) ){
            return arr[0];
        }
        int sum=0;
        for(int i=strt;i<end;i++){
            sum=sum+arr[i];
        }
        return (sum/(end-strt));
    }
    public static void main(String[] args) {
    int arr[]=new int[]{-2,1,6,6,8,-3};
    int x=3;
    int fi=0,fj=0;
    int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(findAvg(arr,i,j)>=x){
                    if((j-i)>max){
                        max=(j-i);
                        fi=i;
                        fj=j;
                    }
                }
            }
        }
       for(int i=fi;i<fj;i++){
           System.out.print(arr[i]+" ");
       }
    }
    
}