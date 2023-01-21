public class iterativeTraversals {
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
    public static class Pair{
        //making a pair of nodes and states so that we can do tree traversal using iteration
        Node node;
        int state;
        Pair(Node node,int state){
            this.node=node;
            this.state=state;
        }
    }
    //our functions for traversal
    
}
