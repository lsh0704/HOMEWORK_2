#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>
#include "lab11_1515655_�Ӽ���.h"


//����1


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
	start = strtod(argv[2], NULL);//���ڿ�->�Ǽ��� ��ȯ
	end = strtod(argv[3], NULL);


	if (argc > 4)
		num = strtol(argv[4], NULL, 10);//���ڿ�->long�� ���� ��ȯ
		
	else 
		num = 100;

	printf("int_%lg^%lg %s(x) = %.3g with %d parts", start, end, argv[1], integ(func, start, end, num), num);

}



//����2

/*
1) arraysize�� �ִ� 99999�� ���� ������.
�� ��, ��µǴ� arraytest()�� 2147444236����
arraysize�� 36152�϶����� ���� ������ ���� ���´�.*/

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
if (a[i][j] <= 2147444236)//a[i][j]�� overflow �ƴ� ������(�ִ밪�� ������)
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


