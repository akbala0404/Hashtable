package com.company;

public class MyHashTable<T> {
    HashNode[] hashArray;
    int size;

    public MyHashTable( int size) {
        this.size=size;
        hashArray=new HashNode[this.size];
        for( int i=0; i<hashArray.length; i++)
            hashArray[i]= new HashNode<T>();
    }
    public int hash( int key){
        return key%size; // function to get the last digit
    }
    public void put (int key, T value){ // Put the key-value pair in the hash table.

        int index=hash(key);
        HashNode valueArray= hashArray[index];
        HashNode newElement = new HashNode<T>(key,value);
        newElement.next=valueArray.next;
        valueArray.next=newElement;
    }

    public T get( int key){ //Returns the value to which the specified key is mapped
        T value=null;
        int index=hash(key);
        HashNode valueArray= hashArray[index];
        while (valueArray.next!=null){
            if(valueArray.key==key){
                value=(T)valueArray.getValue();
                break;
            }
            valueArray=valueArray.next;
        }
        return value;
    }
    public boolean containsKey(int key)
    {
        return get(key) != null;
    }

}
