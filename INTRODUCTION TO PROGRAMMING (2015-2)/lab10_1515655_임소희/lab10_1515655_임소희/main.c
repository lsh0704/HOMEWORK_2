#include <stdio.h>
#include <ctype.h>
#include "lab10.h"

#define SIZE 100

main(){
	int array[SIZE], n;
    int i, sum;
	char s[20] = "";

    for (n = 0; n < SIZE && gethex(&array[n]) != EOF; n++)
        ;
    sum = 0;
    for (i = 0; i < n; i++)
        sum += array[i];
    printf("The sum is %d\n", sum);


	strncat(s, 20, "Abcdefg");
    strncat(s, 20, "Abcdefg");
	strncat(s, 20, "Abcdefg");
    printf("s[] = %s\n", s);

}