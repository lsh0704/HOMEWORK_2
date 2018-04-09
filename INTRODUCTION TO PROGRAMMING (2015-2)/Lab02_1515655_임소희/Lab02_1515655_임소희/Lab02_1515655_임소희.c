/*#include <stdio.h>


main()
{
int c,nl,nb,nt;

nl=nb=nt=0;
while ((c=getchar()) !=EOF){

if (c=='\n')
++nl;
if (c==' ')
++nb;
else
if (c=='\t'){
++nt;
}
}


printf("#lines=");
printf("%d",nl);
printf(", ");
printf("#blanks=");
printf("%d",nb);
printf(", ");
printf("#tabs=");
printf("%d\n",nt);
}*/


#include <stdio.h>




/*�ܾ��Ǳ���=wordlen

���μ�=nl
�ܾ��=nw
���ڼ�(��������)=nc*/


#define IN    1     /* �ܾ� �� ���� */
#define OUT 0    /* �ܾ� �� ���� */

main()
{
	int c, nl, nw, nc, state, wordlen;

	state = OUT;
	nl = nw = nc = wordlen = 0;
	while ((c = getchar()) != EOF) {
		++nc;
		if (c == '\n')
			++nl;
		if (c == ' ' || c == '\n' || c == '\t')
		{
			state = OUT;

			while (wordlen != 0)
			{
				printf("word length: %d\n", wordlen);
				wordlen = 0;
			}


		}
		else
		{
			++wordlen;

			if (state == OUT)
			{
				state = IN;
				++nw;
			}
		}

	}
	printf("%d %d %d\n", nl, nw, nc);
}