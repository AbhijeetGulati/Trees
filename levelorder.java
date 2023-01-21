import java.util.*;

public class levelorder {
    //level order traversal
    public static void levelOrder(Node node){
        Queue<Node> mq=new ArrayDeque<>();
        //add root node to queue
        mq.add(node);
        //for loop will run acc to size of mq
        while(mq.size()>0) {
            int count = mq.size();//before removing any element from qeueu
            for (int i = 0; i < count; i++) {//this for loop is for elements at current level
                //while queue still has elements in it
                mq.remove(node);
                //now print it
                System.out.println(node.data+" ");
                //add its children
                if(node.left!=null){
                    mq.add(node.left);//left child added to queue
                }
                if(node.right!=null){
                    mq.add(node.right);
                }

            }//end of for loop

        }//end of while loop
        System.out.println();//leave a line before going to next level

    }
}
