package sortingAndSearching.utils;

import java.util.ArrayList;

public class DuplicateElement {
    public void checkIdenticalElements(int[] array, int element){
        int numOfRepeats = 0;
        for (int i = 0; i<array.length;i++){
            if (array[i] == element){
                ++numOfRepeats;
            }
        }
        if (numOfRepeats > 1)
            System.out.println(element+" found at "+numOfRepeats+" times.");

    }
}
