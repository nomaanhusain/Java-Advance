import java.util.HashMap;
import java.util.Map;

class hashtable{
    public static void main(String[] args) {
        Map<String,String> mp=new HashMap<String,String>();
        mp.put("aa", "This is aa");
        mp.put("bb", "this is bb");
        mp.put("1", "value");
        System.out.println(mp.get("1"));
        for(Map.Entry m: mp.entrySet()){
            System.out.println(m.getKey()+" : "+m.getValue());
        }
    }
}