#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
    char ch='C';
    char s[100]="Language";
    char sen[100]="Welcome To C!!";
    scanf("%[^\n]%*c", &ch);
    printf("%c\n", ch);
    scanf("%s\n", &s);
    printf("%s\n", s);
    scanf("%[^\n]%*s", &sen);
    printf("%s\n", sen);

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    return 0;
}
