public class Day6 {

    Node head;
    //  Structure of node
    class Node{
        int data;
        Node next;
        public Node(int value){
            this.next = null;
            this.data = value;
        }

    }










    // Inserting first in Singly Linked List
    public void InsertFirst(int data){
        Node n1 =  new Node(data);
        if(head == null){
            head = n1;
            return;
        }
        else {
            n1.next = head;
            head = n1;
        }
    }















    // Inserting last in singly Linked List
    public void InsertLast(int data){
        Node n2 = new Node(data);
        if(head == null){
            n2.next = head;
            head = n2;
            return;
        }
        else {
            Node Pointer = head;
            while (Pointer.next != null){
                Pointer = Pointer.next;
            }
            Pointer.next = n2;
        }
    }















  //  Deleting First node from Singly Linked List
  public void DeleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        } else if (head.next == null) {
          head = null;
          return;
        }
        else {
            head = head.next;
        }
  }














  //  Deleting Last Node From Singly List
  public void DeleteLast(){
    if(head == null){
        System.out.println("List is empty");
        return;
    } else {
       Node pointer  = head;
       while (pointer.next.next != null){
           pointer = pointer.next;
       }
       pointer.next = null;
    }
  }















  // Deleting last Node (Another Method)
    public void DeleteLast2ndMathod(){
        if(head == null){
            System.out.println("List is empty");
            return;
        } else if (head.next == null) {
            head = null;
        }
        else {
            Node Pointer1 = head;
            Node Pointer2 = head.next;

            while (Pointer2.next != null){
                Pointer1 = Pointer1.next;
                Pointer2 = Pointer2.next;
            }

            Pointer1.next = null;

        }
    }







    // Printing Singly Linked list
    public  void Print(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        else {
            Node pointer = head;
            while (pointer != null){
                System.out.print(pointer.data+" -> ");
                pointer = pointer.next;
            }
            System.out.println("Null");
        }
    }




    public static void main(String[] args) {
        Day6 obj  = new Day6();
        System.out.println("inserting First Node in singly Linked list");
        obj.InsertFirst(23);
        obj.InsertFirst(13);
        obj.InsertFirst(2);
        obj.InsertFirst(3);
        obj.Print();

        System.out.println("Inserting last Node in singly linked list ");
        obj.InsertLast(8);
        obj.Print();

        System.out.println("Deleting a node from first");
        obj.DeleteFirst();
        obj.Print();

        System.out.println("Deleting a node from last");
        obj.DeleteLast();
        obj.Print();

        System.out.println("Deleting node from last by another method");
        obj.DeleteLast2ndMathod();
        obj.Print();
    }

}