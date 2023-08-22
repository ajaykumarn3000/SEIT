#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>

struct node
{
  int info;
  struct node *next;
} *start, *q, *r;

void insertatend(int value)
{
  struct node *temp;
  temp = malloc(sizeof(struct node));
  temp->info = value;
  temp->next = NULL;

  if (start == NULL)
  {
    printf("List Empty\n");
    start = temp;
  }
  else
  {
    q = start;
    while (q->next != NULL)
    {
      q = q->next;
    }
    q->next = temp;
  }
}
void displaylist()
{
  q = start;
  if (start == NULL)
  {
    printf("Empty List");
  }
  else
  {
    while (q != NULL)
    {
      printf("%d ", q->info);
      q = q->next;
    }
    printf("\n");
  }
}
void insertatstart(int value)
{
  struct node *temp;
  temp = malloc(sizeof(struct node));
  temp->info = value;
  temp->next = NULL;
  if (start == NULL)
  {
    printf("List Empty\n");
    start = temp;
  }
  else
  {
    temp->next = start;
    start = temp;
  }
}
void deleteatstart()
{
  if (start == NULL)
  {
    printf("The list is empty");
  }
  else
  {
    q = start;
    start = start->next;
  }
}
void deletatend()
{
  if (start == NULL)
  {
    printf("The list is empty");
  }
  else
  {
    q = start;
    while (q->next != NULL)
    {
      r = q;
      q = q->next;
    }
    r->next = NULL;
    free(q);
  }
}
void insertbeforenode(int search, int value)
{
  struct node *temp;
  temp = malloc(sizeof(struct node));
  temp->info = value;
  temp->next = NULL;
  if (start == NULL)
  {
    printf("The list is empty");
    start = temp;
  }
  else
  {
    q = start;
    while (q->info != search)
    {
      r = q;
      q = q->next;
    }
    temp->next = q;
    r->next = temp;
  }
}
void insertafternode(int search, int value)
{
  struct node *temp;
  temp = malloc(sizeof(struct node));
  temp->info = value;
  temp->next = NULL;
  if (start == NULL)
  {
    printf("The list is empty");
    start = temp;
  }
  else
  {
    q = start;
    while (q->info != search)
    {
      q = q->next;
    }
  }
}

int main()
{
  start = NULL;
  int on = 1;
  int choice;
  int data;
  int a;
  while (on == 1)
  {
    printf("Choose a Operation:\n1.Insert at End\n2.Display all nodes\n3.Insert at the Start\n4.Delete at start.\n5.Delete at end\n6.Insert after node\n7.Insert before node\n");
    scanf("%d", &choice);
    switch (choice)
    {
    case 1:
      printf("Enter the value: ");
      scanf("%d", &data);
      insertatend(data);
      break;
    case 2:
      displaylist();
      break;
    case 3:
      printf("Enter the value: ");
      scanf("%d", &data);
      insertatstart(data);
      break;
    case 4:
      deleteatstart();
      break;
    case 5:
      deletatend();
      break;
    case 6:
      printf("Enter the search value and node value: ");
      scanf("%d %d", &a, &data);
      insertafternode(a, data);
      break;
    case 7:
      printf("Enter the search value and node value: ");
      scanf("%d %d", &a, &data);
      insertbeforenode(a, data);
      break;
    default:
      printf("Error 404: Operation not found\n");
      break;
    }
    printf("Enter 1 to continue: ");
    scanf("%d", &on);
  }
}