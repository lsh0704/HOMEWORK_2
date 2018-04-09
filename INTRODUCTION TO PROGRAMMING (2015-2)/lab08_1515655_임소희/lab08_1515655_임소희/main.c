#include <stdio.h>
#include "calc.h"
#include <stdlib.h>
#define MAXVAL 100   /* maximum depth of val stack */
#define MAXOP 100
#define NUMBER '0'


char source[] = "We then handed the hat and the coat to the fat man";

main()
{
	double d=1;
	int found = 0;
	int index = -1;
	int type;
	double op2, op1;
	char s[MAXOP];
	int sp = 0;  /* next free stack position */
	double val[MAXVAL];   /* value stack */


	found = 0;
	while ((index = strindex(source, index + 1, "the")) >= 0)
		found++;
	printf("The number of occurrences of the pattern \"the\": %d\n", found);

	found = 0;
	index = 100; /* start position exceeds the actual string */
	while ((index = strindex(source, index + 1, "the")) >= 0)
		found++;
	printf("The number of occurrences of the pattern \"the\": %d\n", found);

	found = 0; /* Note that, at this point, index = -1 from the previous */
	while ((index = strindex(source, index + 1, "at")) >= 0)
		found++;
	printf("The number of occurrences of the pattern \"at\": %d\n", found);

	found = 0;
	while ((index = strindex(source, index + 1, "and")) >= 0)
		found++;
	printf("The number of occurrences of the pattern \"and\": %d\n", found);

	found = 0;
	while ((index = strindex(source, index + 1, "ould")) >= 0)
		found++;
	printf("The number of occurrences of the pattern \"ould\": %d\n", found);


	printf("\nThis is calculation\n");





	while ((type = getop(s)) != EOF) {
		switch (type) {
		case NUMBER:
			push(atof(s));
			break;

		case '+':
			push(pop() + pop());
			break;

		case '*':
			push(pop() * pop());
			break;

		case '-':
			op2 = pop();
			push(pop() - op2);
			break;

		case '/':
			op2 = pop();
			if (op2 != 0.0)
				push(pop() / op2);
			else
				printf("error: zero divisor\n");
			break;

		case '^':
			op2 = pop();
			op1 = pop();
			for (; op2 != 0; op2--)
				d = op1*d;
			push(d);
			break;


		case '\n':
			printf("\t%.8g\n", pop());
			break;
		default:
			printf("error: unknown command %s\n", s);
			break;
		}
	}
	return 0;
}