public class Traversals {
     //tree traversal
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
     //preorder traversal
     public static void preOrder(Node root){
        //base case
        if(root==null){
            return;
        }
        //preorder=NLR
        System.out.println(root.data);//N
        //move to left and then right
        preOrder(root.left);//L
        preOrder(root.right);//R
        
    }
    //inorder traversal
    public static void inOrder(Node root){
        //base case
        if(root==null){
            return;
        }
        
       //LNR
        inOrder(root.left);//L
        System.out.println(root.data);
        inOrder(root.right);//R

    }
    //postorder traversal
    public static void postOrder(Node root){
        //base case
        if(root==null){
            return;
        }

        //LRN
        postOrder(root.left);//L
        postOrder(root.right);//R
        System.out.println(root.data);//N
    }
}
