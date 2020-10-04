package sortingAlgorithms;

import utils.ArrayCreator;

public class QuickSorter {
    ArrayCreator arrayCreator = new ArrayCreator();
    public void sortArray(int[] array, int lb, int ub){
        if (lb<ub){
            int loc = partition(array,lb,ub);
            sortArray(array,lb,loc-1);
            sortArray(array,loc+1,ub);
        }
        System.out.print("Array sorted : ");
        arrayCreator.printArray(array);

    }
    public int partition(int[] array, int lb, int ub){
        int pivot = array[lb];
        int start = lb;
        int end = ub;
        int temp1;
        int temp2;
        while (start < end){
            while (array[start]<= pivot)
                start++;
            while (array[end] > pivot){
                end--;
            }
            if (start < end) {
                temp1 = array[start];
                array[start] = array[end];
                array[end] = array[temp1];
            }
        }
        temp2 = array[lb];
        array[lb] = array[end];
        array[end] = array[lb];
        return end;
    }
}
