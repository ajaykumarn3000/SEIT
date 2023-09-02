#include <stdio.h>
#include <malloc.h>

void main() {
    int n;
    
    printf("Enter the number of nodes: ");
    scanf("%d", &n);

    int arr[n][n];

    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            printf("%d x %d: ", i+1, j+1);
            scanf("%d", &arr[i][j]);
        }
    }

    for(int i = 0; i<n; i++){
        for(int j = 0; j<n; j++){
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }

    for(int i = 0; i < n; i++)
    {
        printf("%d ", i+1);
        int flag = 0;
        for(int j = 0; j < n; j++) {
            if (arr[i][j] != 0) {
                printf("-> %d", j+1);
                flag = 1;
            }
        }
        if (flag == 0) {
            printf("-> X");
        }
        printf("\n");
    }
}   
