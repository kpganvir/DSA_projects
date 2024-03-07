package demo.examples.hashtable;

import java.util.ArrayList;
import java.util.List;


public class HashTable {

	private int size=7;
	private Node[] dataMap;
	
	
	
	HashTable(){
		dataMap=new Node[size];
	}
	
	//hash method
	
	private int hash(String key)
	{
		int hash=0;
		
		char[] keyChars=key.toCharArray();
		for(char ch:keyChars)
		{
			int aciivalue=ch;
			//reminder after dividing by zero
			hash=(hash+aciivalue*23) % dataMap.length;
			
		}
		
		
		return hash;
	}
	
	public void set(String key,int value)
	{
		
		int index=hash(key);
		Node newNode=new Node(key,value);
		if(dataMap[index]==null)
		{
			dataMap[index]=newNode;
			
		}else {
			Node temp=dataMap[index];	
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
		}
		
	}
	
	public int get(String key)
	{
		
		int index=hash(key);
		Node temp=dataMap[index];
		while(temp!=null)
		{
			if(temp.key==key)
			{
				return temp.value;
			}
			temp=temp.next;
		}
		
		
		return 0;
		
	}
	
	
	void printTable()
	{
		for(int i=0;i<dataMap.length;i++)
		{
			System.out.println(i+":");
			Node temp=dataMap[i];
			while(temp!=null)
			{
			System.out.println("  { key= "+temp.getKey() +" : value = "+temp.getValue()+" }");
			temp=temp.next;
			}
		}
	}
	
	public List<String> keys()
	{
		List<String> keys=new ArrayList<String>();
		for(Node temp:dataMap)
		{
			while(temp!=null)
			{
				keys.add(temp.getKey());
				temp=temp.next;
			}
			
			
		}
		return keys;
		
	}
	
	
	
	class Node{
		
		String key;
		int value;
		Node next;
		
		Node(String key,int value)
		{
			this.key=key;
			this.value=value;
			
		}

		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}
	
}
