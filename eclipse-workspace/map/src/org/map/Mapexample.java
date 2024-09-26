package org.map;
import java.util.*;
import java.util.Map.Entry;
public class Mapexample {
	

	//Create Table
		public static void main(String[] args) {
			Map<String, Integer> m = new HashMap<>();
			m.put("CSK",9);
			m.put("MI",10);
			m.put(null,null);
			m.put(null,19);
			m.put("RCB",45);
			m.put("KKR",36);
			
			
			System.out.println(m);
			
			int size=m.size();
			System.out.println(size);
			
			boolean contains=m.containsKey("CSK");
			System.out.println(contains);
			
			boolean ContainsValue=m.containsValue(10);
			System.out.println(ContainsValue);
			
			//m.remove("MI");
			//System.out.println(remove);
			
			
			Set<String> keyset=m.keySet();
			System.out.println(keyset);
			
			Collection<Integer> Value=m.values();
			System.out.println(Value);
			System.out.println("============================================");
   
			
			Set<Entry<String,Integer>> entrykey=m.entrySet();
			System.out.println(entrykey);
			
			for (Entry<String, Integer> e: entrykey) {
	            System.out.println(e.getKey());
	            System.out.println(e.getValue());
	        }
			
			}
	}


