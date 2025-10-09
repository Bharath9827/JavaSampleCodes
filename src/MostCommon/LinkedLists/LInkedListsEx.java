package MostCommon.LinkedLists;

public class LInkedListsEx {

    public static void main(String[] args) {
        Node head = new Node(10);

        head.next = new Node(20);

        head.next.next = new Node(30);
        traverseLinkedList(head);
        traverseLinkedList(reverseLinkedList(head));
    }

    public static void traverseLinkedList(Node head){
        System.out.println();
        Node current = head;
        while (current !=null){
            System.out.print(current.getData()+" ");
            current = current.next;
        }
    }

    public static Node reverseLinkedList(Node head){
        Node current = head;
        Node prev=null;
        Node next=null;
        while(current!=null){
            next=current.next;  //storing next
            current.next=prev;
            prev=current;
            current = next;
        }
        return prev;
    }
}
