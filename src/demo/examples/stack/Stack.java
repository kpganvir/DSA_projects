package demo.examples.stack;

public class Stack {

	private Node top;
	
	private int height;
	
	public Stack(int value)
	{
		Node newNode=new Node(value);
		top=newNode;
		height++;
	}

	public void push(int value)
	{
		Node newNode=new Node(value);
		if(height==0)
		{
			top=newNode;
		}
		else
		{
			newNode.next=top;
			top=newNode;
			
		}
			height++;
		
	}
	
	public Node pop()
	{
		Node temp=top;
		if(height==0)
			return null;

			
			top=temp.next;
			temp.next=null;
		
		height--;
		return temp;
	}
	
	public void printStack()
	{
		Node temp=top;
		while(temp!=null)
		{
			System.out.println(temp.value);
			temp=temp.next;
			
		}
				
		
	}
	public Node getTop() {
		return top;
	}

	public void setTop(Node top) {
		this.top = top;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
}

class Node{
	
	
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