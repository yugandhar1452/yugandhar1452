package samplepackage;




import samplepackage.ArrayPractice1;

public class ArrayPratice {

	
	
	
	
	public static void forloop1(String[] personlist)
	{
		for(int i=0; i<= ArrayPractice1.personArray().length;i++)
			System.out.println(personlist[i]);
	}
	
	
	public static void main (String[] args)
	{
		String[] personstn=ArrayPractice1.personArray();
		System.out.println(personstn[2]+" "+personstn[4]);
		System.out.println(personstn.length);
		forloop1(personstn);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
