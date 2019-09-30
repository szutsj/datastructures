package sort;

import array.OwnArray;

public class ShellSort {

    public static void sort(OwnArray array){
        int h = 1;

        while (h < array.length() / 3){
            h = h * 3 + 1;
        }

        while (h > 0){
            for (int outer = h; outer < array.length(); outer++){
                int temp = array.get(outer);
                int inner = outer;
                while (inner > h - 1 && array.get(inner - h) >= temp){
                    array.set(inner, array.get(inner - h));
                    inner -= h;
                }
                array.set(inner, temp);
            }
            h = (h - 1) / 3;
        }
    }
}
