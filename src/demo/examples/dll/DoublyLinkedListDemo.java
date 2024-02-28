package demo.examples.dll;

public class DoublyLinkedListDemo {

    public static void main(String arg[])
    {
      DoublyLinkedList myDLL=new DoublyLinkedList(1);
      myDLL.append(2);
        myDLL.append(3);
        myDLL.append(4);
        myDLL.append(5);
        myDLL.append(6);
      myDLL.printList();
     // myDLL.removeLast();
      System.out.println("_________________________");
       // myDLL.prepend(6);
      //  myDLL.removeFirst();
      myDLL.remove(2);
    //   Node temp=myDLL.get(6);
      // myDLL.set(2, 7);
    // myDLL.insert(2, 8);
       myDLL.printList();
      // System.out.println(" temp ="+temp.value);

    }
}
