package Practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapValue {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
// 16 CAPACITY
		HashMap<Integer,String> Values=new HashMap<>();
		Values.put(101, "Lakshmi");
		Values.put(102, "Lakshman");
		Values.put(103, "Hanvika");
		Values.put(102, "David");
		System.out.println(Values);
		
		//System.out.println(Values.get("Lakshmi"));
	
		for(HashMap.Entry<Integer, String> name:Values.entrySet())
		{
		if(name.getValue().equals("Lakshmi"))
	System.out.println(name.getKey()+" : "+name.getValue());
	}
		
	}

}
