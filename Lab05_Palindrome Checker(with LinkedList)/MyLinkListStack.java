// File: MyLinkListStack.java
// Description: Create an linked list and add functions to interact with it.
// Assignment Number: 5
//
// ID: 6580838
// Name: Teerathad Udomjitwiwat
// Grader: Aj. Petch
//
// On my honor, Teerathad Udomjitwiwat, this lab assignment is my own work
// and I have not provided this code to any other students

public class MyLinkListStack {

    public Node first;

    public MyLinkListStack() {
        this.first = null;
    }

    public MyLinkListStack(char data) {
        this.first = new Node(data, null);
    }

    public void push(char data) {
        first = new Node(data, first);

        // Node newNode = new Node(data, null);
        // newNode.next = first;
        // first = newNode;
    }

    public char pop() {
        char temp = first.data;
        first = first.next;
        return temp;
    }

    public char peek() {
        return first.data;
    }

    public boolean isEmpty() {
        return (first == null);
    }
}
