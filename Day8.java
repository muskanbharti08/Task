public class Day8 {
    Node head;


    // Structure of Node
    class  Node{
        int data;
        Node next;
        public Node(int value){
            this.data = value;
            this.next = null;
        }

    }








    // inserting Node in singly Linked list
    public void List(int data){
        Node n1 = new Node(data);
        if(head== null){

            head = n1;
        }
        else {
            n1.next=head;
            head =n1;
        }
    }







    // Printing linked list
    public void Print(){
        if(head == null){
            System.out.println("linked List is empty");
            return;
        }
        else {
            Node Pointer = head;
            while (Pointer != null){
                System.out.print(Pointer.data+" -> ");
                Pointer = Pointer.next;
            }
            System.out.println("Null");
        }
    }








    // finding middle node from singly list
    public void FindingMiddleNode(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        else {
            Node Fast = head;
            Node Slow = head;
            while (Fast != null && Fast.next != null){
                Fast = Fast.next.next;
                Slow = Slow.next;
            }
            System.out.println( "The middle node of singly linked list "+Slow.data);
        }
    }







    // main method
    public static void main(String[] args) {
        Day8 obj = new Day8();
        obj.List(3);
        obj.List(2);
        obj.List(1);
        obj.Print();
        obj.FindingMiddleNode();

    }
}
