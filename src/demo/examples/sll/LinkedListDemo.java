package demo.examples.sll;


public class LinkedListDemo {

    public static void main(String args[])
    {
        LinkedList list1=new LinkedList(0);
        list1.append(1);
        list1.append(2);
        list1.append(3);
        list1.append(4);
        list1.append(5);
        list1.append(6);
        list1.printList();
        list1.reverse();
        list1.printList();
//        list1.getHead();
//        list1.getTail();
//        list1.getLength();
//        list1.printList();
//        list1.removeLast();
//        list1.printList();
//        list1.getLength();
//        list1.prepend(10);
//        list1.printList();
//        list1.getHead();
    }


}
class Node{
    int value;
    Node next;
    Node(int value){
        this.value=value;
    }
}
class LinkedList{
    private Node head;
    private Node tail;
    private int length;

    LinkedList(int value){
        Node newNode=new Node(value);
        head=newNode;
        tail =newNode;
        length=1;

    }


    //get head
    public void getHead() {
        if(head ==null)
            System.out.println("head is null");
        else
            System.out.println("head is ="+head.value);

    }
    public void getTail() {
        if(head ==null)
            System.out.println("tail is null");
        else
            System.out.println("Tail is ="+tail.value);

    }

    public void append(int value)
    {
        if(length==0)
        {
            Node newNode=new Node(value);
            head=newNode;
            tail=newNode;
            tail.next=null;
            length=1;
        }
        else {
            Node newNode=new Node(value);
            newNode.next=null;
            tail.next=newNode;
            tail=newNode;
            length=length+1;
        }
    }

    public void prepend(int value)
    {
        Node newNode=new Node(value);
        if(head==null && tail==null)
        {

            head=newNode;
            tail=newNode;

        }
        else
        {
            newNode.next=head;
            head=newNode;
        }
        length++;
    }

    public Node removeLast()
    {
        if(length==0)return null;

        Node priv=head;
        Node temp=head;
        while (temp.next != null)
        {
            priv=temp;
            temp=temp.next;

        }
        priv.next=null;
        tail=priv;
        length--;
        if(length==0){
            head=null;
            tail=null;
        }
        return temp;

    }

    public void getLength()
    {
        System.out.println("length is ="+length);
    }
    //append
    //removebyvalue
    //removeLast
    //print
    void printList()
    {
        Node temp=head;
        System.out.println("List is: ");
        while(temp !=null)
        {
            System.out.println(temp.value +",");
            temp =temp.next;
        }

    }

    public void reverse()
    {
        Node temp=head;
        head=tail;
        tail=temp;

        Node before=null;
        Node after=temp.next;

        for(int i=0;i<length;i++)
        {
            after=temp.next;
            temp.next=before;
            before=temp;
            temp=after;
        }


    }





}
