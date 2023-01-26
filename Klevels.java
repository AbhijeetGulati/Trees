public class Klevels {
    //in this question we need to print all the nodes at level k
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
    public static void klevelsDown(Node node,int k){
        //print all the nodes that are present at level k
        //base case
        if(node==null || k<0){
            return;
        }
    }
}
