public class Sort {
  static String spaces(int count) {
    return String.join("", Collections.nCopies(count, "   "));
  }
  public static void swap(String[] array, int i1, int i2) {
    String temp = array[i1];
    array[i1] = array[i2];
    array[i2] = temp;
  }
  public static int partition(String[] array, int low, int high) {
    int pivotIndex = high - 1;
    String pivot = array[pivotIndex];
    int smallerBeforeIndex = low;
    int largerAfterIndex = high - 2;
    while(largerAfterIndex >= smallerBeforeIndex) {
      System.out.println(Arrays.toString(array));
      if(array[smallerBeforeIndex].compareTo(pivot) > 0) {
        swap(array, smallerBeforeIndex, largerAfterIndex);
        largerAfterIndex -= 1;
      }
      else {
        smallerBeforeIndex += 1;
      }
    }
    swap(array, pivotIndex, largerAfterIndex + 1);
    System.out.println(Arrays.toString(array));
    return largerAfterIndex + 1;
  }

  public static void qsort(String[] array, int low, int high) {
    if(high - low <= 1) { return; }
    int splitAt = partition(array, low, high);
    System.out.println(splitAt);
    qsort(array, low, splitAt);
    qsort(array, splitAt + 1, high);
  }

  public static void sort(String[] array) {
    qsort(array, 0, array.length);
  }
}
