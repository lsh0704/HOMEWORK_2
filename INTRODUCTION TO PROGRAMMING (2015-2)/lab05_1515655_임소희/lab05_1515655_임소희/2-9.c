/*
int bitcount(unsigned x)
count 1 bits in x //
{
int b;

for (b = 0; x != 0; x >>= 1)
if (x & 01)
b++;
return b;
}

x &= (x-1) deletes the rightmost 1-bit in x. Explain why.
'&='연산자는 x=x&(x-1)을 간단히 표현할 때 쓰였다.
예를 들어, x=01101001이고 x-1=01101000이 라면
위의 식을 수행하면 01101000이 된다. 즉, 맨 오른쪽의 한 비트가 사라짐을 보여준다.
x가 어떤 수 이든 x-1은 x의 가장 오른쪽비트와 x-1의 비트가 다르다.
그래서 '&'을 사용하면 맨 오른쪽의 1비트가 사라지게 된다.
*/

#include <stdio.h>

int bitcount(unsigned x)
{
	int b;

	for (b = 0; x != 0; b++)
		x &= (x - 1);

	return b;
}
