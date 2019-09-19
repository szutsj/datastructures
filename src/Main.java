import array.ArrayWithDuplicates;
import array.ArrayWithoutDuplicates;
import sort.InsertionSort;
import sort.SelectionSort;

public class Main {
  public static void main(String[] args) {
//    ArrayWithDuplicates aWD = new ArrayWithDuplicates(30);
//    aWD.insert(8);
//    aWD.insert(26);
//    aWD.insert(15);
//    aWD.insert(41);
//    aWD.insert(3);
//    aWD.insert(8);
//    aWD.display();
//
    ArrayWithoutDuplicates aWOD = new ArrayWithoutDuplicates(30);
    aWOD.insert(8);
    aWOD.insert(26);
    aWOD.insert(15);
    aWOD.insert(41);
    aWOD.insert(3);
    aWOD.insert(8);
    aWOD.insert(198);
    aWOD.insert(96);
    aWOD.insert(72);
    aWOD.insert(87);
    aWOD.insert(1);
    aWOD.display();
   
    InsertionSort.sort(aWOD);
    aWOD.display();
  }
}
