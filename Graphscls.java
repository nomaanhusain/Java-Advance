import java.util.*;

class Graphscls{
    private Map<Integer,List<Integer>> map =new HashMap<>();
    void addVertex(int val){
        //Try to implement logic to avoid dublicasy of keys 
        
        map.put(val,new LinkedList<Integer>());
    }
    //bidirectional
    void addEdge(int src,int dest){
        map.get(src).add(dest);
        map.get(dest).add(src);
        }
    void removeEdge(int src,int dest){
        map.get(src).remove(new Integer(dest));//overridden 
        map.get(dest).remove(new Integer(src));
    }
    void removeVertex(int key){
        while(map.get(key).size()!=0){
            System.out.println("YOYOYO");
            int adj=map.get(key).remove(map.get(key).size()-1);
            removeEdge(adj,key);
        }
        map.remove(key);
    }
    public static void main(String[] args) {
        Graphscls graph=new Graphscls();
        graph.addVertex(24);
        graph.addVertex(60);
        graph.addVertex(80);
        graph.addVertex(50);
        graph.addVertex(80);
        graph.addVertex(65);
        graph.addEdge(50,80);
        graph.removeVertex(50);
    }
}