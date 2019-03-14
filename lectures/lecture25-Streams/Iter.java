public interface List<Element> {
  /* Add an element at the end of the list */
  void add(Element s);
  /* Get the element at the given index */
  Element get(int index);
  /* Get the number of elements in the list */
  int size();
}
class AList<E> implements List<E>, Iterable<E> {

  class AListIterator implements Iterator<E> {
    int currentIndex;
    int size;
    AList<E> alist;
    public AListIterator(int index, int size, AList<E> alist) {
      this.currentIndex = index;
      this.size = size;
      this.alist = alist;
    }

    public E next() {
      if(!this.hasNext()) { throw new NoSuchElementException(); }
      E answer = this.alist.elements[this.currentIndex];
      this.currentIndex += 1;
      return answer;
    }

    public boolean hasNext() {
      return this.currentIndex < this.size;
    }

    // TODO: next() and hasNext()

  }

  E[] elements;
  int size;

  @SuppressWarnings("unchecked")
  public AList() {
    this.elements = (E[])(new Object[2]);
    this.size = 0;
  }

  public Iterator<E> iterator() {
    return new AListIterator(0, this.size, this);
  }

  public void add(E s) {
    expandCapacity();
    this.elements[this.size] = s;
    this.size += 1;
  }

  public E get(int index) {
    if(index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException();
    }
    return this.elements[index];
  }

  public int size() {
    return this.size;
  }

  @SuppressWarnings("unchecked")
  private void expandCapacity() {
    // NOTE(joe): I changed currentSize to currentCapacity below
    // because it's a better name for the variable
    int currentCapacity = this.elements.length;
    if(this.size < currentCapacity) { return; }

    E[] expanded = (E[])(new Object[currentCapacity * 2]);


    for(int i = 0; i < this.size; i += 1) {
      expanded[i] = this.elements[i];
    }
    this.elements = expanded;
  }
}


class Range implements Iterable<Integer> {

  class RangeIterator implements Iterator<Integer> {
    int current;
    public RangeIterator(int start) {
      this.current = start;
    }
    public Integer next() {
      int currentVal = this.current;
      this.current += 1;
      return currentVal;
    }
    public boolean hasNext() {
      return this.current < high;
    }
  }

  int low, high;

  public Range(int low, int high) {
    this.low = low;
    this.high = high;
  }

  public Iterator<Integer> iterator() {
    return new RangeIterator(this.low);
  }















}

int sum = 0;
for(Integer i: new Range(0, 100)) {
  sum += i;
}
sum;

class Transformed<E> implements Iterable<E> {
  class TransformedIterator implements Iterator<E> {
    Iterator<E> iterator = iter.iterator();
    public E next() {
      return transformer.apply(this.iterator.next());
    }
    public boolean hasNext() {
      return this.iterator.hasNext();
    }
  }
  Function<E, E> transformer;
  Iterable<E> iter;
  public Transformed(Iterable<E> iter, Function<E, E> f) {
    this.iter = iter;
    this.transformer = f;
  }
  public Iterator<E> iterator() {
    return new TransformedIterator();
  }
}

// Idea:
Integer sum(Iterable<Integer> iterable) {
  int sum = 0;
  for(Integer i: new Range(0, 100)) {
    sum += i;
  }
  return sum;
}



/*

    int currentIndex = 0;
    public E next() {
      if(this.currentIndex >= size()) {
        throw new NoSuchElementException();
      }
      E answer = elements[this.currentIndex];
      this.currentIndex += 1;
      return answer;
    }
    public boolean hasNext() {
      return this.currentIndex < size();
    }
    */
