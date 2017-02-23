package samplepackage;


public class Aggregationclass2 {

	Aggregationclass1 yug1;
	
	
	int method2(int value)
	{
		yug1= new Aggregationclass1();
		int b=yug1.method1(value);
		return b;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Aggregationclass2 yug2 = new Aggregationclass2();
		int finalvalue =yug2.method2(100);
		System.out.println(finalvalue);

	}

}
