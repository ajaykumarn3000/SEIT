#include <stdio.h>
#define len 9

void main()
{
  int A[len] = {55, 62, 14, 52, 43, 61, 99, 98, 37};

  printf("Unsorted Array: ");
  for (int i = 0; i < len; i++)
  {
    printf("%d ", A[i]);
  }
  printf("\n\n");

  for (int i = 0; i < len - 1; i++)
  {
    int smallest = i;
    for (int j = i + 1; j < len; j++)
    {
      if (A[smallest] > A[j])
      {
        smallest = j;
      }

      int temp = A[smallest];
      A[smallest] = A[i];
      A[i] = temp;
    }   
  }

  printf("Final Sorted Array: ");
  for (int i = 0; i < len; i++)
  {
    printf("%d ", A[i]);
  }
}