#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>
#include "lab11_1515655_임소희.h"


//과제1


int main(int argc, char *argv[]) 
{
	double(*func)(double);
	double start, end;
	int num;

	if (argc < 4)
	{
		printf("usage: integ sin/cos/tan lower-limit upper-limit [no-of-steps]");
		return 0;
	}


	if (strcmp(argv[1], "sin") == 0)
		func = sin;
	else if (strcmp(argv[1], "cos") == 0)
		func = cos;
	else if (strcmp(argv[1], "tan") == 0)
		func = tan;

	else
	{
		printf("unrecognized trigonometric function name: %s", argv[1]);
		return 0;
	}
	start = strtod(argv[2], NULL);//문자열->실수로 변환
	end = strtod(argv[3], NULL);


	if (argc > 4)
		num = strtol(argv[4], NULL, 10);//문자열->long형 수로 변환
		
	else 
		num = 100;

	printf("int_%lg^%lg %s(x) = %.3g with %d parts", start, end, argv[1], integ(func, start, end, num), num);

}



//과제2

/*
1) arraysize는 최대 99999의 값을 가진다.
이 때, 출력되는 arraytest()는 2147444236으로
arraysize가 36152일때부터 위와 동일한 값이 나온다.*/

//2)
/*
#include <stdio.h>
#include <stdlib.h>

#define  ARRAYSIZE   99999

int arraytest()
{
int a[3][ARRAYSIZE], i,j, max;

for (i = 0; i < 3; i++)
{
for (j = 0; j < ARRAYSIZE; j++)
{
if (a[i][j] <= 2147444236)//a[i][j]가 overflow 아닐 때까지(최대값인 경우까지)
a[i][j] = (rand() << 16) + rand();
else
break;
}
}
for (i = 0; i < 3; i++)
{
for (max = a[0][0], j = 1; j < ARRAYSIZE; j++)
(a[i][j] > max) ? (max = a[i][j]) : 0;
}
return max;

}

main()
{
printf("The maximum number is %d\n", arraytest());
}


*/


