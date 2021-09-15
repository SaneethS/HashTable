package com.hashtable;

public class HashTable {

	public static void main(String[] args) {
		String statement = "To be or not to be";
		MyHashMap<String,Integer> myHashMap = new MyHashMap<>();
		String[] words = statement.toLowerCase().split(" ");
		for (String string : words) {
			Integer value = myHashMap.get(string);
			if(value == null) value = 1;
			else value = value + 1;
			myHashMap.add(string, value);
		}
		System.out.println(myHashMap);
	}

}
