package sortingAlgorithms;



public class InsertionSorter {
    public void sortArray(double[] array){
        for (int i = 1; i<array.length; i++){
            double temp = array[i];
            int j = i-1;
            while (j>=0 && array[j]>temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
        System.out.print("\nArray sorted : ");
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}
