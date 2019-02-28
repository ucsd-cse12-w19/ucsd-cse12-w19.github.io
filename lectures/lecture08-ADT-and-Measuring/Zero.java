public class Zero {
  public static boolean isZero(int[] arr) {
    for(int i = 0; i < arr.length; i += 1) {
      if(arr[i] == 0) { return false; }
    }
    return true;
  }
  public static void main(String[] args) {
    int[] smallArr = {1, 2, 3};
    int[] largeArr = new int[100000000];
    for(int i = 0; i < largeArr.length; i += 1) {
      largeArr[i] = i;
    }
    long start = System.nanoTime();
    isZero(smallArr);
    long dur = System.nanoTime() - start;
    System.out.println(dur);

    start = System.nanoTime();
    isZero(largeArr);
    dur = System.nanoTime() - start;
    System.out.println(dur);
  }
}
