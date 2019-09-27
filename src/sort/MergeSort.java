package sort;

import array.OwnArray;

public class MergeSort {

    public static void sort(OwnArray array){
       int[] workspace = new int[array.length()];
       recMergeSorting(array, workspace, 0, workspace.length - 1);
    }

    private static void recMergeSorting(OwnArray array, int[] workspace, int min, int max){
        if (min == max){
            return;
        }
        int mid = min + (max - min) / 2;
        recMergeSorting(array, workspace, min, mid);
        recMergeSorting(array, workspace, mid + 1, max);
        merge(array, workspace, min, mid + 1, max);
    }

    private static void merge(OwnArray array, int[] workspace, int lowPart, int highPart, int max){
        int j = 0;
        int min = lowPart;
        int mid = highPart - 1;
        int n = max - min + 1;

        while (lowPart <= mid && highPart <= max){
            if (array.get(lowPart) <= array.get(highPart)){
                workspace[j++] = array.get(lowPart++);
            } else {
                workspace[j++] = array.get(highPart++);
            }
        }

        while (lowPart <= mid){
            workspace[j++] = array.get(lowPart++);
        }

        while (highPart <= max){
            workspace[j++] = array.get(highPart++);
        }

        for (int i = 0; i < n; i++){
            array.set(min + i, workspace[i]);
        }
     }

}
