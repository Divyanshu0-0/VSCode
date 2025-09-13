#include<stdio.h>
void main()
{
    int x,y;
    printf("Enter two numbers: ");
    scanf("%d %d",&x,&y);
    if(x>y)
    {
        printf("Maximum number is %d\n",x);
    }
    else
    {
        printf("Maximum number is %d\n",y);
    }
}