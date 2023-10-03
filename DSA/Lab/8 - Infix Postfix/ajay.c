#include <stdio.h>

int main () {
  int l[12] = {98, 20, 94, 27, 67, 99, 41, 0, 4, 17, 2, 15};
  for (int i = 0; i<12;i++) {
    printf("Step %d: %d % 12 = %d\n", i+1, l[i], l[i]%12);
  }
}