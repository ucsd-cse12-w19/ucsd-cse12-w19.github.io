
class Point {
  int x, y;
  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

class Main {

  static int max(int n, int m) {
    boolean compareResult = n > m;
    System.out.print("Compare result for " + n + " > " + m + ": " + compareResult + "\n");
    if(compareResult) { return n; }
    else { return m; }
  }

  static boolean between(float low, float n, float high) {
    return n > low && n < high;
  }

  static int sum(int upto) {
    int result = 0;
    for(int i = 0; i < upto; i += 1) {
      result += i;
    }
    return result;
  }

  static int sumarr(int[] arr) {
    int result = 0;
    for(int i = 0; i < arr.length; i += 1) {
      result += arr[i];
    }
    return result;
  }

  static boolean isLeftOf(Point p1, Point p2) {
    return p1.x < p2.x;
  }

  public static void main(String[] args) {
    System.out.println("Hello");
    System.out.println("max(4, 5): " + max(4, 5));
    System.out.println("max(6, 5): " + max(6, 5));
    System.out.println("sum to 10: " + sum(10));

    int[] a = new int[5];
    a[0] = 10;
    a[1] = 20;
    a[2] = 30;
    a[3] = 40;
    a[4] = 50;

    System.out.println("sum of a: " + sumarr(a));

    Point p45 = new Point(4, 5);
    Point p78 = new Point(7, 8);

    System.out.println(isLeftOf(p45, p78));

  }
}
