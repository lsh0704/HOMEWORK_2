#include <stdio.h>
/*print celsius-fahrenheit table for celsius=0,20,...,300*/

/*main()
{
	int celsius;
	float fahr;
	int lower, upper, step;

	printf("<실행 결과>\n");
	printf("\n");
	printf("c\tf\n");
	printf("\n");

	lower=0;
	upper=300;
	step=20;

	celsius=lower;
	while (celsius<=upper) {
		fahr=celsius*(9.0/5.0)+32;
		printf("%d\t%.1f\n",celsius,fahr);
		celsius=celsius+step;
	}
}*/



main()
{
	int fahr;
	float celsius;
	int lower, upper, step;

	printf("<실행 결과>\n");
	printf("\n");
	printf("c\tf\n");
	printf("\n");

	lower=0;
	upper=300;
	step=20;

	fahr=lower;
	for (fahr=300;fahr>=lower;fahr=fahr-step) {
		celsius=5.0*(fahr-32)/9.0;
		printf("%3d\t%6.1f\n",fahr,celsius);
	}
}


