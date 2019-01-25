import java.util.ArrayList;

public interface Queue<E> {
  void enqueue(E element);
  E dequeue();
  int size();
}

// Adapter pattern
class ALQueue<E> implements Queue<E> {

  // IDEA 1:
  // ArrayList<E> contents = new ArrayList<E>();

  // IDEA 2:
  ArrayList<E> contents;
  public ALQueue() {
    this.contents = new ArrayList<E>();
  }

  public int size() {
    return this.contents.size();
  }

  public void enqueue(E element) {
    this.contents.add(this.contents.size(), element);
    //this.contents.add(element);                    
    //this.contents.add(0, element);
  }

  public E dequeue() {
    E element = this.contents.remove(0);
    return element;
  }










  public String toString() {
    return "front → " + this.contents.toString() + " ← back";
  }
}
