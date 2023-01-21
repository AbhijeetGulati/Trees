import java.util.*;

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
    //iterative tree traversal
    public static void iterativeTraversal(Node node){
        //we will push pairs into the stack
        Stack<Pair> st=new Stack<>();
        Pair rtp=new Pair(node,1);
        String pre="";
        String in="";
        String post="";
        //push into stack
        st.push(rtp);
        while(!st.isEmpty()){
            Pair top=st.peek();//here top is an object of class Pair thats why we can use top.data and top.state
            //3 cases whether state is 1 or 2 or 3
            if(top.state==1){//go left
                pre+=top.node.data+" ";
                top.state++;
                if(top.node.left!=null) {//we go left but this will only happen if left child is not null
                    Pair lp=new Pair(top.node.left,1);//push this pair into stack
                    st.push(lp);
                }
            } else if (top.state==2) {
                in+=top.node.data+" ";
                top.state++;
                if(top.node.right!=null) {
                   Pair rp=new Pair(top.node.right,1);
                   st.push(rp);
                }
            }else{
                //when top.state==3
                post+=top.node.data+" ";
                st.pop();//remove from stack


            }
        }//end of while loop
        //print pre order,inorder and postorder
        System.out.println(pre);
        System.out.println(in);
        System.out.println(post);
    }
}
