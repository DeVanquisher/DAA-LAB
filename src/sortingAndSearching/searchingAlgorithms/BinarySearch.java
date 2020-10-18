package sortingAndSearching.searchingAlgorithms;


import sortingAndSearching.utils.ArrayBuilder;
import sortingAndSearching.utils.DuplicateElement;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BinarySearch {
    Scanner scanner = new Scanner(System.in);
    int result;

    public void makeChoice(int[] arr){
        BinarySearch ob = new BinarySearch();
        ArrayBuilder arrayBuilder = new ArrayBuilder();
        int key,item;
        while (true){
            try {
                System.out.print("Which element you want to search in array? :");
                item = scanner.nextInt();
                System.out.println("Array has been sorted in ascending order to binary search :");
                arrayBuilder.printArray(arr);

                DuplicateElement duplicateElement = new DuplicateElement();
                duplicateElement.checkIdenticalElements(arr,item);

                System.out.println("In binary search choose an option given below.\n"+
                        "press-->1 for recursive method\n"+
                        "press-->2 for iterative method");
                key = scanner.nextInt();



                if (key ==1 ) {
                    recursiveSearch(arr, 0, arr.length - 1, item);
                    result = ob.recursiveSearch(arr, 0, arr.length - 1, item);
                }
                else if (key == 2) {
                    iterativeSearch(arr, item);
                    result = ob.iterativeSearch(arr,item);
                }


                if (result == -1)
                    System.out.println("Element not present");
                else
                    System.out.println("Element found at index " + result);
                break;
            }
            catch (InputMismatchException e){
                System.out.println("Invalid input, enter number only.\nInput is "+e.getMessage());
                scanner.next();
                continue;
            }
        }


    }
    public int recursiveSearch(int arr[], int l, int r, int x){

        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return recursiveSearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return recursiveSearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;


    }
    public int iterativeSearch(int[] arr, int x){

        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
        }
}
