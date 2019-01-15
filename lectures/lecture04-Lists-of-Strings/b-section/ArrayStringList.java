public class ArrayStringList implements StringList {

  String[] elements;
  int size;

  // How will we construct it?
  public ArrayStringList() {
    this.elements = new String[2];
    this.size = 0;
    // initial size value:
    // A: 2
    // B: 0
    // C: something else
  }

  // implement add(), get() and size()

  public void add(String s) {
    expandCapacity();
    this.elements[this.size] = s;
    this.size += 1;
  }

  public String get(int index) {
    // TODO(joe): Check for out-of-bounds
    // throw IndexOutOfBoundsException
    return this.elements[index];
  }

  public int size() {
    return this.size;
  }



















    // this.elements[0] = s; // incorrect

/*
    for(int i = 0; i < this.elements.length; i += 1) {
      if(this.elements[i] == null) {
        this.elements[i] = s;
        return;
      }
    }
*/
}
