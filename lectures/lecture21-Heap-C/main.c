#include <stdio.h>
#include <stdlib.h>

int max(int n, int m) {
  int compare_result = n > m;
  printf("Compare result for %d > %d: %d\n", n, m, compare_result);
  if(compare_result) { return n; }
  else { return m; }
}

int between(float low, float n, float high) {
  return n > low && n < high;
}

int sum(int upto) {
  int result = 0;
  for(int i = 0; i < upto; i += 1) {
    result += i;
  }
  return result;
}

int sumarr(int* arr, int length) {
  int result = 0;
  for(int i = 0; i < length; i += 1) {
    result += arr[i];
  }
  return result;
}

typedef struct Point {
  int x, y;
} Point;

Point* make_point(int x, int y) {
  Point* p = calloc(1, sizeof(Point));
  p->x = x;
  p->y = y;
  return p;
}

int isLeftOf(Point* p1, Point* p2) {
  return p1->x < p2->x;
}

int main(int argc, char** args) {
  printf("Hello\n");
  printf("max(4, 5): %d\n", max(4, 5));
  printf("max(6, 5): %d\n", max(6, 5));
  printf("sum to 10: %d\n", sum(10));

  int* a = calloc(5, sizeof(int));
  a[0] = 10;
  a[1] = 20;
  a[2] = 30;
  a[3] = 40;
  a[4] = 50;

  printf("sum of a: %d\n", sumarr(a, 5));

  Point* p45 = make_point(4, 5);
  Point* p78 = make_point(7, 8);

  printf("%d\n", isLeftOf(p45, p78));
  printf("%d\n", isLeftOf(p78, p45));

}
