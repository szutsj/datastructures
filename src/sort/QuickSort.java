package sort;

import array.OwnArray;

public class QuickSort {

    public static void sort(OwnArray array){
        recQuickSort(array, 0, array.length() -1);
    }

    private static void recQuickSort(OwnArray array, int left, int right){
        if (right - left <= 0){
            return;
        }
        int pivot = array.get(right);
        int partion = partioning(array, left, right, pivot);
        recQuickSort(array, left, partion - 1);
        recQuickSort(array, partion + 1, right);
    }

    private static int partioning(OwnArray array, int left, int right, int pivot) {
        int leftPart = left - 1;
        int rightPart = right;

        while (true) {
            while (array.get(++leftPart) < pivot){}
            while (rightPart > 0 && array.get(--rightPart) > pivot){}
            if (leftPart >= rightPart) {
                break;
            } else {
                array.swap(leftPart, rightPart);
            }
        }
        array.swap(leftPart, right);
        return leftPart;
    }

}
