// File: ArrayOrderList.java
// Description: Create an array, and methods to add to array and display the array.
// Assignment Number: 3
//
// ID: 6580838
// Name: Teerathad Udomjitwiwat
// Grader: Aj. Petch
//
// On my honor, Teerathad Udomjitwiwat, this lab assignment is my own work
// and I have not provided this code to any other students

public class ArrayOrderList {

    private int[] items;
    private int index;

    public ArrayOrderList() {
        items = new int[10];
        index = 0;
    }

    public void add(int data) {
        // save current array
        int pointer = index;

        if (pointer != 0) {
            while ((pointer > 0) && (items[pointer - 1] > data)) {
                items[pointer] = items[pointer - 1];
                pointer--;
            }

            items[pointer] = data;
            index++;
        } else {
            items[pointer] = data;
            index++;
        }

        // display everytime when add
        // display();
    }

    public void display() {
        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i] + " ");
        }
        System.out.print("\n");
    }
}
