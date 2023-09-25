#include <stdio.h>

void selectionSort(int A[], int len) {
  for (int i = 0; i < len - 1; i++) {
    int smallest = i;
    for (int j = i + 1; j < len; j++) {
      if (A[smallest] > A[j]) {
        smallest = j;
      }
    }
    int temp = A[smallest];
    A[smallest] = A[i];
    A[i] = temp;
  }
}

void merge(int arr[], int beg, int mid, int end) {
  for (int i = beg; i <= end; i++) {
    printf("%d ", arr[i]);
  }

  int a = beg, b = mid + 1;
  int temp_arr[end - beg + 1];
  for (int i = 0; i < end - beg + 1; i++) {
    if (a > mid && b > end) {
      break;
    } else if (b > end) {
      temp_arr[i] = arr[a];
      a++;
    } else if (a > mid) {
      temp_arr[i] = arr[b];
      b++;
    } else if (arr[a] > arr[b]) {
      temp_arr[i] = arr[b];
      b++;
    } else {
      temp_arr[i] = arr[a];
      a++;
    }
  }

  printf("\nAfter sort: ");
  for (int i = 0; i < end - beg + 1; i++) {
    printf("%d ", temp_arr[i]);
    arr[beg + i] = temp_arr[i];
  }
  printf("\n\n");
}

void mergeSort(int arr[], int beg, int end) {
  if (beg < end) {
    int mid = (beg + end) / 2;
    mergeSort(arr, beg, mid);
    mergeSort(arr, mid + 1, end);
    merge(arr, beg, mid, end);
  }
}

int main() {
  int n, choice;
  printf("Enter the number of elements in the array: ");
  scanf("%d", &n);

  int arr[n];

  do {
    printf("\nMenu:\n1. Enter values in array\n2. Sort using selection sort\n3. Sort using merge sort\n4. Display array\n5. Exit\nEnter your choice: ");
    scanf("%d", &choice);

    switch (choice) {
    case 1:
      printf("Enter %d elements:\n", n);
      for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
      }
      break;

    case 2:
      selectionSort(arr, n);
      printf("Array sorted using Selection Sort.\n");
      break;

    case 3:
      mergeSort(arr, 0, n - 1);
      printf("Array sorted using Merge Sort.\n");
      break;

    case 4:
      printf("Array elements: ");
      for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
      }
      printf("\n");
      break;

    case 5:
      printf("Exiting the program.\n");
      break;

    default:
      printf("Invalid choice! Please enter a valid option.\n");
      break;
    }
  } while (choice != 5);
  return 0;
}