#include<stdio.h>
#include<math.h>
#define MAX 100
void swap(int*,int*);
int main()
{
int choice,num,n,a[MAX],data,s;
void display(int[],int);
void insert(int[],int,int,int);
int del(int[],int,int);
n=0;
int lb=0;
while(1)
{
printf("\n.....MAIN MENU....\n");
printf("1.Insert\n");
printf("2.Delete\n");
printf("3.Display\n");
printf("4.Quit\n");
printf("Enter your choice : ");
scanf("%d",&choice);
switch(choice)
{
case 1:
printf("Enter data to be inserted : ");
scanf("%d",&data);
insert(a,n,data,lb);
n++;
break;
case 2:
s=del(a,n+1,lb);
if(s!=0)
printf("\nThe deleted value is : %d \n",s);
if(n>0)
n--;
break;
case 3:
printf("\n");
display(a,n);
break;
case 4:
break;
default:
printf("Invalid choice.n");
}
printf("nn");
}
}
void insert(int a[],int heapsize,int data,int lb)
{
int i,p;
int parent(int);
if(heapsize==MAX)
{
printf("Queue Is Full!!n");
return;
}
i=lb+heapsize;
a[i]=data;
while(i>lb&&a[p=parent(i)]<a[i])
{
swap(&a[p],&a[i]);
i=p;
}
}
int del(int a[],int heapsize,int lb)
{ 
int data,i,l,r,max_child,t;
int left(int);
int right(int);
if(heapsize==1)
{
printf("Queue Is Empty!!n");
return 0;
}
t=a[lb];
swap(&a[lb],&a[heapsize-1]);
i=lb;
heapsize--;
while(1)
{
if((l=left(i))>=heapsize)
break;
if((r=right(i))>=heapsize)
max_child=l;
else
max_child=(a[l]>a[r])?l:r;
if(a[i]>=a[max_child])
break;
swap(&a[i],&a[max_child]);
i=max_child;
}
return t;
}
int parent(int i)
{
float p;
p=((float)i/2.0)-1.0;
return ceil(p);
}
int left(int i)
{
return 2*i+1;
}
int right(int i)
{
return 2*i+2;
}
void display(int a[],int n)
{ 
int i;
if(n==0)
{
printf("Queue Is Empty!!n");
return;
}
for(i=0;i<n;i++)
printf("%d ",a[i]);
printf("\n");
}
void swap(int*p,int*q)
{
int temp;
temp=*p;
*p=*q;
*q=temp;
}
