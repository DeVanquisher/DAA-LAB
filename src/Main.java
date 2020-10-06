import sortingAlgorithms.*;
import utils.ArrayCreator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static int size;
    public static void main(String[] args) {
        //ArrayCreator_int arrayCreator = new ArrayCreator_int();
        ArrayCreator arrayCreator = new ArrayCreator();
        BubbleSorter bubbleSorter = new BubbleSorter();
        InsertionSorter insertionSorter = new InsertionSorter();
        SelectionSorter selectionSorter = new SelectionSorter();
        QuickSorter quickSorter = new QuickSorter();
        MergeSorter mergeSorter = new MergeSorter();

        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter the size of array: ");
                int size = sc.nextInt();
                int[] array = new int[size];
                arrayCreator.createArray(array);
                System.out.println("\nWhat type of sorting you want to prefer?\n" +
                        "press-->1 to Bubble sort\n" +
                        "press-->2 to Insertion sort\n"+
                        "press-->3 to Selection sort\n"+
                        "press-->4 to Quick sort\n"+
                        "press-->5 to Merge sort");
                int key = sc.nextInt();
                switch (key)
                {
                    case 1: bubbleSorter.sortArray(array);
                        //printing sorted array
                        System.out.print("Array sorted : ");
                        arrayCreator.printArray(array);
                        break;
                    case 2: insertionSorter.sortArray(array);
                        //printing sorted array
                        System.out.print("Array sorted : ");
                        arrayCreator.printArray(array);
                        break;
                    case 3: selectionSorter.sortArray(array);
                        //printing sorted array
                        System.out.print("Array sorted : ");
                        arrayCreator.printArray(array);
                        break;
                    case 4: quickSorter.sortArray(array,array[0],array[array.length]-1);
                        //printing sorted array
                        System.out.print("Array sorted : ");
                        arrayCreator.printArray(array);
                        break;
                    case 5: mergeSorter.sortArray(array,0,array.length-1);
                        //printing sorted array
                        System.out.print("Array sorted : ");
                        arrayCreator.printArray(array);
                        break;
                    default: System.out.println("Wrong key choose either 1, 2 or 3.");
                        continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter a number only!");
                sc.next();
                continue;
            }

        }
    }
}

