package demo.examples.queue;

public class Queue {

	
	private Node first;
	private Node last;
	private int length;
	
	Queue(int value)
	{
		
		Node newNode=new Node(value);
		first=newNode;
		last=newNode;
		length=1;
	}
	
	public void printQueue()
	{
		Node temp=first;
		while(temp!=null)
		{
			System.out.println(temp.value);
			temp=temp.next;
			
		}
	}
	public void enQueue(int value)
	{
		Node newNode=new Node(value);
		if(length==0)
		{
			first=newNode;
			last=newNode;
		}
		else
		{
			last.next=newNode;
			last=newNode;
		}
		length++;
	}
	
	public Node deQueue()
	{
		
	
		if(length==0)return null;
		Node temp=first;
		if(length==1) 
			{
		
		first=null;
		last=null;
			}
		else {
			
			first=first.next;
			temp.next=null;
			
		}
		length--;
		return temp;
	}
	
	
	public Node getFirst() {
		return first;
	}
	public void setFirst(Node first) {
		this.first = first;
	}
	public Node getLast() {
		return last;
	}
	public void setLast(Node last) {
		this.last = last;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}

	
	
	
}


class Node
{
	
	int value;
	Node next;
	
	Node(int value)
	{
		this.value=value;
		
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