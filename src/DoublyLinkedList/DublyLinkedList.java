package DoublyLinkedList;
class ListNode{
    int val;
    ListNode next;
    ListNode prev;
    ListNode(int val){
        this.val=val;
    }
}
class DLL{
    ListNode head;
    ListNode tail;
    int size;
    void insertAtHead(int val){
        ListNode temp = new ListNode(val);
        if(head==null) head=tail=temp;
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }
    void insert(int val,int idx){
        if(idx<0 || idx>size){
            System.out.println("Invalid Index");
            return;

        }
        if(idx==0){
            insertAtHead(val);
            size++;
            return;

        }
        if(idx==size){
            insertAtTail(val);
            size++;
            return;

        }
        ListNode a = new ListNode(val);
        ListNode temp=head;
        for(int i = 1;i<=idx-1;i++){
            temp=temp.next;
        }
        a.prev=temp;
        a.next=temp.next;
        temp.next=a;
        a.next.prev=a;
        size++;
    }
    void insertAtTail(int val){
        ListNode temp = new ListNode(val);
        if(head==null) head=tail=temp;
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }
    void display(){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void displayRverse(){
        ListNode temp = tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    void deleteAtHead(){
        if(size==0){
            System.out.println("List Empty");
            return;
        }
        if(size==1) head=tail=null;
        else{
            head=head.next;
            head.prev=null;
        }
        size--;

    }
    void deleteAtTail(){
        if(size==0){
            System.out.println("List Empty");
            return;
        }
        if(size==1) head=tail=null;
        else{
            tail=tail.prev;
            tail.next=null;
        }
        size--;

    }
}

public class DublyLinkedList {
    public static void main(String[] args) {
        DLL list=new DLL();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        //list.insertAtHead(40);
        list.display();
        list.insertAtTail(40);
        list.display();
        list.displayRverse();
        list.deleteAtHead();
        list.deleteAtTail();
        list.display();

    }
}
