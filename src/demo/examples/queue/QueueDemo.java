package demo.examples.queue;

public class QueueDemo {

	public static void main(String arg[])
	{
		
		Queue queue=new Queue(1);
		
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		queue.enQueue(5);
		queue.enQueue(6);
		queue.deQueue();
		queue.deQueue();
		queue.enQueue(7);
		System.out.println( "length ="+queue.getLength());
		queue.printQueue();
		
	}
}


