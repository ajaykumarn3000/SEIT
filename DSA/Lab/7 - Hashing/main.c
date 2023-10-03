// Write a C program to construct hash table using hashing and collision resolution  techniques.

#include <stdio.h>
#define len 4

void insert(int Arr[], int data) {
  int k = data % len;
  while (1) {
    if (Arr[k] == -1) {
      Arr[k] = data;
      return;
    } else {
      printf("A wild collision has appeared.\n");
      k++;
      if (k >= len) {
        k = 0;
      }
    }
  }
}
void display(int Arr[]) {
  for (int i = 0; i < len; i++) {
    printf("%d | %d\n", i, Arr[i]);
  }
}

int main() {
  int choice, value, on = 1, A[len];

  for (int i = 0; i < len; i++) {
    A[i] = -1;
  }
  do {
    printf("1. Insert\n2. Display\nChoose a operation: ");
    scanf("%d", &choice);
    switch (choice) {
    case 1: {
      int place = 0;
      for (int i = 0; i < len; i++) {
        if (A[i] == -1) {
          place = 1;
          break;
        }
      }
      if (place == 1) {
        printf("Enter data: ");
        scanf("%d", &value);
        insert(A, value);
      } else {
        printf("The Hash table is full\n");
      }
      break;
    }
    case 2: {
      display(A);
      break;
    }
    default:
      break;
      printf("Enter 1 to continue: ");
      scanf("%d", &on);
    }
  } while (on == 1);
}
