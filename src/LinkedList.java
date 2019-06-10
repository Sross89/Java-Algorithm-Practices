public class LinkedList {

    private Node head;

    public LinkedList(Node head) {
        this.head = null;
    }

    public LinkedList() {

    }

    public Node insertNode(int data){
        if(head == null){
            head = new Node(data);
        }
        else{
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
        }

        return head;
    }

    public void printMid(){
        Node slow = head;
        Node fast = head;
        while(fast != null && slow != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        for (int i = 20; i < 0; i++) {
            list.insertNode(i);
        }
        list.printMid();
    }
}
