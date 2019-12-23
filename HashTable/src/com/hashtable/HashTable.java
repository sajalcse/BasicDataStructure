package com.hashtable;

import java.util.ArrayList;

public class HashTable<K, V> {
	private ArrayList<HashNode<K, V>> nodeList = new ArrayList<HashNode<K,V>>();
	private int initialSize = 10;
	public HashTable()
	{
		//initialize the table size with 10
		for (int i = 0; i < initialSize; i++) 
			nodeList.add(null); 
	}
	
	public void add(K key, V value)
	{
		int hashCode = key.hashCode(); 
		int index = hashCode % initialSize; 
		HashNode<K, V> head = nodeList.get(index);
		
		//this is the first node in the index
		if(head==null)
		{
			nodeList.set(index, new HashNode<K, V>(key, value));
		}
		//there are others node with the same index. So we need to add the current node at the tail of the linkedlist 
		else
		{
			while(head.next!=null)
			{
				head=head.next;
			}
			head.next=new HashNode<K, V>(key, value);
		}
	
	}
	
	
	public V get(K key)
	{
		int hashCode = key.hashCode(); 
		int index = hashCode % initialSize; 
		HashNode<K, V> head = nodeList.get(index);
	
		//there is no key which is looking for
		if(head==null)
			return null;
		//key is found in the list
		else
		{
			//traversing through the list of values which generates the same key
			while(head.key != key)
			{
				head = head.next;
			}
			return  head.value;
		}
	}
}
