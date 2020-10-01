package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayCreator_int {
    Scanner scanner = new Scanner(System.in);
    static int element;
    public void createArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.print("\nEnter element :");
            try{
                element = scanner.nextInt();
                array[i] = element;
            }
            catch (InputMismatchException e){
                System.out.println("Invalid input, please enter a number only!");
                scanner.next();
                continue;
            }
        }
        System.out.print("Array created : ");
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }

    }
}
