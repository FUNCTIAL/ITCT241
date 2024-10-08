public class ArrayIntList {

    private static int[] items;
    private static int index;

    public ArrayIntList() {
        items = new int[10];
        index = 0;
    }

    public void addLast(int data) {
        items[index] = data;
        index++;
    }

    public int getFirst() {
        return items[0];
    }

    public int getLast() {
        return items[index - 1];
    }

    public int get(int i) {
        return items[i];
    }

    public int size() {
        return items.length;
    }

    public void removeLast() {
        items[index - 1] = 0;
        index--;
    }
}
