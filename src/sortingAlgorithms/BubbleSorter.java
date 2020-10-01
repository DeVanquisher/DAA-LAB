package sortingAlgorithms;



public class BubbleSorter {
    public void sortArray(double[] array){
        for (int i = 0; i<(array.length)-1; i++){
            int flag = 0;
            for (int j=0; j<(array.length)-i-1;j++){
                if (array[j]>array[j+1]){
                    //swapper.swap(array[j],array[j+1]);
                    double temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0)
                break;
        }
        System.out.print("\nArray sorted : ");
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}
