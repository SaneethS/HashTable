package com.hashtable;

public class MapNode<K,V> implements INode<K>{
	K key;
	V value;
	MapNode<K,V> next;
	
	public MapNode(K key, V value) {
		this.key = key;
		this.value =value;
	}
	@Override
	public K getKey() {
		return key;
	}
	
	@Override
	public void setKey(K key) {
		this.key = key;
	}
	
	@Override
	public INode<K> getNext() {
		return next;
	}
	
	@Override
	public void setNext(INode<K> next) {
		this.next = (MapNode<K, V>) next;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		StringBuilder builder =new StringBuilder();
		builder.append("MyNode{"+"Key=").append(key).append(", Value=").append(value)
		.append("}");
		if(next != null)
			builder.append("->").append(next);
		return builder.toString();
	}
	
	
	
}
