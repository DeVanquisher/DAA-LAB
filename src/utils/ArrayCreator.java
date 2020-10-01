package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayCreator {
    Scanner scanner = new Scanner(System.in);
    double element;
    public void createArray(double[] array){
        for (int i = 0; i<array.length; i++){
            System.out.print("\nEnter element :");
            try{
                element = scanner.nextDouble();
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
