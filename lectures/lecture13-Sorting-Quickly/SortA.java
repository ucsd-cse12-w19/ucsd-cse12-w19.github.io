public class Sort {
  public static void swap(String[] array, int i1, int i2) {
    String temp = array[i1];
    array[i1] = array[i2];
    array[i2] = temp;
  }
  public static int partition(String[] array, int low, int high) {
    int pivotIndex = high - 1;
    String pivot = array[pivotIndex];
    int smallerBefore = low;
    int largerAfter = high - 2;
    while(smallerBefore < largerAfter) {
      if(array[smallerBefore].compareTo(pivot) < 0) {
        smallerBefore += 1;
      }
      else {
        swap(array, smallerBefore, largerAfter);
        largerAfter -= 1;
      }
    }
    if(array[smallerBefore].compareTo(pivot) < 0) {
      swap(array, smallerBefore + 1, pivotIndex);
      return smallerBefore + 1;
    }
    else {
      swap(array, smallerBefore, pivotIndex);
      return smallerBefore;
    }
  }

  public static void qsort(String[] array, int low, int high) {
    if(high - low <= 1) { return; }
    int splitAt = partition(array, low, high);
    qsort(array, low, splitAt);
    qsort(array, splitAt + 1, high);
  }

  public static void sort(String[] array) {
    qsort(array, 0, array.length);
  }
}
