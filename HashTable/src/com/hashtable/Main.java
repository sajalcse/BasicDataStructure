package com.hashtable;

public class Main {
public static void main(String[] args) {
	HashTable<String, Integer> hashtable = new HashTable<>(); 
	hashtable.add("this",1 ); 
	hashtable.add("isth",2 ); 
	
	
	System.out.println(hashtable.get("isth"));
}
}
