package com.Simplilearn2;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashtableDemo {
	public static void main(String[] args) {
		Hashtable<Integer, String> map=new Hashtable<Integer, String>();
		
		map.put(1, "sonam");
		map.put(2, "Prince");
		map.put(3, "akshita");
		//map.put(4, null);
		
		System.out.println(map);
		
		System.out.println(map.containsKey(3));
		
		System.out.println("get value of key 2: "+map.get(2));
		
		for(Entry<Integer, String> entry :map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
