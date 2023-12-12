package com.infy.varargs;

class VarargsExercise1 {
    
    public static void displayList(int... input) {
        System.out.print("List of items: ");
        for (int item : input) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static int maxOfList(int... input) {
        int max = Integer.MIN_VALUE;
        for (int item : input) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }

    public static void sortList(int... input) {
        // Sorting the input array in ascending order
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j] > input[j + 1]) {
                    // Swap if the element found is greater
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }

        // Displaying the sorted list
        System.out.print("Sorted List: ");
        for (int item : input) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static double averageList(int... input) {
        int sum = 0;
        for (int item : input) {
            sum += item;
        }
        return (double) sum / input.length;
    }
}
