#include <stdio.h>
void strncat(char *s, int n, const char *t)
{
	while (*s)
	{
		s++;
		n--;
	}
	for (;  n-1 > 0 && t != '\0'; n--)
		*s++ = *t++;

	*s++ = '\0';

	return s;
}


