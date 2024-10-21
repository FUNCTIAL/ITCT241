public class Test {

    public static void main(String[] args) {
        // Node a = new Node();
        // a.data =5;
        // a.next = new Node();
        // a.next.data = 6;
        // a.next.next = new Node();
        // a.next.next.data = 6;
        //
        // System.out.println(a.next.data);

        Node a = new Node(5, new Node(4, new Node(3, new Node(4, null))));
        System.out.println(a.toString());
        System.out.println(a.listSize());
    }
}
