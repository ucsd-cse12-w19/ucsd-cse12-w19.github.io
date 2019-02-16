int hash1(String s) {
  return s.length();
}

int hash2(String s) {
  int hash = 0;
  for(int i = 0; i < s.length(); i += 1) {
    hash += Character.codePointAt(s, i);
  }
  return hash;
}


public int hash3(String s) {
  int h = 0;
  for (int i = 0; i < s.length(); i++) {
    h = 31 * h + Character.codePointAt(s, i);
  }
  return h;
}

/**
  This method reads in all the words in the dictionary and prints/counts all
  the collisions. You can modify the path to match the path on your system (or
  any text file with one word per line)
*/
void findCollisionInDict() throws Throwable {
  HashMap<Integer, String> ht = new HashMap<>();
  int collisions = 0;
  for(String s: Files.readAllLines(Paths.get("/usr/share/dict/words"))) {
    if(ht.containsKey(hash3(s))) {
      collisions += 1;
      System.out.println("Collision: " + s + " with " + ht.get(hash3(s)));
    }
    else {
      ht.put(hash3(s), s);
    }
  }
  System.out.println("Total collisions: " + collisions);
}

class HashTable<K,V> {
  class Entry {
    K k; V v;
    public Entry(K k, V v) { this.k = k; this.v = v; }
  }
  List<Entry>[] buckets; // An array of Lists of Entries
  int size;
  @SuppressWarnings("unchecked")
  public HashTable() {
    this.size = 0;
    this.buckets = (List<Entry>[])(new List[4]);
  }
  public double loadFactor() {
    return (double)(this.size) / this.buckets.length;
  }
  /*
    Value get(key):
      hashed = hash(key)
      index = hashed % this.buckets.length
      if this.buckets[index] contains an Entry with key:
        return the value of that entry
      else:
        return null/report an error
  */
  public V get(K k) {
    int hashCode = k.hashCode();
    int index = hashCode % this.buckets.length;
    if(this.buckets[index] == null) {
      throw new NoSuchElementException("No such element " + k);
    }
    else {
      for(Entry e: this.buckets[index]) {
        if(e.k.equals(k)) {
          return e.v;
        }
      }
      throw new NoSuchElementException("No such element " + k);
    }
  }
  /*

  set(key, value):
    hashed = hash(key)
    index = hashed % array length
    if this.buckets[index] contains a pair with key:
      update that pair to contain value
    else:
      increment this.size
      add {key: value} to buckets[index]

  */
  public void set(K k, V v) {
    if(loadFactor() > 0.5) { expandCapacity(); }
    int hashCode = k.hashCode();
    int index = hashCode % this.buckets.length;
    if(this.buckets[index] == null) {
      this.buckets[index] = new ArrayList<Entry>();
      this.buckets[index].add(new Entry(k, v));
    }
    else {
      for(Entry e: this.buckets[index]) {
        if(e.k.equals(k)) {
          e.v = v;
          return;
        }
      }
      this.buckets[index].add(new Entry(k, v));
    }
    this.size += 1;
  }
  /*

  expandCapacity():
    newEntries = new List[this.buckets.length * 2];
    oldEntries = this.buckets
    this.buckets = newEntries
    this.size = 0
    for each entry {k:v}:
      this.set(k, v)

  */
  @SuppressWarnings("unchecked")
  public void expandCapacity() {
    List<Entry>[] newEntries = (List<Entry>[])(new List[this.buckets.length * 2]);
    List<Entry>[] oldEntries = this.buckets;
    this.buckets = newEntries;
    this.size = 0;
    for(int i = 0; i < oldEntries.length; i += 1) {
      if(oldEntries[i] == null) { continue; }
      for(Entry e: oldEntries[i]) {
        this.set(e.k, e.v);
      }
    }
  }
}


HashTable<String, Integer> build() {
  HashTable<String, Integer> ht = new HashTable<>();
  ht.set("a", 6);
  ht.set("b", 6);
  ht.set("c", 6);
  ht.set("d", 6);
  return ht;
}
