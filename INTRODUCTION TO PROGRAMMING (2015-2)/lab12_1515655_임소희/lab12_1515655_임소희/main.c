#include <stdio.h>
#include <ctype.h>
#include <string.h>
#include <stdlib.h> /* bsearch(), qsort() */

#define MAXWORD 100
#define TABSIZE 1000

typedef struct key {
    char *word;
    int keyword;
    int count;
} Symbol;

char *keywords[] = {
    "auto", "break", "case", "char", 
    "const", "continue", "default", "do", 
    "double", "else", "enum", "extern", 
    "float", "for", "got0", "if", "int",
    "long", "register", "return", "short",
    "signed", "sizeof", "static", "struct",
    "switch", "typedef", "union", "unsigned",
    "void", "volatile", "while"
};

int getword(char *, int);
int compare(Symbol *, Symbol *);
Symbol *append(char *, Symbol *, int, int);


main()
{
    Symbol s, *p;
    char word[MAXWORD];
    Symbol symtab[TABSIZE];
    int ntab; /* symbol table size */

    /* initial table size = # keywords */
    ntab = sizeof keywords / sizeof keywords[0]; 

    /* symtab[] 초기화 */	
    for (p = symtab; p < symtab + ntab; p++)
        p->word = keywords[p-symtab],
        p->keyword = 1,
        p->count = 0;

    s.word = word;
    while (getword(word, MAXWORD) != EOF)
        if (isalpha(word[0])) {
            p = bsearch(&s, symtab, ntab, sizeof *symtab, compare);
            if (p == NULL) {
                 p = append(word, symtab, ntab, TABSIZE), ntab++;
                 if (p != NULL)
                      qsort(symtab, ntab, sizeof *symtab, compare);
            } else
                 p->count++;
        }

    printf("Keywords\n");
    for (p = symtab; p < symtab + ntab; p++)
        if (p->keyword && p->count > 0)
            printf("%4d %s\n", p->count, p->word);

    printf("\n\nNon-keywords\n");
    for (p = symtab; p < symtab + ntab; p++)
        if (!p->keyword)
            printf("%4d %s\n", p->count, p->word);
}


/* symtab의 2원소의 첫 번째 필드에 대한 문자열 비교 */
int compare(Symbol *p, Symbol *q)
{
    return strcmp(p->word,q->word)/* TO BE FILLED */ ;
}

/* 새로 나타난 식별자 word를 symtab 끝에 추가한다 */
Symbol *append(char *word, Symbol *tab, 
                                                int n, int tabsize) 
{
    Symbol *p = tab + n;

    if (n >= tabsize)
         return NULL;
    p->word = strdup(word);
    p->keyword = 0, p->count = 1;
    return p;
}

int getword(char *word, int lim)
{
    int c;
    char *w = word;

    while (isspace(c = getchar()))
        ;
    if (c != EOF)
        *w++ = c;
    if (!isalpha(c)) {
        *w++ = '\0';
        return c;
    }
    for ( ; --lim > 0; w++)
        if (!isalnum(*w = getchar())) {
            ungetc(*w, stdin);
            break;
        }
    *w = '\0';
    return word[0];
}
