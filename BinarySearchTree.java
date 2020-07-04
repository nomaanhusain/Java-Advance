import java.util.ArrayList;



class BinarySearchTree{
    class Node{
        int value;
        Node left,right;
        public Node(int val){
            value=val;
            left=null;
            right=null;
        }
    }
    Node root;
    BinarySearchTree(){
        root=null;
    }
    int insert(int val){
        Node nd=new Node(val);
        Node currt=root;
        if(root==null){
            root=nd;
            return 1;
        }else{
            while(true){
            if(val<currt.value){
                if(currt.left==null){
                    currt.left=nd;
                    return 1;
                }else{
                    currt=currt.left;
                }
            }else if(val>currt.value){
                if(currt.right==null){
                    currt.right=nd;
                    return 1;
                }else{
                    currt=currt.right;
                }
            }
            }
        }

    }// insert over
    boolean find(int val){
        Node currt=root;
        while(currt!=null){
        if(val==currt.value){
            return true;
        }else if(val<currt.value){
            currt=currt.left;
        }else if(val>currt.value){
            currt=currt.right;
        }
        else {return false;}
    }
    return false;
    }
    ArrayList BFS(){
        ArrayList<Integer> data=new ArrayList<Integer>();
        ArrayList<Node> queue=new ArrayList<Node>();
        Node nd=root;
        queue.add(nd);
        while(queue.size()!=0){
            nd=queue.remove(0);
            data.add(nd.value);
            if(nd.left!=null){
                queue.add(nd.left);
            }if(nd.right!=null){
                queue.add(nd.right);
            }
        }
        return data;
    }
    /*
                 10
             6      15
          3    8        20
          DFS pre -->[10,6,3,8,15,20]
    */
  /* interface forDFSPre{
        Node trav();
    }*/
    void DFSPre(Node nd){
        if(nd==null){
            return;
        }
        System.out.println(nd.value);
        DFSPre(nd.left);
        DFSPre(nd.right);
        }
        void DFSPre(){
            DFSPre(root);
        }
    public static void main(String []args){
        int a;
        BinarySearchTree tree=new BinarySearchTree();
        a=tree.insert(10);
        a=tree.insert(8);
        a=tree.insert(14);
        a=tree.insert(3);
        a=tree.insert(76);
        System.out.println("BFS"+tree.BFS());
        tree.DFSPre();

    }
}