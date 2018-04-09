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
'&='�����ڴ� x=x&(x-1)�� ������ ǥ���� �� ������.
���� ���, x=01101001�̰� x-1=01101000�� ���
���� ���� �����ϸ� 01101000�� �ȴ�. ��, �� �������� �� ��Ʈ�� ������� �����ش�.
x�� � �� �̵� x-1�� x�� ���� �����ʺ�Ʈ�� x-1�� ��Ʈ�� �ٸ���.
�׷��� '&'�� ����ϸ� �� �������� 1��Ʈ�� ������� �ȴ�.
*/

#include <stdio.h>

int bitcount(unsigned x)
{
	int b;

	for (b = 0; x != 0; b++)
		x &= (x - 1);

	return b;
}
