#include <stdio.h>
#include <time.h>

int main() {
    clock_t start, end;
    double cpu_time_used;

    start = clock();

    for (long long i = 1; i <= 100000LL; i++) {
        printf("%lld\n", i);
    }

    end = clock();
    cpu_time_used = ((double) (end - start)) / CLOCKS_PER_SEC;

    printf("Time taken: %.2f seconds  ", cpu_time_used);

    return 0;
}