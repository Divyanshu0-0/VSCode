#include <stdio.h>
#include <time.h>

int main() {
    clock_t start, end;  // Variables to store time
    double cpu_time_used;

    start = clock();  // Start time

    // Counting loop
    for (long long i = 0; i <= 100000000000; i++);  // Count to 100 Billion

    end = clock();  // End time

    // Calculate execution time
    cpu_time_used = ((double)(end - start)) / CLOCKS_PER_SEC;

    printf("Counting completed!\n");
    printf("Execution time: %f seconds\n", cpu_time_used);

    return 0;
}