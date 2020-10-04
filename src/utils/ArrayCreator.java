package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayCreator {
    Scanner scanner = new Scanner(System.in);
    int element;
    public void createArray(int[] array){
        for (int i = 0; i<array.length; i++){
            System.out.print("\nEnter element :");
            try{
                element = scanner.nextInt();
                array[i] = element;
            }
            catch (InputMismatchException e){
                System.out.println("Invalid input, please enter a number only!");
                scanner.nextBigDecimal();
                continue;
            }
        }
        System.out.print("Array created : ");
        printArray(array);
    }
    public void printArray(int[] array){

        for (int i=0; i<array.length; i++){
            if (i==0)
                System.out.print("[");
            System.out.print(array[i]);
            if (i<array.length-1)
                System.out.print(", ");
            if (i==array.length-1)
                System.out.print("]");
        }
    }
}
