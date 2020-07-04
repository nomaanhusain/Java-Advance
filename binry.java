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
    public static void main(String []args){
        int a;
        BinarySearchTree tree=new BinarySearchTree();
        a=tree.insert(10);
        a=tree.insert(8);
        a=tree.insert(14);
    }
}