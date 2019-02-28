class Entry<K, V> {
  K key; // aka the _priority_
  V value;
  public Entry(K k, V v) { this.key = k; this.value = v; }
  public String toString() {
    return "{ " + key + ": " + value + "}";
  }
}

// Implements a MAX heap
class Heap<K, V> {
  List<Entry<K,V>> entries;
  Comparator<K> comparator;
  public Heap(Comparator<K> comparator) {
    this.entries = new ArrayList<>();
    this.comparator = comparator;
  }

  int parent(int index) { return (index - 1)/2; }

  int left(int index) { return index * 2 + 1; }

  int right(int index) { return index * 2 + 2; }

  void swap(int i1, int i2) {
    Entry<K,V> tmp = this.entries.get(i1);
    this.entries.set(i1, this.entries.get(i2));
    this.entries.set(i2, tmp);
  }

  void bubbleUp(int index) {
    if(index <= 0) { return; }
    Entry<K,V> e = this.entries.get(index);  
    Entry<K,V> parent = this.entries.get(parent(index));  
    int comp = this.comparator.compare(e.key, parent.key);
    if(comp > 0) {
      swap(index, parent(index));
      bubbleUp(parent(index));
    }
    else {
      return;
    }
  }

  void set(K k, V v) {
    this.entries.add(new Entry<K,V>(k, v));
    bubbleUp(this.entries.size() - 1);
  }

  boolean existsAndGreater(int index1, int index2) {
    if(index1 >= this.entries.size()) { return false; }
    if(index2 >= this.entries.size()) { return false; }
    K k1 = this.entries.get(index1).key;
    K k2 = this.entries.get(index2).key;
    int comp = this.comparator.compare(k1, k2);
    if(comp > 0) { return true; }
    return false;
  }

  void bubbleDown(int index) {
    if(index >= this.entries.size()) { return; }
    int leftIndex = left(index);
    if(leftIndex >= this.entries.size()) { return; }
    int largerChildIndex = leftIndex;
    int rightIndex = right(index);
    if(existsAndGreater(rightIndex, leftIndex)) {
      largerChildIndex = rightIndex;
    }
    if(existsAndGreater(largerChildIndex, index)) {
      swap(index, largerChildIndex);
      bubbleDown(largerChildIndex);
    }
  }

  Entry<K, V> poll() {
    if(this.entries.size() == 0) { throw new NoSuchElementException(); }
    Entry<K, V> e = this.entries.get(0);
    this.entries.set(0, this.entries.get(this.entries.size() - 1));
    this.entries.remove(this.entries.size() - 1);
    bubbleDown(0);
    return e;
  }

  int size() {
    return this.entries.size();
  }

  public String toString() {
    return this.entries.toString();
  }

  V get(int index, K key) {
    if(index >= this.entries.size()) { return null; }

    Entry<K,V> entry = entries.get(index);
    
    if(entry.key.equals(key)) { return entry.value; }

    V leftResult = get(left(index), key);
    V rightResult = get(right(index), key);
    if(leftResult != null) { return leftResult; }
    if(rightResult != null) { return rightResult; }
    return null;
  }

  V get(K key) { return get(0, key); }
}
