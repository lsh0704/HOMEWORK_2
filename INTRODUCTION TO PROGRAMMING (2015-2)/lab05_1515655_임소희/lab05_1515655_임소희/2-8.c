#include <stdio.h>

unsigned rightrot(unsigned x, int n)
{
	return (((~(~0 << n)&x) << (32 - n)) | (x >> n));
}
