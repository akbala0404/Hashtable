package com.company;

public class Main {

    public static void main(String[] args) {
		MyHashTable<String> hash = new 	MyHashTable<String>(10);
		hash.put(1, "Akbala");
        hash.put(2, "Amina");
        hash.put(3, "Dias");
	    System.out.println(hash.get(2));
    }
}
