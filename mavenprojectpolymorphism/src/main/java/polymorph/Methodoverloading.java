package polymorph;

public class Methodoverloading 
{
	public static int show(int a,int b)
	{
		return(a+b);
	}
	public static int show(int x,int y,int z)
	{
		return(x+y+z);
	}
	public static float show(float c,float d)
	{
		return(c+d);
	}
	public static void main(String[] args) 
	{
		int sum1=show(2,5);
		int sum2=show(4,6,7);
		float sum3=show(2.0f,1.0f);
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);

	}

}
