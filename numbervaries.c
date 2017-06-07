#include<stdio.h>
#include<string.h>
int main()
{
char str[50],val[10];
int j=0;
scanf("%s",str);
for(int i=1;str[i];i++)
{
int b=str[i-1];
char val[10]="\0";
while(str[i]-48>=0 && str[i]-48<=9)
{
val[j++]=str[i];
i++;
}
int c=atoi(val);
for(j=0;j<c;j++)
{
printf("%c",ch);
}
}
return 0;
}
