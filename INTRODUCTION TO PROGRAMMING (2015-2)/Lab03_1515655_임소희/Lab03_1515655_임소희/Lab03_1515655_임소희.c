//��������//

/*#include <stdio.h>

/* print Fahrenheit-Celsius table
for fahr = 0, 20, ..., 300,
floating-point version */

/*
int f(int a)
{
float fahr, celsius;
int     lower, upper, step;

lower = 0;
upper = 300;
step = 20;

fahr = lower;
while (fahr <= upper) {
celsius = (5.0 / 9.0) * (fahr - 32);
printf("%3.0f %6.1f\n", fahr, celsius);
fahr = fahr + step;
}
}
main()
{
int b=0;
int result;

result=f(b);
}




//����1//


#include <stdio.h>

main()
{
int num, max;
max = 0;

while (scanf_s("%d", &num) != EOF)
{
if (num >= max)
max = num;
}
printf("max : %d\n", max);
}





//����2//

/*
n=����
sum=��
avg=���
std=ǥ������
��(ai ? avg)�� = ��ai�� - n*avg��
p= ��ai��/n
q=avg��
std=��Ʈ(p-q)
*/

/*
#include <stdio.h>
#include <math.h>

main()
{
double a;
int i, n;
double sum, avg, std;
double p, q;


//�հ� p = ��ai//

sum = 0;
n = 0;
p = 0;

while ((scanf_s("%lf", &a)) != EOF)
{
sum = a + sum;
p = a*a + p;
++n;

}

p = p / n;

//���//

avg = sum / n;




//q=avg��//
q = avg*avg;


std = sqrt(p-q);


printf("��� : %.2lf\n", avg);
printf("ǥ������ : %.3lf\n", std);

}*/


//����3��//


#include <stdio.h>

main()
{
	int prime[1000], i, j;
	int count = 0;

	for (i = 1; i < 1000; i++)
	{
		prime[i] = 1;
	}
	for (i = 3; i < 1000; i++)
	{
		for (j = 2; j < i; j++)
		{
			if ((i % j) == 0)
			{
				prime[i] = 0;
			}
		}
	}


	for (i = 2; i < 1000; i++)
	{
		if (prime[i] == 1)
		{
			count++;
			printf("%4d", i);
		}
		if (count == 15)
		{
			printf("\n");
			count = 0;
		}
	}
}


