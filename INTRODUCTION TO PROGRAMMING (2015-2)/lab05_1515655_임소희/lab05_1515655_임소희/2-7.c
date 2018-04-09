#include <stdio.h>
unsigned getbits(unsigned x, int p, int n)
{
	return(x >> (p + 1 - n)) & ~(~0 << n);
}


unsigned invert(unsigned x, int p, int n) 
{
	unsigned y = ~(getbits(x, p, n));
	return setbits(x, p, n, y);
}