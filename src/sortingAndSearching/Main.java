package sortingAndSearching;

import sortingAndSearching.searchingAlgorithms.BinarySearch;
import sortingAndSearching.sortingAlgorithms.*;
import sortingAndSearching.utils.ArrayBuilder;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Main{

    public static void main(String[] args) {

        int option;

        //first we need to create array
        ArrayBuilder arrayBuilder = new ArrayBuilder();

        int[] array = arrayBuilder.buildArray();


        BubbleSort bubbleSorter = new BubbleSort();
        InsertionSort insertionSorter = new InsertionSort();
        SelectionSort selectionSorter = new SelectionSort();
        QuickSort quickSorter = new QuickSort();
        MergeSort mergeSorter = new MergeSort();

        //Objects of searching algorithm classes
        BinarySearch binarySearcher = new BinarySearch();

        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("\nSelect an option:" +
                        "\nTo sort an array press --->1" +
                        "\nTo search an element from array press --->2");
                option = sc.nextInt();
                if (option == 1) {

                    System.out.println("What type of sorting you want to prefer?\n" +
                            "press-->1 to Bubble sort\n" +
                            "press-->2 to Insertion sort\n" +
                            "press-->3 to Selection sort\n" +
                            "press-->4 to Quick sort\n" +
                            "press-->5 to Merge sort");
                    int key = sc.nextInt();

                    switch (key) {
                        case 1:
                            bubbleSorter.sortArray(array);
                            break;
                        case 2:
                            insertionSorter.sortArray(array);
                            break;
                        case 3:
                            selectionSorter.sortArray(array);
                            break;
                        case 4:
                            quickSorter.sortArray(array, 0, array.length - 1);
                            break;
                        case 5:
                            mergeSorter.sortArray(array, 0, array.length - 1);
                            break;
                        default:
                            System.out.println("Wrong key choose either 1, 2 or 3.");
                            continue;

                    }
                    System.out.print("Array sorted : ");
                    arrayBuilder.printArray(array);

                    //for searching algorithm
                    System.out.print("\nDo you want search location of any element(y/n) :");

                    //variable to choose y or no
                    char var = sc.next().charAt(0);
                    char ch = Character.toLowerCase(var);
                    int value = Character.compare(ch, 'y');
                    if (value == 0)
                        binarySearcher.makeChoice(array);

                } else if (option == 2) {
                    binarySearcher.makeChoice(array);

                } else
                    System.out.println("Invalid key press either 1 or 2.");


                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter a number only!");
                sc.next();
                continue;
            } catch (NullPointerException e) {
                System.out.println("Enter int value only.");
                continue;

            }

        }
    }
}

