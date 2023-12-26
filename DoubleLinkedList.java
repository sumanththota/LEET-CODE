
public class DoublyLinkedListNode {
    int val;
    DoublyLinkedListNode next;
    DoublyLinkedListNode prev;
    public DoublyLinkedListNode(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
public class DoubleLinkedList {
    DoubleLinkedList head;
    DoubleLinkedList tail;
    
    //constructor
    public DoubleLinkedList(){
        head = new DoubleLinkedListNode(-1);
        tail = new DoubleLinkedListNode(-1);
        head.next = tail;
        tail.prev = head;
    }
    public void insertEnd(int val){
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(val);
        newNode.next = tail;
        newNode.prev = tail.prev;

        tail.prev.next = newNode;
        tail.prev = newNode;
    }
    public void removeFront(){
        head.next.next.prev = head;
        head.next = head.next.next;
    }
    public removeEnd(int val){
        tail.prev.prev.next = tail;
        tail.prev = tail.prev.next;
    }
    public void print(){
        DoublyLinkedListNode curr = head.next;
        while(curr != tail){
            System.out.println(curr.val + "->");
            curr = curr.next;
        }
        System.out.println();
    }
}
