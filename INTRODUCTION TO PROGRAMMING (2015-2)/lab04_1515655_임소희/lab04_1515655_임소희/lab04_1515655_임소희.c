//2-1


#include <stdio.h>

main(){

//unsigned
printf("unsigned char max : %d\n", (unsigned char)~0);

//unsigned short
printf("unsigned short max : %d\n", (unsigned short)~0);

//unsigned int
printf("unsigned int max : %u\n", (unsigned int)~0);

//unsigned long
printf("unsigned long max : %lu\n", (unsigned long)~0);



//signed char
printf("signed char max : %d\n", (char)((unsigned char)~0 >> 1)); //signed max
printf("signed char min : %d\n", -(char)((unsigned char)~0 >> 1)-1); //signed min

//signed short
printf("signed short max : %d\n", (short)((unsigned short)~0 >> 1)); //signed max
printf("signed short min : %d\n", -(short)((unsigned short)~0 >> 1)-1); //signed min

//signed int
printf("signed int max : %d\n", (int)((unsigned int)~0 >> 1)); //signed max
printf("signed int min : %d\n", -(int)((unsigned int)~0 >> 1)-1); //signed min

//signed long

printf("signed long max : %d\n", (long)((unsigned long)~0 >> 1)); //signed max
printf("signed long min : %d\n", -(long)((unsigned long)~0 >> 1)-1); //signed min

}




//2-2


/*(A) && (B) && (C)
= (A) * (B) * (C)*/


/*

#include <stdio.h>


main() {

	int i, lim = 100, s[100], c;

	for (i = 0; i<lim - 1; ++i)
	{
		if ((c = getchar()) != '\n')
		{
			if (c != EOF)
			{
				s[i] = c;
			}
		}
		else
			break;
			printf("%d\n", s[i]);
	}
}

*/


//2-3

/*


#include <stdio.h>

int htoi(char s[]);


main()
{
printf("AbCdEf ==> %d\n", htoi("AbCdEf"));
printf("123456 ==> %d\n", htoi("123456"));
printf("0100 ==> %d\n", htoi("0100"));
}

int htoi(char s[])
{
	int i, d;
	int result = 0;

	for (i = 0; s[i] != '\0'; i++)
	{
		if (s[i] >= '0' && s[i] <= '9')
		{
			d=s[i] - '0';
		}
		if (s[i] >= 'a' && s[i] <= 'z')
		{
			d=(s[i] - 'a')+10;
		}
		if (s[i]>= 'A' && s[i] <= 'Z')
		{
			d=(s[i] - 'A')+10;
		}
	

		result = result * 16 + d;
	}
	return result;
}

*/


//2-4
/*
#include <stdio.h>
#include <string.h>

void squeeze(char s[], char c[]);

void main()
{

	char s[100];
	strcpy(s, "beautiful");
	squeeze(s, "a");

	printf("%s\n", s);

	strcpy(s, "beautiful");
	squeeze(s, "aeiou");
	printf("%s\n", s);

	strcpy(s, "beautiful");
	squeeze(s, "");
	printf("%s\n", s);
}

void squeeze(char s[100], char c[])
{
	int i;
	int j;
	int k = 0;
	int sel;
	char temp[100] = "";

	strcpy(temp, s);
	for (i = 0; temp[i] != '\0'; i++)
	{
		sel = 0;
		for (j = 0; c[j] != '\0'; j++)
		{
			if (temp[i] == c[j])
			{
				sel = 1;
			}
		}
		if (sel == 0)
		{
			s[k++] = temp[i];
		}

	}
	s[k] = '\0';
}

*/

//2-5

/*
#include <stdio.h>

int any(char s1[], char s2[])
{
	int i, j;

	for (i = 0; s1[i] != '\0'; i++)
	{
		for (j = 0; s2[j] != '\0'; j++)
		{
			if (s1[i] == s2[j])
				return i;
		}
	}
	return -1;
}

main()
{
	printf("%d\n", any("beautiful", "u"));
	printf("%d\n", any("beautiful", "aeiou"));
	printf("%d\n", any("beautiful", "xyz"));

	return 0;
}
*/

