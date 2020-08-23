import java.util.HashMap;
import java.util.Map;

class Node{
    boolean wordFlag;
    Map<Character,Node> childList=new HashMap<>();
}
 class Trie{
    Node root=new Node();
    void insert(String s){
        Node curt=root;
        for(int i=0;i<s.length();i++){
            curt=curt.childList.computeIfAbsent(s.charAt(i), x -> new Node());
        }
      curt.wordFlag=true;  
    }
    boolean search(String s){
        Node curt=root;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            curt=curt.childList.get(ch);
            if(curt==null){
                return false;
            }
        }
            if(curt.wordFlag==true){
                return true;
            }
            return false;
        }
    }

 class TrieImplement {
    public static void main(String[] args) {
        Trie trie=new Trie();
        trie.insert("nomaan");
        trie.insert("what");
        trie.insert("nobu");
        trie.insert("at");
        System.out.println(trie.search("at"));
        System.out.println(trie.search("a"));
        System.out.println(trie.search("nomaan"));
        System.out.println(trie.search("nobu"));
        System.out.println(trie.search("nobusake"));
    }
    
}