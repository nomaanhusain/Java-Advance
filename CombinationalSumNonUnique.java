import java.util.ArrayList;
import java.util.List;

class CombinationalSumNonUnique{
    public static void main(String[] args) {
        int target=7;
        int []combination=new int[]{2,3,4,5,6,7};
        List<List<Integer>> list=new ArrayList<>();
        helper(list,new ArrayList<>(),target,0,combination);
        System.out.println(list);
    }
    private static void helper( List<List<Integer>> list,List<Integer> curt,int target,int idx,int []comb){
        if(target==0){
            list.add(new ArrayList<>(curt));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=idx;i<comb.length;i++){
            curt.add(comb[i]);
            helper(list, curt, target-comb[i], idx, comb);
            curt.remove(curt.size()-1);
        }
    }
}