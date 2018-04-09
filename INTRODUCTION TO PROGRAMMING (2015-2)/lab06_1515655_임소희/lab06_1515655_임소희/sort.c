#include <stdio.h>
#include <stdlib.h>

#define ARRAYSIZE 10000


int isort(int v[], int n) /* insertion sort */
{
	int i, j, temp, count;
	count = 0;
	for (i = 1; i<n; i++)
	{
		for (j = i - 1; j >= 0 && v[j] > v[j + 1]; j--)
		{
			temp = v[j], v[j] = v[j + 1], v[j + 1] = temp;
			count++;
		}
	}
	return count;
}


int shellsort(int v[], int n)/* Shell sort */
{
	int gap, i, j, temp, count;
	count = 0;
	for (gap = n / 2; gap >0; gap /= 2)
	{
		for (i = gap; i<n; i++)
		{
			for (j = i - gap; j >= 0 && v[j] > v[j + gap]; j -= gap)
			{
				temp = v[j], v[j] = v[j + gap], v[j + gap] = temp;
				count++;
			}
		}
	}
	return count;
}

void copyarray(int a[], int b[], int n) /* copy n elements of array b[] to a[] */
{
	int i;
	for (i = 0; i<n; i++)
		a[i] = b[i];

}
void printarray(int a[], int n)/* print n elements of array a[] */
{
	int i;
	for (i = 0; i<n; i++)

		printf("%d ", a[i]);
}