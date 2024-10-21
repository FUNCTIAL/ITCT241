public class MyLinkedList {
    public Node first;

    public MyLinkedList() {
        this.first = null;
    }

    public MyLinkedList(int data) {
        this.first = new Node(data, null);
    }

    public void addFirst(int data) {

        first = new Node(data,first);

        Node newNode = new Node(data,null);
        newNode.next = first;
        first = newNode;
    }

    public void delFirst(){
        if (first != null){
            first = first.next;
        }
    }
}
