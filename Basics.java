import java.util.*;
import java.lang.*;

public class Main {
    //trees
    public static void display(Node root){
        //base case
        if(root==null){
            return;
        }
        //node self work
        String str="";
        str+=root.left==null?".":root.left.data+"";
        str+="<-"+root.data+"->";
        str+=root.right==null?".":root.right.data+"";

        //call for left and right part
        display(root.left);
        display(root.right);
    }
    public static int size(Node node){

        //base case
        if(node==null){
            return 0;//because it means there is nothing there
        }
        int sz=0;
        sz=size(node.left)+size(node.right)+1;
        return sz;
    }
    public static int sum(Node node){
        //base case
        if(node==null){
            return 0;
        }
        int lsum=sum(node.left);
        int rsum=sum(node.right);
        return lsum+rsum+node.data;
    }
    public static int max(Node node){
        //base case
        if(node==null){
            return Integer.MIN_VALUE;
        }
        int lmax=max(node.left);
        int rmax=max(node.right);
        return Math.max(node.data,Math.max(lmax,rmax));
    }
    public static int height(Node node){
        //base case
        //if reqd in term of nodes
        if(node==null){
            return 0;
        }
        //in terms of edges
        if(node==null){
            return -1;
        }
        int lh=height(node.left);
        int rh=height(node.right);
        return Math.max(lh,rh)+1;
    }
}