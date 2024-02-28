package demo.examples.stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Stack stack=new Stack(1);
         
         stack.push(2);
         stack.push(3);
         stack.pop();
         stack.pop();
   
         stack.printStack();
         
         System.out.print("\n stack height ="+ stack.getHeight());
	}

}
