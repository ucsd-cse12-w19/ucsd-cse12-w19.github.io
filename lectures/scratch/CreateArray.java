public class CreateArray {
  public static void main(String[] args) {
    long start;
    int[] a;
    start = System.nanoTime();
    a = new int[1000];
    System.out.println(System.nanoTime() - start);
    start = System.nanoTime();
    a = new int[10000];
    System.out.println(System.nanoTime() - start);
    start = System.nanoTime();
    a = new int[100000];
    System.out.println(System.nanoTime() - start);
    start = System.nanoTime();
    a = new int[1000000];
    System.out.println(System.nanoTime() - start);
  }
}
