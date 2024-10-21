public class Node {

    public int data;
    public Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public String toString() {
        Node c = this;
        String all = "";

        while (c != null) {
            all = all + c.data + " ";
            c = c.next;
        }

        return all;
    }

    public int listSize() {
        Node c = this;
        int size = 0;

        while (c != null) {
            size++;
            c = c.next;
        }

        return size;
    }
}
