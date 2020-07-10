public class DPCoinChangeMinCoin {
    public static void main(String[] args) {
        int []coins=new int[]{1,2,3};
    int amt=5;
    int combnt[]=new int[amt+1];
    combnt[0]=0;
    for(int i=1;i<combnt.length;i++){
        combnt[i]=amt;
    }
    for(int i=1;i<combnt.length;i++){
        for(int cn:coins){
        if((i-cn)>=0){
            combnt[i]=Math.min(combnt[i],(combnt[i-cn]+1));
        }   
    }
    }
    System.out.println(combnt[amt]);
    }
}