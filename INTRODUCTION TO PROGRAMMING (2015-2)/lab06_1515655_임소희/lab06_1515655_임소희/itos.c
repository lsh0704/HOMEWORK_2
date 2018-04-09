#include <stdio.h>
#include <string.h>


void reverse(char s[])
{
	int c, i, j;

	for (i = 0, j = strlen(s) - 1; i < j; i++, j--)
		c = s[i], s[i] = s[j], s[j] = c;
}

void itos(int n, char s[], int b)
{
	int i, sign;

	if ((sign = n) < 0)
		n = -n;
	i = 0;


	do {
		if (n%b < 10)
			s[i++] = n%b + '0';
		else
			s[i++] = n%b - 10 + 'A';
	} while ((n/=b)>0);


	if (sign < 0)
		s[i++] = '-';
	s[i] = '\0';
	reverse(s);
}