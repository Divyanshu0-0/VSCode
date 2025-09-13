#include <stdio.h>
#include <time.h>

int main() {
    clock_t start, end;
    double cpu_time_used;
    
    start = clock();  // Start time

    // Sample computation (Modify this block as needed)
    for (long i = 0; i < 100000000; i++); // Dummy loop for delay

    end = clock();  // End time

    cpu_time_used = ((double)(end - start)) / CLOCKS_PER_SEC;

    printf("Execution time: %f seconds\n", cpu_time_used);

    return 0;
}