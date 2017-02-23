package samplepackage;

import java.util.*;
public class Hashmap {

	public static void main(String[] args) {
	
		HashMap<Integer, String> yug= new HashMap<Integer, String>();
	yug.put(100, "Ganesh");
	yug.put(101, "susmitha");
	yug.put(102, "Sadhana");
	yug.put(103, "Anand");
	yug.put(104, "Bindhu");
	yug.put(105, "Vedha");
	yug.put(101, "Akita");
	
	for(Map.Entry m:yug.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}
	

	}

}
