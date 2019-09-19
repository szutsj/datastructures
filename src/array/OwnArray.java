package array;

public interface OwnArray {
  public int length();
  public void set(int index, int data);
  public int get(int index);
  public void insert(int data);
  public boolean delete(int data);
  public boolean find(int data);
  public void swap(int index1, int index2);
}
