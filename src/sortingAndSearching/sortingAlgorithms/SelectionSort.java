package sortingAndSearching.sortingAlgorithms;


public class SelectionSort {
    public void sortArray(int[] array){
        int len = array.length;
        for(int i=0; i<len-1; i++){
            int min = i;
            for(int j=i+1; j<len; j++){
                if(array[j]<array[min])
                    min = j;
            }
            if(min != i){
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }
}
