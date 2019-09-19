package array;

public class ArrayWithoutDuplicates implements OwnArray{
  private int[] array;
  private int nElem;
  
  public ArrayWithoutDuplicates(int size){
    array = new int[size];
    nElem = 0;
  }
  
  public int length(){
    return nElem;
  }
  
  public void set(int index, int data) {
    array[index] = data;
  }
  
  public int get(int index) {
    return array[index];
  }
  
  public void insert(int data){
    if (!find(data)){
      array[nElem++] = data;
    }
  }
  
  public boolean find(int number){
    for (int i = 0; i < nElem; i++){
      if (array[i] == number){
        return true;
      }
    }
    return false;
  }
  
  public boolean delete(int data){
    for (int i = 0; i < nElem; i++){
      if (array[i] == data){
        for (int j = i; j < nElem - 1; j++){
          array[j] = array[j + 1];
        }
        nElem--;
        return true;
      }
    }
    return false;
  }
  
  public void display() {
    for (int i = 0; i < nElem; i++) {
      System.out.print(array[i]);
      if (i != nElem - 1) {
        System.out.print(", ");
      }
    }
    System.out.println();
  }
  
  public void swap (int indexA, int indexB){
    int swap = array[indexA];
    array[indexA] = array[indexB];
    array[indexB] = swap;
  }
  
}
