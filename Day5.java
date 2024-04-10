import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Day5 {
    TrNode root;
    class TrNode {
        int data;
        TrNode left;
        TrNode right;
        public TrNode(int value){
            this.data = value;
            this.left = null;
            this.right = null;
        }
    }




//    Creating Binary Tree
    public  void  CreatingBinary(){
        TrNode n1 = new TrNode(1);
        TrNode n2 = new TrNode(2);
        TrNode n3 = new TrNode(3);
        TrNode n4 = new TrNode(4);
        TrNode n5 = new TrNode(5);
        TrNode n6 = new TrNode(6);
        TrNode n7 = new TrNode(7);


        root = n1;
        n1.left = n2;
        n2.left = n3;
        n2.right = n4;
        n3.left = n5;
        n3.right = n6;
        n6.left = n7;


        /*
               root ->  n1
                       / \
                       n2
                      / \
                     n3   n4
                    / \
                   n5  n6
                         \
                           n7
         */

    }



// Level order of a Tree
      public void LevelOrder(TrNode root){
        if (root == null){
            return;
        }
        Queue <TrNode> qu = new LinkedList<>();
        qu.offer(root);
        while (!qu.isEmpty()){
                TrNode temp = qu.poll();
            System.out.print(temp.data+" ");

            if(temp.left != null){
                qu.offer(temp.left);
            }
            if(temp.right != null){
                qu.offer(temp.right);
            }
        }
      }



    public static void main(String[] args) {
        Day5 obj = new Day5();
        obj.CreatingBinary();
        obj.LevelOrder(obj.root);
    }

}
