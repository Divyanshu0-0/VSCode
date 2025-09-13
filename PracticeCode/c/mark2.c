#include <stdio.h>
#include <time.h>

int main() {
    clock_t start, end;
    double cpu_time_used;

    start = clock();  // Start time

    // Print "hello" 1 million times
    for (long i = 0; i < 1000000; i++) {
        printf("hello ");
    }

    end = clock();  // End time

    cpu_time_used = ((double)(end - start)) / CLOCKS_PER_SEC;

    printf("Execution time: %f seconds\n", cpu_time_used);

    return 0;
}
// This program measures the time taken to print "hello" 1 million times.