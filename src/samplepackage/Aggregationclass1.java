package samplepackage;

public class Aggregationclass1 {
	String name ="Yugandhar";
	int id=10;
	
	
	int method1(int id)
	{
		this.id=id;
	return id*id;
	}

	public static void main(String[] args) {
		
		Aggregationclass1 yug1=new Aggregationclass1();
		int value=yug1.method1(20);
		System.out.println(value);
		
		
	}

}
