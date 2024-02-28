package demo.examples.dll;

public class DoublyLinkedList {
    int length;
    Node head;
    Node tail;

    DoublyLinkedList(int value)
    {
        Node newNode=new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
    }

   public void append(int value)
    {
     Node newNode=new Node(value);
     if(length==0)
     {
         head=newNode;
         tail=newNode;
     }
     else {
         newNode.prev=tail;
         tail.next=newNode;
         tail=newNode;
     }
     length++;
    }

    //remove last
    public Node removeLast()
    {
        if(length==0) return null;
        Node temp = tail;
        if(length==1)
        {
            head=null;
            tail=null;
        }else {

            tail = temp.prev;
            tail.next = null;
            temp.prev = null;

        }
        length--;
        return temp;
    }
    //preprend
    public void prepend(int value)
    {
        Node newNode =new Node(value);

        if(length==0)
        {
            head=newNode;
            tail=newNode;
        }
        else {
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        length++;
    }

    //remove first
    public Node removeFirst(){
        if(length==0) return null;
        Node temp=head;
        if(length==1)
        {
            head=null;
            tail=null;
        }
        else{
            head=head.next;
            head.prev=null;
            temp.next=null;
        }
         length--;
        return temp;
    }

    public void printList()
    {
        Node temp=head;
        System.out.println("List is =");
        for(int i=0;i<length;i++)
        {
            System.out.println(""+ temp.getValue());
            temp=temp.next;
        }
    }



	//get a node at index
	public Node get(int index)
	{
	    if(index< 0 || index >=length  )
	        return null;
	  
	    Node temp=head;
	    if(index<=length/2)
	    {
	      temp=head;
	      for(int i=0;i<index;i++)
	      {
	    	  temp=temp.next;
	      }
	
	    }
	    else
	    {
	        temp=tail;
	        for(int i=length-1;i>index;i--)
	        {
	        	temp=temp.prev;
	        }
	    }
	    return temp;
	
	}
	
	
	public boolean set(int index,int value)
	{
		Node temp=get(index);
		if(temp !=null)
		{
			temp.value=value;
			return true;
		}
		else
		
		   return false;
	}
	public boolean insert(int index,int value)
	{
		if(index<0 || index>=length)return false;
		if(index==0)
		{
			prepend(value); return true;
		}
		if(index==length-1)
		{
			append(value);return true;
		}
		Node newNode=new Node(value);
		Node before=get(index-1);
		Node after=before.next;
		
		newNode.prev=before;
		newNode.next=after;
		
		before.next=newNode;
		after.prev=newNode;
		length++;
		
		return true;
	}
	
	public Node remove(int index)
	{
		if(index<0) return null;
		if(index==0) {
			return removeFirst();
			
		}
		if(index==length-1) {
			return removeLast();
		}
		Node temp=get(index);
	    temp.next.prev=temp.prev;
	    temp.prev.next=temp.next;
		
	    temp.next=null;
	    temp.prev=null;
	    length--;
	    return temp;
		
	}
	
}

class Node{


    public int getValue() {
        return value;
    }

    int value;
    Node prev;
    Node next;
    Node(int value)
    {
        this.value=value;

    }
}