public class exoverload
{
public static int minfunction(int a,int b)
{
int min;
min=a+b;
return min;
}
public static double minfunction(double c,double d)
{
double min;
min=c+d;
return min;
}
public static void main(String geetansh[])
{
int a=11;
int b=6;
double c=7.3;
double d=9.4;
int res1=minfunction(a,b);
double res2=minfunction(c,d);
System.out.print(res1);
System.out.print(res2);
}
}

