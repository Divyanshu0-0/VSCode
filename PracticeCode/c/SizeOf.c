#include <stdio.h>

int main () {
int num ;
float pi;
char letter;

printf(" size of int: %zu bytes\n", sizeof (num));
printf(" size of float: %zu bytes\n", sizeof (pi));
printf(" size of char: %zu bytes\n", sizeof (letter));
printf(" size of int type: %zu bytes\n", sizeof (int));
printf(" size of float int: %zu bytes\n", sizeof (float));
printf(" size of char int: %zu bytes\n", sizeof (char));

return 0;
}