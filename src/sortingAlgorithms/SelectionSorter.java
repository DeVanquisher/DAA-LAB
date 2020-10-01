package sortingAlgorithms;


public class SelectionSorter {
    public void sortArray(double[] array){
        int len = array.length;
        for(int i=0; i<len-1; i++){
            int min = i;
            for(int j=i+1; j<len; j++){
                if(array[j]<array[min])
                    min = j;
            }
            if(min != i){
                double temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        for(int k=0; k<len; k++){
            System.out.print(array[k]+" ");
        }
    }
}
