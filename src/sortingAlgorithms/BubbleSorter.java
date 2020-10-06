package sortingAlgorithms;


import utils.ArrayCreator;

import java.math.BigDecimal;

public class BubbleSorter {
    public void sortArray(int[] array){
        ArrayCreator arrayCreator = new ArrayCreator();
        for (int i = 0; i<(array.length)-1; i++){
            int flag = 0;
            for (int j=0; j<(array.length)-i-1;j++){
                if (array[j] > array[j + 1]){
                    //swapper.swap(array[j],array[j+1]);
                    int temp =  array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0)
                break;
        }
    }
}
