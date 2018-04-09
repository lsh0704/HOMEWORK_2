#include <stdio.h>
#include <stdlib.h>
#include "lab06_1515655_¿”º“»Ò.h"

#define ARRAYSIZE 10000

main()
{
	int numbers[ARRAYSIZE], data[ARRAYSIZE];
	int i, n, count;


	void itos(int, char[], int);
	char buffer[100];


	/* Generate 10,000 random numbers */
	for (i = 0; i < ARRAYSIZE; i++)
		numbers[i] = rand();
	printf("Before sort (the first 8 numbers) : ");
	printarray(numbers, 8);
	printf("\n");

	for (n = 10; n <= ARRAYSIZE; n *= 10) {
		/* Insertion Sort */
		copyarray(data, numbers, n);
		count = isort(data, n);
		printf("After insertion sort (the first 5 numbers) : ");
		printarray(data, 5);
		printf("\n");
		printf("The number of numbers swaps in insertion sort : %d\n\n", count);

		/* Shell Sort */
		copyarray(data, numbers, n);
		count = shellsort(data, n);
		printf("After Shell sort (the first 5 numbers) : ");
		printarray(data, 5);
		printf("\n");
		printf("The number of numbers swaps in Shell sort : %d\n\n", count);
	}

	printf("\n\n");


	itos(255, buffer, 2);
	printf("itos(255, buffer, 2) : %s\n", buffer);
	itos(100000000, buffer, 2);
	printf("itos(100000000, buffer, 2) : %s\n", buffer);
	itos(100000000, buffer, 4);
	printf("itos(100000000, buffer, 4) : %s\n", buffer);
	itos(100000000, buffer, 8);
	printf("itos(100000000, buffer, 8) : %s\n", buffer);
	itos(100000000, buffer, 16);
	printf("itos(100000000, buffer, 16) : %s\n", buffer);
	itos(100000000, buffer, 20);
	printf("itos(100000000, buffer, 20) : %s\n", buffer);
}
