import searchingAlgorithms.BinarySearcher;
import sortingAlgorithms.*;
import utils.ArrayCreator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] arr;

        //Objects sorting algorithm classes
        ArrayCreator arrayCreator = new ArrayCreator();
        BubbleSorter bubbleSorter = new BubbleSorter();
        InsertionSorter insertionSorter = new InsertionSorter();
        SelectionSorter selectionSorter = new SelectionSorter();
        QuickSorter quickSorter = new QuickSorter();
        MergeSorter mergeSorter = new MergeSorter();

        //Objects of searching algorithm classes
        BinarySearcher binarySearcher = new BinarySearcher();

        Scanner sc = new Scanner(System.in);

        while (true) {
            try {

                System.out.print("Enter the size of array: ");
                int size = sc.nextInt();
                int[] array = new int[size];

                arr = array;

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
                    case 4: quickSorter.sortArray(array,0,array.length-1);
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
        //for searching algorithm
        System.out.print("\nDo you want search any element(y/n) :");

        //variable an to choose y or no
        char var = sc.next().charAt(0);
        char ch = Character.toLowerCase(var);
        int value = Character.compare(ch,'y');
        if (value == 0)
            binarySearcher.makeChoice(arr);


    }
}

