// File: GradeSortProgram.java
// Description: Sort student grades using multiple sorting algorithms
//
// Assignment Number: 7
//
// ID: 6580838
// Name: Teerathad Udomjitwiwat
// Grader: Aj.Petch
//
// On my honor, Teerathad Udomjitwiwat, this lab assignment is my own work
// and I have not provided this code to any other students

import java.util.Arrays;
import java.util.Random;

public class GradeSortProgram {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void selectionSort(int[] arr) {
        int size = arr.length;
        int steps = 0;

        System.out.println("Starting Selection Sort...");

        for (int i = 0; i < size - 1; i++) {
            int least = i;
            steps++;

            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[least]) {
                    least = j;
                }
            }
            swap(arr, i, least);
            System.out.println("Step " + steps + ": " + Arrays.toString(arr));
        }

        System.out.println(
            "Sorted Grades (Selection Sort): " + Arrays.toString(arr) + "\n"
        );
    }

    public static void bubbleSort(int[] arr) {
        int size = arr.length;
        int steps = 0;

        System.out.println("Starting Bubble Sort...");

        for (int i = 0; i < size - 1; i++) {
            steps++;

            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }

            System.out.println("Step " + steps + ": " + Arrays.toString(arr));
        }

        System.out.println(
            "Sorted Grades (Bubble Sort): " + Arrays.toString(arr) + "\n"
        );
    }

    public static void insertionSort(int[] arr) {
        int size = arr.length;
        int steps = 0;

        System.out.println("Starting Insertion Sort...");

        for (int i = 1; i < size; i++) {
            steps++;
            int unsortedIndex = arr[i];
            int j = i;
            while (j > 0 && unsortedIndex < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = unsortedIndex;

            System.out.println("Step " + steps + ": " + Arrays.toString(arr));
        }

        System.out.println(
            "Sorted Grades (Insertion Sort): " + Arrays.toString(arr) + "\n"
        );
    }

    public static void main(String[] args) {
        int[] grade = new int[10];
        Random random = new Random();
        for (int i = 0; i < grade.length; i++) grade[i] = random.nextInt(100);

        int[] a = new int[]{23, 78, 45, 8, 32, 56};

        System.out.println("Original Grades: " + Arrays.toString(a) + "\n");

        selectionSort(a.clone());
        bubbleSort(a.clone());
        insertionSort(a.clone());
    }
}
