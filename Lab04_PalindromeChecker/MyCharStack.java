// File: MyCharStack.java
// Description: Create an array and add functions to interact with it.
// Assignment Number: 4
//
// ID: 6580838
// Name: Teerathad Udomjitwiwat
// Grader: Aj. Petch
//
// On my honor, Teerathad Udomjitwiwat, this lab assignment is my own work
// and I have not provided this code to any other students

public class MyCharStack {

    public char[] items;
    private int top;
    private int maxSize;

    public MyCharStack(int size) {
        maxSize = size - 1;
        items = new char[size];
        top = -1;
    }

    public void push(char data) {
        top++;
        items[top] = data;
    }

    public char pop() {
        char temp = items[top];
        top--;
        return temp;
    }

    public char peek() {
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
