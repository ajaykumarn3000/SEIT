#include <stdio.h>
#include <stdlib.h>
#define max 5
int top = -1;
int stack[max];

void push() {
    if (top == max-1){
        printf("Error: Stack Overflow\n");
    } else {
        int val;
        printf("Enter the value: ");
        scanf("%d", &val);
        top++;
        stack[top] = val;
    }
}
void pop(){
    if (top == -1) {
        printf("Error: Stack Underflow\n");
    } else {
        printf("The element deleted: %d\n", stack[top]);
        top--;
    }
}
void peek() {
    if (top==-1){
        printf("Error: Stack Underflow\n");
    }
    else {
        printf("The current top value: %d\n", stack[top]);
    }
}
void display() {
    if (top == -1) {
        printf("Error: Stack Underflow\n");
    } else {
        for (int i = top; i >= 0; i--){
            printf("%d ", stack[i]);
        }
        printf("\n");
    }
}

int main()
{
    int choice;
    int con=1;


    while(con == 1){
    printf("\n 1.Push\n 2.Pop\n 3.Peak\n 4.Display\n");
    printf("Choose a operation: ");
    scanf("%d", &choice);
    printf("\n");
        switch (choice) {
            case 1:
                push();
                break;
            case 2:
                pop();
                break;
            case 3:
                peek();
                break;
            case 4:
                display();
                break;
            default:
                printf("Invalid Operation\n");
                break;
        }
        printf("\nEnter 1 to continue: ");
        scanf("%d", &con);
        printf("\n"); 
    }
}