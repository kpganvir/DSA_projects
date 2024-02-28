package demo.examples.tree;

public class DemoMain {

	 public static void main(String args[])
	    {
		 BinarySearchTree tree=new BinarySearchTree();
		 
		 tree.insert(47);
		 tree.insert(21);
		 tree.insert(76);
		 tree.insert(18);
		 tree.insert(52);
		 tree.insert(82);
		 
		 
		 System.out.println("tree root="+tree.root.value);
		 System.out.println("tree left="+tree.root.left.value);
		 System.out.println("tree right ="+tree.root.right.value);
		 
		 
		 System.out.println("tree contains 18 ="+tree.contains(18));
		 
		 System.out.println("tree contains 13 ="+tree.contains(13));
		 
		 System.out.println("tree contains 100 ="+tree.contains(100));
	    }
}
