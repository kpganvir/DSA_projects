package demo.examples.hashtable;

public class HashTable {

	private int size=7;
	private Node[] dataMap;
	
	
	
	HashTable(){
		dataMap=new Node[size];
	}
	
	void printTable()
	{
		for(Node node: dataMap)
		{
			System.out.println("key= "+node.getKey() +" : value = "+node.getValue());
		}
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
