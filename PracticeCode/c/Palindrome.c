#include <stdio.h>
#include <string.h>

int main()
{
    char a[100];  // Increased buffer size
    int l, i;

    printf("Enter a string: ");
    scanf("%s", a);  // Doesn't accept spaces. Use fgets() for multi-word input.

    l = strlen(a);  // Corrected function name

    for (i = 0; i < l / 2; i++)
    {
        if (a[i] != a[l - i - 1])
        {
            printf("Not a palindrome\n");
            return 0;  // Exit early if not a palindrome
        }
    }

    printf("Palindrome\n");  // Corrected print function

    return 0;
}
