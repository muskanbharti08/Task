public class Day7 {
    Node head;
    class Node{
        int data;
        Node next;
        public Node(int value){
            this.next= null;
            this.data = value;
        }
    }




    // inserting node at given position
    public void  InsertAtGivenPosition(int data, int position){

        Node n1 = new Node(data);

        if(position == 1){
            n1.next = head;
            head = n1;
        }
        else {
            int count =1;
            Node Pointer = head;
            while (count<(position-1)){
                count++;
                Pointer = Pointer.next;
            }
            Pointer.next = n1;
        }

    }







    // Deleting node from given position
    public  void DeleteNodeFromGivenPosition(int position){
        if(position == 1){
            head.next= head.next.next;

        }
        else {
            int count =1;
            Node pointer = head;
            while(count<(position-1)){
                count++;
                pointer = pointer.next;
            }
            pointer.next = pointer.next.next;
        }
    }



    // Printing singly Linked List
    public void Print(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        else {
            Node Pointer = head;
            while (Pointer!= null){
                System.out.print(Pointer.data+"->");
                Pointer = Pointer.next;

            }
            System.out.println("null");
        }
    }






    // Main method
    public static void main(String[] args) {
        Day7 obj = new Day7();
        obj.InsertAtGivenPosition(5,1);
        obj.InsertAtGivenPosition(4,1);
        obj.InsertAtGivenPosition(3,1);
        obj.InsertAtGivenPosition(2,1);
        obj.InsertAtGivenPosition(1,1);
        obj.Print();
        obj.InsertAtGivenPosition(6,6);
        obj.Print();
        obj.DeleteNodeFromGivenPosition(6);
        obj.Print();
    }

}
