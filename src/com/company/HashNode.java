package com.company;

public class HashNode <T> {
    int key;
    T value;
    HashNode next;

    public HashNode( int key, T value){
        this.key= key;
        this.value=value;
        next=null;
    }
    public HashNode(){
        next=null;
    }
    public T getValue(){
        return value;
    }
    public int getKey() {
        return key;
    }

}
