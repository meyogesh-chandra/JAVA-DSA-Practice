package LinkedList;
class Linkedlist{
    Node head;
    Node tail;
    int size;
    void addAtTail(int val){
        Node temp = new Node(val);
        if (tail==null) head = tail = temp;
        else{
            tail.next=temp;
            tail=temp;

        }
        size++;
    }
    void display(){
        if (head==null) return;
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void addHead(int val){
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
            size++;
        }

    }
    void deleteAtHead(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        head=head.next;
        if(head == null) tail = null;
        size--;
    }
    int search(int val){
        if(head==null) return -1;
        Node temp = head;
        int idx = 0;
        while(temp!=null){
            if(temp.val==val) return idx;
            temp=temp.next;
            idx++;
        }
        return -1;
    }
    void Insert(int val,int idx){
        if(idx<0 && idx>size){
            System.out.println("Invalid Syntax");
            return;
        }
        if(idx==0) addHead(val);
        else if(idx == size) addAtTail(val);
        else{
            Node temp = head;
            for(int i =0; i<idx-1;i++){
                temp=temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next=t;
            size++;

        }
    }
    int get(int idx){
        Node temp = head;
        for(int i = 1; i<=idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }
    void delete(int idx){
        if(idx<0 || idx>=size){
            System.out.println("invalid");
            return;
        }
        if(idx==0){
            deleteAtHead();
            return;
        }
        Node temp = head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        if(idx == size-1) tail = temp;//deleting tail
        size--;

    }
}
public class LinkedListDataStructures {
    public static void main(String[] args) {
        Linkedlist ll= new Linkedlist();
        ll.deleteAtHead();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.display();
        ll.addHead(25);
        ll.display();
        ll.deleteAtHead();
        ll.display();
        System.out.println(ll.size);
        ll.Insert(34,2);
        ll.display();
        ll.delete(3);
        ll.display();

    }


}
