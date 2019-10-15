package sort;

import array.OwnArray;

public class QuickSort2 {

    public static void sort(OwnArray array){
        recQuickSort2(array, 0, array.length() -1);
    }

    private static void recQuickSort2(OwnArray array, int left, int right){
        if (right - left <= 2){
            manualSort(array, left, right);
        } else {
            int median = findMedian(array, left, right);
            int partion = partioning(array, left, right, median);
            recQuickSort2(array, left, partion - 1);
            recQuickSort2(array, partion + 1, right);
        }
    }

    private static int findMedian(OwnArray array, int left, int right) {
        int center = (left + right) / 2;
        if (array.get(left) > array.get(center)){
            array.swap(left, center);
        }
        if (array.get(left) > array.get(right)){
            array.swap(left, right);
        }
        if (array.get(center) > array.get(right)){
            array.swap(center, right);
        }
        array.swap(center, right - 1);
        return array.get(right - 1);
   }

    private static int partioning(OwnArray array, int left, int right, int pivot) {
        int leftPart = left;
        int rightPart = right - 1;

        while (true) {
            while (array.get(++leftPart) < pivot);
            while (array.get(--rightPart) > pivot);
            if (leftPart >= rightPart) {
                break;
            } else {
                array.swap(leftPart, rightPart);
            }
        }
        array.swap(leftPart, right - 1);
        return leftPart;
    }

    private static void manualSort(OwnArray array, int left, int right){
        if (right - left <= 0) {
            return;
        }
        if (right - left == 1) {
            if (array.get(left) > array.get(right)){
                array.swap(left, right);
                return;
            }
        } else {
            if (array.get(left) > array.get(right -1)){
                array.swap(left, right - 1);
            }
            if (array.get(left) > array.get(right)){
                array.swap(left, right);
            }
            if (array.get(right - 1) > array.get(right)){
                array.swap(right - 1, right);
            }
        }
    }

}
