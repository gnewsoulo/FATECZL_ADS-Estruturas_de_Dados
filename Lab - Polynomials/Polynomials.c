#include <stdio.h>
#include <stdlib.h>

typedef struct node node;
typedef node *polynomial;
typedef node *position;

struct node {
float coef;
int degree;
node *next;
};

int main()
{
    FILE *entry;
    char filename[15] = "Entry.txt";
    char ch;

    entry = fopen(filename, "r");
    if (entry == NULL)
    {
        printf("Failed at opening file \n");
        exit(0);
    }

    ch = fgetc(entry);
    int n_ops;
    sscanf(&ch, "%d", &n_ops);
    printf("%d \n", n_ops);

    char ops[n_ops];


//    for (int i = 0; i < n_ops; i++)
//    {
        ch = fgetc(entry);
        ch = fgetc(entry);
        ops[0] = fgetc(entry);
        printf("%c \n", ops[0]);
        if (ops[0] == 'V'){
            ch = fgetc(entry);
            ch = fgetc(entry);
            printf("%c \n", ch);
        } else if (ops[0] == 'S'){
            ch = fgetc(entry);
        } else {
            printf("Invalid operation: %c", ops[0]);
            exit(0);
        }
 //   }
}
