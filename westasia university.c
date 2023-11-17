#include<stdio.h>
void main()
{
    double GPA,value,fee;
    printf("please enter your GPA");
    scanf("%lf",&GPA);
    printf("please enter value");
    scanf("%lf",&value);
    if(GPA>=3.8)
    {
        fee=value-(value*50/100.0);
        printf("%lf",fee);
    }
    else if(GPA<3.8)
    {
        fee=value-(value*25/100.0);
        printf("%lf",fee);
    }
    else if(GPA<3.3)
    {
        fee=value;
        printf("%lf",fee);
    }

}
