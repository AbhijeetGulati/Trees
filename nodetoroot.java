import java.util.*;

public class nodetoroot {
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

    static ArrayList<Integer> path=new ArrayList<>();//this arraylist is to store the final ans
    
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
            path.add(node.data);
            return true;
        }
        //else search in left and right subtree
        boolean left=search(node.left,data);
        if(left){
            path.add(node.data);
            return true;
        }
        boolean right=search(node.right,data);
        if(right){
            path.add(node.data);
            return true;
        }
        //else return false;
        return false;
    }
}
