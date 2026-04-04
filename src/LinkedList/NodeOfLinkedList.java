package LinkedList;
class Node1{
    int val;
    Node1 next;
}
public class NodeOfLinkedList {
    public static void main(String[] args) {
        Node1 a = new Node1();
        a.val=10;
        Node1 b = new Node1();
        b.val=20;
        Node1 c = new Node1();
        c.val=30;
        Node1 d = new Node1();
        d.val=40;
        Node1 e = new Node1();
        e.val=50;
        // linking each other
        a.next = b;
        b.next =c;
        c.next=d;
        d.next=e;

    }
}
