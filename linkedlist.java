class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class linkedlist{
    public static Node insertAtEnd(Node head, int value){
        Node newNode = new Node(value);
        if(head==null)
            return newNode;
        Node curr =head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next=newNode;
        return head;

    }

}
// public static void printList(Node node){
//     while(node !=          b b  null){
//         System.out.print(" " +node.data);
//         node=node.next;
//     }
// }

public static void main(String[] args){
    linkedlist l = new linkedlist();
    l.insertAtEnd(8);
    l.insertAtEnd(6);
//     Node head=new Node(2);
//     head.next = new Node(3);
//     head.next.next = new Node(3);
//     head = insertAtEnd(head,8);
//     printList(head);
}