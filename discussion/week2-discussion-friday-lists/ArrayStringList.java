public class ArrayStringList implements StringList {

  String[] elements;
  int size;

  public ArrayStringList() {
    this.elements = new String[2];
    this.size = 0;
  }

  public void add(String s) {
    expandCapacity();
    this.elements[this.size] = s;
    this.size += 1;
  }

  public String get(int index) {
    // TODO: Check for out-of-bounds
    // throw IndexOutOfBoundsException
    return this.elements[index];
  }

  public int size() {
    return this.size;
  }

  private void expandCapacity() {
    // NOTE(joe): I changed currentSize to currentCapacity below
    // because it's a better name for the variable
    int currentCapacity = this.elements.length;
    if(this.size < currentCapacity) { return; }

    String[] expanded = new String[currentCapacity * 2];

    for(int i = 0; i < this.size; i += 1) {
      expanded[i] = this.elements[i];
    }
    this.elements = expanded;
  }

  //Assumes a valid index is given
  public void remove(int index){
    for(int i = index; i < this.size - 1; i++){
      this.elements[i] = this.elements[i + 1];
    }
	  
    this.elements[size] = null;
    this.size -= 1;
	  
    return;
  }
  
  //Assumes a valid index is given
  public void insert(int index, String s){
    expandCapacity();
	  
    for(int i = this.size; i > index; i--){
      this.elements[i] = this.elements[i - 1];
    }
    
    this.elements[index] = s; //ASK students about why this must come after loop?
    this.size += 1;
	  
    return;
  }
  
  //Just call insert at index 0!
  public void prepend(String s){
	  this.insert(0, s);
	  return;
  }
}