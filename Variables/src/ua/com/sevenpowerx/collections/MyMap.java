package ua.com.sevenpowerx.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("key", 1);
		map.put("key1", 2);
		map.put("key2", 8);
		map.put("key3", 10);
		
		Integer value = map.get("key2");
		System.out.println(value);
		
		System.out.println("--- Map ---");
		Set<String> keySet = map.keySet();
		for (String k : keySet) {
			System.out.println(k);
		}
		System.out.println("--- Map remove key ---");
		map.remove("key");
		Set<String> keySetRemoveKey = map.keySet();
		for (String k : keySetRemoveKey) {
			System.out.println(k);
		}
		
		System.out.println("--- Map add ---");
		map.put("key11", 77);
		
		for (Integer val :map.values()) {
			System.out.println("val = " + val);
		}
	}
}
