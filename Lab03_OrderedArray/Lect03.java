public class Lect03 {

    public static void main(String[] args) {
        ArrayIntList a = new ArrayIntList();
        a.addLast(12);
        a.addLast(10);
        a.addLast(5);
        a.addLast(6);

        System.out.println(a.getFirst());
        System.out.println();
        System.out.println(a.get(0));
        System.out.println(a.get(1));
        System.out.println(a.get(2));
        System.out.println(a.get(3));
        System.out.println(a.get(4));
        System.out.println(a.get(5));
        System.out.println(a.get(6));
        System.out.println(a.get(7));
        System.out.println(a.get(8));
        System.out.println(a.get(9));
        System.out.println();
        System.out.println(a.getLast());
        System.out.println("Size: " + a.size());

        a.removeLast();
        System.out.println();
        System.out.println(a.getLast());
        System.out.println();
        a.addLast(1);
        System.out.println(a.get(0));
        System.out.println(a.get(1));
        System.out.println(a.get(2));
        System.out.println(a.get(3));
        System.out.println(a.get(4));
        System.out.println(a.get(5));
        System.out.println(a.get(6));
        System.out.println(a.get(7));
        System.out.println(a.get(8));
        System.out.println(a.get(9));
        System.out.println();
        System.out.println(a.getLast());
    }
}
