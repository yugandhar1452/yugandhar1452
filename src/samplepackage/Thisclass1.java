package samplepackage;

public class Thisclass1 {

	int a=10;
	int b=20;
	int c=30;
	
	
	Thisclass1(int A, int B, int C)
	{
		this.b=A;
		this.a=B;
		this.c=C;
	}
	
	public static void main(String args[])
	{
		Thisclass1 yug=new Thisclass1(40, 50, 60);
		System.out.println(yug.a+" "+yug.b+" "+yug.c);
	}
	
}
