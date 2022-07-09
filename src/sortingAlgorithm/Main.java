package sortingAlgorithm;

public class Main {
    public static void main(String[] args) {
        // Bubble Sort
        int arr[] = {3, 60, 35, 2, 45, 320, 5};
        System.out.println("Array Before Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(arr);

        System.out.println("Array After Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");


        //Selection Sort
        int arr1[] = {4, 60, 35, 1, 45, 30, 17, 44, 9};
        System.out.println("Before Selection Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(arr1);//sorting array using selection sort

        System.out.println("After Selection Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println("\n");


        //Insertion Sort
        int arr2[] = {24,17,58,781,5,20,4};
        System.out.println("Before Insertion Sort");
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println();

        InsertionSort insertionSort = new InsertionSort();
        InsertionSort.insertionSort(arr2);//sorting array using insertion sort

        System.out.println("After Insertion Sort");
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }
}



