package sort;

import array.OwnArray;

public class InsertionSort {
  
  public static void sort(OwnArray array){
    for (int outer = 1; outer < array.length(); outer++){
      int temp = array.get(outer);
      int inner = outer;
      while(inner > 0 && array.get(inner - 1) > temp){
        array.set(inner, array.get(inner - 1));
        inner--;
        }
      array.set(inner, temp);
    }
  }
  
}
