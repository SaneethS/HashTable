package com.hashtable;

import java.util.*;

public class MyLinkedHashMap<K,V> {
	private final int numOfBuckets;
	ArrayList<LinkedList<K>> bucketArray;
	
	public MyLinkedHashMap() {
		this.numOfBuckets = 10;
		this.bucketArray = new ArrayList<>(numOfBuckets);
		for(int i=0 ; i<numOfBuckets ; i++) {
			this.bucketArray.add(null);
		}
	}
	
	private int getBucketIndex(K key) {
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode % numOfBuckets;
		return index;
	}
	
	public void add(K key, V value) {
		int index=this.getBucketIndex(key); 
		LinkedList<K> linkedList = this.bucketArray.get(index);

		if (linkedList == null){
			linkedList = new LinkedList<>();
			this.bucketArray.set(index, linkedList);
		}
		MapNode<K, V> mapNode = (MapNode<K,V>) linkedList.search(key);
		if (mapNode == null)
		{ 
			mapNode = new MapNode<>(key,value); 
			linkedList.append(mapNode);
		} else {
			mapNode.setValue(value);
		}
	}
	
	public V get(K key) {
		int index = this.getBucketIndex(key);
		LinkedList<K> linkedList = this.bucketArray.get(index);
		if(linkedList == null)
			return null;
		MapNode<K,V> mapNode = (MapNode<K, V>) linkedList.search(key);
		return (mapNode == null) ? null: mapNode.getValue(); 
	}
	
	@Override
	public String toString() {
		return "MyLinkedHashMap List{"+bucketArray+"}";
	}
	
}
