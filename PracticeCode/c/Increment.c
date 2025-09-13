#include <stdio.h>

void increment() {
    int a = 9;
    int b = 9;

    // PREFIX
    int prefix = ++a;
    printf("Prefix Increment: %d\n", prefix);

    // POSTFIX
    int postfix = b++;
    printf("Postfix Increment: %d\n", postfix);
    printf("Value of b after Postfix Increment: %d\n", b);
}

int main() {
    increment();
    return 0;
}