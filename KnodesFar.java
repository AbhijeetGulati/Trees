import java.util.ArrayList;

public class KnodesFar {
    public static class Node{
        //constructor for tree
        //3 components data of node and its left child and right child
        int data;
        Node left;
        Node right;
        //constructor
        Node(int data,Node left,Node right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }

    //now we need two functions 
    //function 1:search to get our node to root path
    //node to root path
    static ArrayList<Node> path;

    public static boolean search(Node node,int data){
        //base case
        if(node==null){
            return false;
        }
        //when we find the reqd node
        //first we will check root if root is not equal to the reqd node then we will search in left and right subtree
        if(node.data==data){
            //root is the reqd node no need to search any further
            //add this node to the ans arraylist
            path.add(node);
            return true;
        }
        //else search in left and right subtree
        boolean left=search(node.left,data);
        if(left){
            path.add(node);
            return true;
        }
        boolean right=search(node.right,data);
        if(right){
            path.add(node);
            return true;
        }
        //else return false;
        return false;
    }
    //function 2:to print all the nodes k level below the node which is there in the arraylist
    //print nodes k levels down
    public static void klevelsDown(Node node,int k,Node blocker){
        //NOTE:we are using blocker to avoid duplicates
        //base case
        if(node==null || k<0 || node==blocker){
            //dont print anything
            return;
        }
        if(k==0){
            //print root node
            System.out.println(node);
        }
        //go left
        klevelsDown(node.left,k-1,blocker);
        //go right
        klevelsDown(node.right,k-1,blocker);
    }
     //print k nodes far
    // very imp question
    public static void printKnodesFar(Node node,int data,int k){
        //we have to print all nodes which are k distance far from data
        //we will make a node to root path from the data node to the root node of the tree
        ArrayList<Node> path=new ArrayList<>();//in this we can store the node to root path and then iterate on it later to get all the nodes that
        //are k distance far
        search(node,data);//this will fill our path arraylist with the reqd nodes
        for(int i=0;i<path.size();i++){
        klevelsDown(path.get(i),k-1,i==0?null:path.get(i-1));
        }

    }
}
