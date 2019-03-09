#include <stdio.h>
#include <stdlib.h>

typedef struct AList {
  int* contents;
  int size;
  int capacity;
} AList;

AList* make_alist(int start_capacity) {
  AList* alist = calloc(1, sizeof(AList));
  int* contents = calloc(start_capacity, sizeof(int));
  alist->contents = contents;
  alist->size = 0;
  alist->capacity = start_capacity;
  return alist;
}

void expandCapacity(AList* alist) {
  int* oldcontents = alist->contents;
  int* newarr = calloc(alist->capacity * 2, sizeof(int));
  int i = 0;
  for(i = 0; i < alist->size; i += 1) {
    newarr[i] = alist->contents[i];
  }

  alist->capacity = alist->capacity * 2;

  /*
   KEY MOMENT: We are about to lose all references to the
   contents array by overwriting it with the new pointer.
   We should free it (because we will no longer use it).
   Note that we save the pointer in a temporary so that we
   can use it after overwriting the field.
  */
  alist->contents = newarr;
  free(oldcontents);

}

void add(AList* alist, int element) {
  if(alist->size >= alist->capacity) { expandCapacity(alist); }
  alist->contents[alist->size] = element;
  alist->size += 1;
}

int get(AList* alist, int index) {

  /*
   A note on errors in C - there is no notion of try/catch.
   Here we take a pretty aggressive approach and just print
   an error and quit the program. Another option would be
   to return either an error value or a number, which would
   require another kind of struct.
  */

  if(index >= alist->size || index < 0) {
    printf("Error, index out of bounds %d\n", index);
    exit(1);
  }
  return alist->contents[index];
}

void print_alist(AList* alist) {
  int i;
  printf("size: %d, capacity: %d, contents: ", alist->size, alist->capacity);
  for(i = 0; i < alist->size; i += 1) {
    printf("%d, ", get(alist, i));
  }
  printf("\n");
}

void cleanup_alist(AList* alist) {

  /*
   Note that if we just free(alist), then we'd lose the
   reference to contents and never be able to free that
   array. This is an example of a time where a function
   that cleans up a structure is useful
  */

  free(alist->contents);
  free(alist);

  /*
   Note also that we don't free the individual integers for
   size and capacity. The free(alist) call gives that space
   back, and we only need to use free() on pointers that we
   previously allocated.
  */

}


int main(int argc, char** args) {
  int i;
  AList* a = make_alist(13);
  add(a, 5);
  add(a, 3);
  add(a, 1);
  print_alist(a);
  for(i = -10; i < 20; i += 1) {
    add(a, i);
  }
  print_alist(a);
  cleanup_alist(a);
  return 0;
}



