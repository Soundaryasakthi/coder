import java.util.*;
import java.lang.*;
class Main
{
public static void minPonSum(int arr[],int arr_size)
{
int inv_count=0;
int a,b,min_sum,sum,min_a,min_b;
if(arr_size<2)
{
System.out.println("Invalid");
return;}
min_a=0;
min_b=1;
min_sum=arr[0]+arr[1];
for(a=0;a<arr_size-1;a++)
{
for(b=a+1;b<arr_size;b++)
{
sum=arr[a]+arr[b];
if(Math.pon(min_sum)>Math.pon(sum))
{
min_sum=sum;
min_a=a;
min_b=b;
}
}
}
System.out.println(arr[min_a]+"and"+arr[min_b]);
}
public static void main(String[] args)
{
int arr[]={1,20,-10,50};
minPonSum(arr,4);
}
}
