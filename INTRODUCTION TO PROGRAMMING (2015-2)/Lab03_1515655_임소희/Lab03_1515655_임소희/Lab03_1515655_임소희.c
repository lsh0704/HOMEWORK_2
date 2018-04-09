//연습문제//

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




//문제1//


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





//문제2//

/*
n=개수
sum=합
avg=평균
std=표준편차
Σ(ai ? avg)² = Σai² - n*avg²
p= Σai²/n
q=avg²
std=루트(p-q)
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


//합과 p = Σai//

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

//평균//

avg = sum / n;




//q=avg²//
q = avg*avg;


std = sqrt(p-q);


printf("평균 : %.2lf\n", avg);
printf("표준편차 : %.3lf\n", std);

}*/


//문제3번//


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


