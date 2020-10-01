import sortingAlgorithms.BubbleSorter;
import sortingAlgorithms.InsertionSorter;
import sortingAlgorithms.SelectionSorter;
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
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("How many elements you want to enter: ");
                int size = sc.nextInt();
                double[] array = new double[size];
                arrayCreator.createArray(array);
                System.out.println("\nWhat type of sorting you want to prefer?\n" +
                        "press-->1 to Bubble sort\n" +
                        "press-->2 to Insertion sort\n"+
                        "press-->3 to Selection sort");
                int key = sc.nextInt();
                switch (key)
                {
                    case 1: bubbleSorter.sortArray(array);
                    break;
                    case 2: insertionSorter.sortArray(array);
                    break;
                    case 3: selectionSorter.sortArray(array);
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
