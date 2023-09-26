#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#define max 20
int top = -1;
char stack[max];

void push(char a)
{
  if (top == max - 1)
  {
    printf("Error: Stack Overflow\n");
  }
  else
  {
    top++;
    stack[top] = a;
  }
}
char pop()
{
  if (top == -1)
  {
    printf("Error: Stack Underflow\n");
  }
  else
  {
    printf("The element deleted: %c\n", stack[top]);
    char a = stack[top];
    top--;
    return a;
  }
}
void peek()
{
  if (top == -1)
  {
    printf("Error: Stack Underflow\n");
  }
  else
  {
    printf("The current top value: %\n", stack[top]);
  }
}
void display()
{
  if (top == -1)
  {
    printf("Error: Stack Underflow\n");
  }
  else
  {
    for (int i = top; i >= 0; i--)
    {
      printf("%d ", stack[i]);
    }
    printf("\n");
  }
}

int main()
{
  int length =10;
  char expression[length];
  printf("Enter a expression: ");
  scanf("%s", expression);

  

  for (int i = 0; i<length ; i++) {
    if (expression[i] == '\0') {
      break;
    }
    char c = expression[i];
    if (isalpha(c) != 0) { 
      printf("%c ", c);
    } else if (c == '(') {
      push(c);
    } else if (c == ')') {
      
    }
  }
}
