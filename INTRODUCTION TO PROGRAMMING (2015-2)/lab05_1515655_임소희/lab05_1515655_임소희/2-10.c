#include <stdio.h>

int lower(char c[])
{
	c[1000];
	int i;

	for (i = 0; c[i] != EOF; i++)
	{
		scanf_s("%c", &c[i]);
		printf("%c", (c[i] >= 'A' && c[i] <= 'Z') ? (c[i] - 'A' + 'a') : c[i]);
	}
	return 0;
}
