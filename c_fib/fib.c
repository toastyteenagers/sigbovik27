#include <stdio.h>
#include <stdlib.h>

int fib (int n) {
    if (n<2) {
        return n;
    }
    return fib(n-1) + fib(n-2);
}

int main(int argc, const char * argv[]) {
    int sequenceLimit = 10;
    if (argc > 1) {
        sequenceLimit = atoi(argv[1]);
    }
    printf("the %dth fibonacci number is %d", sequenceLimit,fib(sequenceLimit));
    return 0;
}

