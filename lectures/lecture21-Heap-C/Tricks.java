void pqSort(int[] arr) {
  PriorityQueue<Integer> pq = new PriorityQueue<>(Integer::compare);
  for(int i = 0; i < arr.length; i += 1) {
    pq.add(arr[i]);
  }
  for(int i = 0; i < arr.length; i += 1) {
    arr[i] = pq.poll();
  }
}

























class Tracker {
  PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder(Integer::compare));
  PriorityQueue<Integer> pq2 = new PriorityQueue<>(Integer::compare);
  void add(int n) {
    if(pq2.size() == 0 && pq1.size() == 0) {
      pq2.add(n);
      return;
    }
    int current = get();
    if(n >= current) {
      pq2.add(n);
    }
    else {
      pq1.add(n);
    }
    int sizeDifference = pq2.size() - pq1.size();
    if(sizeDifference > 1) { pq1.add(pq2.poll()); }
    else if(sizeDifference < -1) { pq2.add(pq1.poll()); }
  }

  int get() {
    if(pq2.size() == pq1.size()) { return (pq2.peek() + pq1.peek()) / 2; }
    if(pq2.size() > pq1.size()) { return pq2.peek(); }
    else { return pq1.peek(); }
  }

  public String toString() {
    return "" + pq1 + " " + this.get() + " " + pq2;
  }
}

