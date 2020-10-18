package sortingAndSearching.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayBuilder extends Throwable{

    private int ARRAY_SIZE;
    private int[] ARRAY;

    public int getARRAY_SIZE() {
        return ARRAY_SIZE;
    }

    public void setARRAY_SIZE(int ARRAY_SIZE) {
        this.ARRAY_SIZE = ARRAY_SIZE;
    }

    public int[] getARRAY() {
        return ARRAY;
    }

    public void setARRAY(int[] ARRAY) {
        this.ARRAY = ARRAY;
    }

    public int[] buildArray(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                System.out.print("To create an array enter size of array : ");
                int size = scanner.nextInt();

                setARRAY_SIZE(size);
                int[] array = new int[size];
                setARRAY(array);

                System.out.println("\nEnter "+size+" elements below:");
                for (int i = 0; i<size; i++){
                    int element = scanner.nextInt();
                    array[i] = element;
                }

                break;
            }
            catch (InputMismatchException e){
                System.out.println("Invalid input, enter number only.\nInput is "+e.getMessage());
                scanner.next();
                continue;
            }

        }
        System.out.print("Array created : ");
        printArray(ARRAY);
        return ARRAY;
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
