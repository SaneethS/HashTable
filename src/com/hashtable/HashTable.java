package com.hashtable;

public class HashTable {

	public static void main(String[] args) {
		String statement = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves "
				+ "deliberately into paranoid avoidable situations";
		MyLinkedHashMap<String,Integer> myLinkedHashMap = new MyLinkedHashMap<>();
		String[] words = statement.toLowerCase().split(" ");
		for (String string : words) {
			Integer value = myLinkedHashMap.get(string);
			if(value == null) value = 1;
			else value = value + 1;
			myLinkedHashMap.add(string, value);
		}
		System.out.println(myLinkedHashMap);
	}

}
