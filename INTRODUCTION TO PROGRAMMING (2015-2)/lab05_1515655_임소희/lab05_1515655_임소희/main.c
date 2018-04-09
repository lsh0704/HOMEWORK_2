#include <stdio.h>
#include "lab05_1515655_¿”º“»Ò.h"

main()
{
	printf("setbits(0X12345678, 7, 8, 0X89ABCDEF) = %X\n", setbits(0X12345678, 7, 8, 0X89ABCDEF));
	printf("setbits(0X12345678, 15, 16, 0X89ABCDEF) = %X\n", setbits(0X12345678, 15, 16, 0X89ABCDEF));
	printf("setbits(0X12345678, 15, 8, 0X89ABCDEF) = %X\n", setbits(0X12345678, 15, 8, 0X89ABCDEF));
	printf("setbits(0X12345678, 9, 10, 0X89ABCDEF) = %X\n", setbits(0X12345678, 9, 10, 0X89ABCDEF));

	printf("\n");

	printf("invert(0X12345678, 7, 8) = %X\n", invert(0X12345678, 7, 8));
	printf("invert(0X12345678, 15, 8) = %X\n", invert(0X12345678, 15, 8));
	printf("invert(0X12345678, 23, 16) = %X\n", invert(0X12345678, 23, 16));

	printf("\n");

	printf("rightrot(0X12345678, 8) = %X\n", rightrot(0X12345678, 8));
	printf("rightrot(0X12345678, 12) = %X\n", rightrot(0X12345678, 12));
	printf("rightrot(0X12345678, 16) = %X\n", rightrot(0X12345678, 16));

	printf("\n");

	printf("bitcount=%d\n", bitcount((unsigned)12));

	printf("\n");

	printf("Now lower Start!!!\n");
	char c[1000];
		
	lower(c);

	return 0;
		
}