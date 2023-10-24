#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>

struct node {
  int info;
  struct node *next;
} *start, *q, *r;

void kill(int n, int k);

void display(int n, int k)
{
  q = start;
  int i = 0;
  while ((q != NULL) && (i <= n))
  {
    if (i != 0)
    {
      printf("-> ");
    }
    i++;
    printf("%d ", q->info);
    q = q->next;
  }
  printf("\n");
  kill(n, k);
}

void kill(int n, int k)
{
  if (n != k)
  {
    q = start;
    for (int j = 0; j < k - 1; j++)
    {
      q = q->next;
    }
    r = q->next;
    q->next = r->next;
    start = r->next;
    free(r);
    display(n - 1, k);
  }
}

void createLinkedList(int n, int k)
{
  int counter = 1;
  while (counter <= n)
  {
    struct node *temp;
    temp = malloc(sizeof(struct node));
    temp->info = counter;
    temp->next = NULL;

    if (start == NULL)
    {
      start = temp;
      counter++;
    }
    else
    {
      q = start;
      while (q->next != NULL)
      {
        q = q->next;
      }
      q->next = temp;
      counter++;
      if (counter > n)
      {
        q = q->next;
        q->next = start;
      }
    }
  }
  display(n, k);
}

int main()
{
  int n, k;
  printf("Enter number of person: ");
  scanf("%d", &n);

  printf("Enter skip length: ");
  scanf("%d", &k);

  createLinkedList(n, k);
  return 0;
}