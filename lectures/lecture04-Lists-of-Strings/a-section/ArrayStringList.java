public class ArrayStringList implements StringList {

  String[] elements;
  int size;           // How many elements are in the list

  // How will we construct it?
  public ArrayStringList() {
    this.elements = new String[2];  // Capacity of 2
    this.size = 0;                  // Number of elements added
    // Initial size value:
    // A: 2
    // B: 0               <-- correct answer
    // C: Something else
  }

  public ArrayStringList(int capacity) {
    this.elements = new String[capacity];
    this.size = 0;
  }

  // How will it implement the methods?
  public void add(String s) {
    this.elements[this.size] = s;
    this.size += 1;
  }

  public String get(int index) {
    return this.elements[index];
  }

  public int size() {
    return this.size;
  }
























}
