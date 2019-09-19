package sort;

import array.OwnArray;

public class SelectionSort {
  
  public static void sort(OwnArray array){
    int length = array.length();
    int min = 0;
    
    for (int outter = 0; outter < length - 1; outter++){
      min = outter;
      for (int inner = outter + 1; inner < length; inner++) {
        if (array.get(inner) < array.get(min)) {
          min = inner;
        }
      }
      if (min != outter){
        array.swap(min, outter);
      }
    }
  }
  
}
