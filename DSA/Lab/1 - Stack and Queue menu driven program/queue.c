#include <stdio.h>
#include <stdlib.h>
#define max 5

int front = -1, rear = -1;
int queue[max];

void enqueue() {
  if (rear==max-1){
    printf("Queue Overflow\n");
    return;
  } else if (front == -1 && rear == -1) {
    front = 0;
    rear = 0;
  } else {
    rear ++;
  }
  int val;
  printf("Enter the value: ");
  scanf("%d", &val);
  queue[rear] = val;
}

void dequeue() {
  if (front == -1 || front == rear) {
    printf("Queue Underflow\n");
  } else {
    int val = queue[front];
    front++;
    printf("The element deleted: %d\n", val);
  }
}

void display() {
  if (front == -1 || front == rear + 1) {
    printf("Queue Underflow\n");
  } else {
    for (int i = 0; i < max; i++) {
      if (i<front || i>rear) {
        printf("NaN ");
      } else {
        printf("%d ", queue[i]);
      }
    }
    printf("\n");
  }
}

int main() {
  int choice;
  int con = 1;

  while (con == 1) {
    printf(" 1.Enqueue()\n 2.Dequeue()\n 3.Display()\n");
    printf("Choose a operation: ");
    scanf("%d", &choice);
    switch (choice) {
    case 1:
      enqueue();
      break;  
    case 2:
      dequeue();
      break;
    case 3:
      display();
      break;
    default:
      printf("Invalid choice");
      break;
    }
    printf("Enter 1 to continue: ");
    scanf("%d", &con);
  }
}