public class MyStack {

    private int[] items;
    private int top;
    private int maxSize;

    public MyStack(int size) {
        maxSize = size-1;
        items = new int[size];
        top = -1;
    }

    public void push(int data) {
        items[top + 1] = data;
        top++;
    }

    public int pop() {
        int temp = items[top];
        items[top] = 0;
        top--;
        return temp;
    }

    public int peek() {
        return items[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize);
    }

    public void display() {
        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i] + " ");
        }
        System.out.print("\n");
    }
}
