#include <stdio.h>
#include <ctype.h>
int gethex(int *pn){
	/* gethex:  get next integer from input into *pn */
    int c, sign;
	
    while (isspace(c = getchar()))   /* skip white space */
		;
    if (!isxdigit(c) && c != EOF && c != '+' && c != '-') {
        ungetc(c, stdin);  /* it is not a number */
        return 0;
    }
    sign = (c == '-') ? -1 : 1;
    if (c == '+' || c == '-')
        c = getchar();
    for (*pn = 0; isxdigit(c); c = getchar())
	{
		if (c>='A' && c<='F')
			c=c-'A'+10;
		if (c>='a' && c<='f')
			c=c-'a'+10;
		if (c>='0' && c<='9')
			c=c-'0';
        *pn = 16 * *pn + c;
	}
    *pn *= sign;
    if (c != EOF)
        ungetc(c, stdin);
    return c;
}

