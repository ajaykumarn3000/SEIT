#include <stdio.h>
#include <stdlib.h>

// Structure for a singly linked list node
struct Node
{
  int data;
  struct Node *next;
};

// Structure for the stack
struct Stack
{
  struct Node *top;
};

// Structure for the queue
struct Queue
{
  struct Node *front;
  struct Node *rear;
};

// Function to create a new node
struct Node *createNode(int data)
{
  struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
  if (newNode == NULL)
  {
    printf("Memory allocation failed!\n");
    exit(1);
  }
  newNode->data = data;
  newNode->next = NULL;
  return newNode;
}

// Stack functions
void push(struct Stack *stack, int data)
{
  struct Node *newNode = createNode(data);
  newNode->next = stack->top;
  stack->top = newNode;
}

int pop(struct Stack *stack)
{
  if (stack->top == NULL)
  {
    printf("Stack is empty!\n");
    exit(1);
  }
  int data = stack->top->data;
  struct Node *temp = stack->top;
  stack->top = stack->top->next;
  free(temp);
  return data;
}

// Queue functions
void enqueue(struct Queue *queue, int data)
{
  struct Node *newNode = createNode(data);
  if (queue->rear == NULL)
  {
    queue->front = newNode;
    queue->rear = newNode;
  }
  else
  {
    queue->rear->next = newNode;
    queue->rear = newNode;
  }
}

int dequeue(struct Queue *queue)
{
  if (queue->front == NULL)
  {
    printf("Queue is empty!\n");
    exit(1);
  }
  int data = queue->front->data;
  struct Node *temp = queue->front;
  queue->front = queue->front->next;
  if (queue->front == NULL)
  {
    queue->rear = NULL;
  }
  free(temp);
  return data;
}

int main()
{
  // Create a stack
  struct Stack stack;
  stack.top = NULL;

  // Push elements onto the stack
  push(&stack, 10);
  push(&stack, 20);
  push(&stack, 30);

  // Pop and print elements from the stack
  printf("Stack elements: %d, %d, %d\n", pop(&stack), pop(&stack), pop(&stack));

  // Create a queue
  struct Queue queue;
  queue.front = NULL;
  queue.rear = NULL;

  // Enqueue elements into the queue
  enqueue(&queue, 10);
  enqueue(&queue, 20);
  enqueue(&queue, 30);

  // Dequeue and print elements from the queue
  printf("Queue elements: %d, %d, %d\n", dequeue(&queue), dequeue(&queue), dequeue(&queue));

  return 0;
}
