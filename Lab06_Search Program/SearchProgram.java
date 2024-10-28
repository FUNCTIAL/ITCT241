// File: SearchProgram.java
// Description: Linear/Binary Search Array
// Assignment Number: 6
//
// ID: 6580838
// Name: Teerathad Udomjitwiwat
// Grader: P'Ice
//
// On my honor, Teerathad Udomjitwiwat, this lab assignment is my own work
// and I have not provided this code to any other students

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SearchProgram {

    public static void linearSearch(int[] arr, int key) {
        int steps = 0;

        for (int i = 0; i < arr.length; i++) {
            steps++;
            if (arr[i] == key) {
                System.out.println(
                    "Linear Search - Result at index: " +
                    i +
                    ", " +
                    steps +
                    " steps taken."
                );
                return;
            }
        }
        System.out.println(
            "Linear Search - Result at index: " +
            -1 +
            ", " +
            steps +
            " steps taken."
        );
    }

    public static void binarySearch(int[] arr, int key) {
        int upper = arr.length - 1;
        int lower = 0;
        int steps = 0;

        while (lower <= upper) {
            steps++;
            int mid = (lower + upper) / 2;
            if (arr[mid] == key) {
                System.out.println(
                    "Linear Search - Result at index: " +
                    mid +
                    ", " +
                    steps +
                    " steps taken."
                );
                return;
            } else if (arr[mid] < key) {
                lower = mid + 1;
            } else {
                upper = mid - 1;
            }
        }
        System.out.println(
            "Linear Search - Result at index: " +
            -1 +
            ", " +
            steps +
            " steps taken."
        );
    }

    // public static void display(int[] arr) {
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println("\n");
    // }

    public static void main(String[] args) {
        int[] arr = new int[100];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) arr[i] = random.nextInt(101);
        Arrays.sort(arr);

        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        // display(arr);
        System.out.println(Arrays.toString(arr));

        linearSearch(arr, userInput);
        binarySearch(arr, userInput);
        scanner.close();
    }
}
