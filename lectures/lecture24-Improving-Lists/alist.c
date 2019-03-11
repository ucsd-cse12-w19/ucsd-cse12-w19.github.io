#include <stdio.h>
#include <stdlib.h>

typedef struct CAList {
  int size, start, capacity;
  int* contents;
} CAList;

CAList* make_alist(int start_capacity) {
  CAList* alist = calloc(1, sizeof(CAList));
  alist->size = 0;
  alist->start = 0;
  alist->capacity = start_capacity;
  alist->contents = calloc(start_capacity, sizeof(int));
  return alist;
}

int indexFor(CAList* alist, int index) {
  int ans = (alist->start + index) % alist->capacity;
  return ans;
}

int get(CAList* alist, int index) {
  // ASSUME index is in bounds
  int toLookup = indexFor(alist, index);
  return alist->contents[toLookup];
}

void expandCapacity(CAList* alist) {
  int* old_contents = alist->contents;
  int new_capacity = alist->capacity * 2;
  int* new_contents = calloc(new_capacity, sizeof(int));
  for(int i = 0; i < alist->size; i += 1) {
    new_contents[i] = old_contents[indexFor(alist, i)];
  }
  alist->contents = new_contents;
  free(old_contents);
  alist->capacity = new_capacity;
  alist->start = 0;
}

void prepend(CAList* alist, int value) {
  if(alist->size >= alist->capacity) { expandCapacity(alist); }
  alist->size += 1;
  alist->start = alist->start - 1;
  if(alist->start == -1) { alist->start = alist->capacity - 1; }
  alist->contents[alist->start] = value;
}

void add(CAList* alist, int value) {
  if(alist->size >= alist->capacity) { expandCapacity(alist); }
  alist->contents[indexFor(alist, alist->size)] = value;
  alist->size += 1;
}

void shiftUp(CAList* alist, int target) {
  int i;
  for(i = target - 1; i > 0; i -= 1) {
    alist->contents[indexFor(alist, i + 1)] =  alist->contents[indexFor(alist, i)];
  }
}

void shiftDown(CAList* alist, int target) {
  int i;
  for(i = target; i < alist->size; i += 1) {
    alist->contents[indexFor(alist, i)] =  alist->contents[indexFor(alist, i + 1)];
  }
}

void removeAt(CAList* alist, int index) {
  if(index > (alist->size / 2)) {
    shiftDown(alist, index);
  }
  else {
    shiftUp(alist, index);
    alist->start = indexFor(alist, 1);
  }
  alist->size -= 1;
  return;
}

void print_alist(CAList* calist) {
  for(int i = 0; i < calist->capacity; i += 1) {
    printf("%d ", calist->contents[i]);
  }
  printf("\n");
}

int main(int argc, char** args) {
  CAList* a = make_alist(2);
  print_alist(a);
  prepend(a, 30);
  print_alist(a);
  add(a, 40);
  print_alist(a);
  prepend(a, 20);
  print_alist(a);
  add(a, 70);
  print_alist(a);
  removeAt(a, 0);
  print_alist(a);
  prepend(a, 90);
  print_alist(a);
  removeAt(a, 3);
  add(a, 100);
  add(a, 110);
  prepend(a, 250);
  print_alist(a);

  return 0;
}

