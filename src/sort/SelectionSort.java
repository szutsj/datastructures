package sort;

import array.OwnArray;

public class SelectionSort {
  
  public static void sort(OwnArray array){
    int length = array.length();
    int min = 0;
    
    for (int outer = 0; outer < length - 1; outer++){
      min = outer;
      for (int inner = outer + 1; inner < length; inner++) {
        if (array.get(inner) < array.get(min)) {
          min = inner;
        }
      }
      if (min != outer){
        array.swap(min, outer);
      }
    }
  }
  
}
