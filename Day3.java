public  class Day3 {

    public static void main(String[] args) {

        Day3 obj = new Day3();
        obj.CreatingBinaryTree();

        obj.PreOrder(obj.root);
        System.out.println("\n");

        obj.PostOrder(obj.root);
        System.out.println("\n");

        obj.InOrder(obj.root);

    }




    TrNode root;
    class  TrNode{
        int data;
        TrNode left ;
        TrNode right;
        public TrNode(int value){
            this.data = value;
            this.left = null;
            this.right = null;
        }
    }



//    Creating binary tree
    public void CreatingBinaryTree(){
        TrNode n1 = new TrNode(1);
        TrNode n2 = new TrNode(2);
        TrNode n3 = new TrNode(3);
        TrNode n4 = new TrNode(4);
        TrNode n5 = new TrNode(5);
        TrNode n6 = new TrNode(6);
        TrNode n7 = new TrNode(7);
        TrNode n8 = new TrNode(8);

        root = n1;
        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;
        n4.left = n6;
        n4.right = n7;
        n7.left = n8;


    }




//    PreOrder
    public void PreOrder(TrNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        PreOrder(root.left);
        PreOrder(root.right);
    }





//    InOrder
    public void InOrder(TrNode root){
        if(root == null){
            return;
        }
        InOrder(root.left);
        System.out.print(root.data+" ");
        InOrder(root.right);
    }






//    PostOrder
    public void PostOrder(TrNode root){
        if(root == null){
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data+"  ");
    }





}