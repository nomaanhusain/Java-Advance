public class DPCoinChangeMaxWays {
    public static void main(String[] args) {
        int []coins=new int[]{1,2,3};
    int amt=5;
    int combnt[]=new int[amt+1];
    combnt[0]=1;
    for(int cn:coins){
        for(int i=1;i<combnt.length;i++){
            if(i>=cn){
                combnt[i]+=combnt[i-cn];
            }  
        }
    }
    System.out.println(combnt[amt]);
    }
}