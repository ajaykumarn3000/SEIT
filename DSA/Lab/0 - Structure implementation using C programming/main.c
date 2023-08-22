//  Design a structure student_record to contain name, roll_number, and total 
//  marks obtained. Write a program to read 10 students data from the user and then display 
//  the first three toppers on the screen

#include <stdio.h>

struct student_record {
  char name[20];
  int roll_number;
  int total_marks;
};

int main() {
  int len;
  printf("Enter the number of students: ");
  scanf("%d", &len);
  struct student_record record[len];

  for (int i = 0; i < len; i++) {
    printf("Student no: %d\n", i+1);
    printf("Enter student name: ");
    scanf("%s", &record[i].name);
    printf("Enter roll number: ");
    scanf("%d", &record[i].roll_number);
    printf("Enter total marks: ");
    scanf("%d", &record[i].total_marks);
    printf("\n");
  }

  for (int a = 0; a < len-1;a++) {
    for (int b = 0; b < len-1-a; b++) {
      if (record[b].total_marks < record[b+1].total_marks) {
        struct student_record temp = record[b];
        record[b] = record[b+1];
        record[b+1] = temp;
      }
    }
  }

  for (int z = 0; z < 3; z++) {
    printf("Name: %s\nRollno: %d\nMarks: %d\n\n", record[z].name, record[z].roll_number, record[z].total_marks);
  }

  return 0;
}