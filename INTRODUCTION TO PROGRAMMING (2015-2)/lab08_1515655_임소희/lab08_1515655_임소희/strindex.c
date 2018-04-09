#include <stdio.h>

int strindex(char s[], int start, char t[])
{
	int j, k;

	for (; s[start] != '\0'; start++) {
		for (j = start, k = 0; t[k] != '\0' && s[j] == t[k]; j++, k++)
			;
		if (k > 0 && t[k] == '\0')
			return start;
	}
	return -1;

}