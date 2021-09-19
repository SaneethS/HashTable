package com.hashtable;


public class LinkedList<K> {
	public INode<K> head;
	public INode<K> tail;
	
	public LinkedList() {
		this.head = null;
		this.tail = null;	
	}
		
	public void append(INode<K> newNode) {
		if(this.head == null) {
			this.head = newNode;
		}
		if(this.tail == null) {
			this.tail = newNode;
		}
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;

		}
	}
	
	public INode<K> search(K Key) {
		INode<K> tempNode = head;
		while(tempNode != null && tempNode.getNext() != null) {
			if (tempNode.getKey().equals(Key)){
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return null;
	}
	
	public boolean remove(INode<K> key) {
		INode<K> temp = head;
		INode<K> prev = null;
		boolean isFound = false;
		if(temp != null && temp.getKey() == key.getKey()) {
			head = temp.getNext();
			return true;
			
		}
		while(temp != null) {
			if(temp.getKey().equals(key.getKey())) {
				isFound = true;
				break;
			}
			prev = temp;
			temp = temp.getNext();
		}
		if(isFound) {
			prev.setNext(temp.getNext());
			return isFound;
		}
		else {
			System.out.println("Not found!!");
			return isFound;
		}
	}
	
	
	public String toString() {
		return "My Nodes: "+head;
	}
}
