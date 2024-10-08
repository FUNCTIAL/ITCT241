public class OrderArray {

    // declare array
    static int[] items = new int[10];
    static int index = 0;

    // public OrderArray(){
    //     items = new int[10];
    //     index
    // }

    public static void add(int data) {
        int pointer = index;

        // check if the last integer is larger
        while ((pointer > 0) && (items[pointer - 1] > data)) {
            // move last integer to the right
            items[pointer] = items[pointer - 1];
            // move to the next integer
            pointer--;
        }

        items[pointer] = data;
        index++;
    }

    // Print array
    public static void display() {
        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        add(2);
        add(6);
        add(3);
        display();
    }
}
