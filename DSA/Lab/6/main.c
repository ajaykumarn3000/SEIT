#include <stdio.h>

void merge(int A[], int beg, int mid, int end)
{
  int temp[end + 1];
  int i = beg, j = mid + 1, index = beg;
  while (i <= mid && j <= end)
  {
    if (A[i] < A[j])
    {
      temp[index] = A[i];
      i = i + 1;
    }
    else
    {
      temp[index] = A[j];
      j = j + 1;
    }
    index = index + 1;
  }
  if (i > mid)
  {
    while (j <= end)
    {
      temp[index];
      index = index + 1;
      j = j + 1;
    }
  }
  else
  {
    while (i <= mid)
    {
      temp[index] = A[i];
      index = index + 1;
      i = i + 1;
    }
  }
  int k = 0;
  while (k < index)
  {
    A[k] = temp[k];
    k = k + 1;
  }
}

void mergesort(int A[], int beg, int end)
{
  if (beg < end)
  {
    int mid = (beg + end) / 2;
    mergesort(A, beg, mid);
    mergesort(A, mid + 1, end);
    merge(A, beg, mid, end);
    for (int i = 0; i < end + 1; i++)
    {
      printf("%d ", A[i]);
    }
    printf("\n");
  }
}
void main()
{
  int n = 6;
  int A[] = {31, 21, 34, 12, 56, 96};

  int B[] = {};
  int beg = 0, end = n - 1;

  mergesort(A, beg, end);
  for (int i = 0; i < n; i++)
  {
    printf("%d ", A[i]);
  }
  printf("\n");
}
