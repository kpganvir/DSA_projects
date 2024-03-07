package demo.examples.hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashTable myHashtable=new HashTable();

		myHashtable.set("paint",12);
		myHashtable.set("bolts",100);
		myHashtable.set("nails",4);
		myHashtable.set("tile",6);
		myHashtable.set("lumber",11);;
		myHashtable.printTable();
		System.out.println(" hi ="+myHashtable.get("hi"));
		
		System.out.println(" tile ="+myHashtable.get("tile"));
		System.out.println(" lumber ="+myHashtable.get("lumber"));
		
		System.out.println("all keys ="+myHashtable.keys());
	}

}
