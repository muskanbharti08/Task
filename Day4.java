public class Day4 {
    TrNode root;
    static class TrNode{
        int data;
        TrNode left;
        TrNode right;
        public TrNode (int value){
            this.data = value;
            this.left = null;
            this.right = null;
        }
    }






//    Creating a Binary Tree
    public void CreatingBinaryTree(){
        TrNode n1 = new TrNode(1);
        TrNode n2 = new TrNode(2);
        TrNode n3 = new TrNode(3);
        TrNode n4 = new TrNode(4);
        TrNode n5 = new TrNode(5);
        TrNode n6 = new TrNode(6);
        TrNode n7 = new TrNode(7);
        TrNode n8 = new TrNode(8);

        root = n1;                                            //          n1
        n1.left = n2;                                        //          /   \
        n2.left = n3;                                        //          n2
        n2.right = n4;                                      //          /  \
        n3.left = n5;                                       //         n3    n4
        n3.right = n6;                                      //       /  \
        n6.left = n7;                                      //      n5   n6
        n6.right = n8;                                    //            / \
                                                        //            n7    n8
    }






//    Finding height of af a Tree
    public static int Height(TrNode root){
        if(root == null){
            return 0;
        }
        int left = Height(root.left);
        int right = Height(root.right);
        return Math.max(left,right)+1;
    }








//    Counting the nodes of Tree
    public  static  int CountNodes(TrNode root){
            if(root == null){
                return 0;
            }
            int leftCount = CountNodes(root.left);
            int rightCount = CountNodes(root.right);
            return leftCount+rightCount+1;
    }




// main method
    public static void main(String[] args) {
        Day4 obj = new Day4();
        obj.CreatingBinaryTree();

        int h = Height(obj.root);
        System.out.println("The height of a tree is "+h);

        int c =  CountNodes(obj.root);
        System.out.println("The count of nodes "+ c);

        int s = SumOfNodes(obj.root);
        System.out.println("The sum of all nodes "+s);
    }




//    Finding sum of all nodes
    public static int SumOfNodes(TrNode root){
        if(root == null){
            return 0;
        }
        int leftCount = SumOfNodes(root.left);
        int rightCount = SumOfNodes(root.right);
        return  leftCount+rightCount+root.data;
    }


}
