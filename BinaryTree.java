# Data-Structures-Algorithms
Playing-around-and-creating-various-types-Data-Structures-and-algorithms


public class BST {
	private Node root;
	private int c =0;

	public BST() {
		root = null;
	}
	

	
//	public boolean insert(int item){
//		Node n = new Node();
//		n.value = item;
//		n.left = null;
//		n.right = null;
//		if(root == null){
//			root = n;
//			return true;
//		}
//		
//		Node parent = root;
//		Node child = root;
//			while (child!= null){
//				parent  = child;
//				if(item<child.value){
//					child = child.left;
//				} else {
//					child = child.right;
//				}
//			}
//			if (item< parent.value){
//				parent.left = n;
//				return true;
//			} else {
//				parent.right = n;
//				return true;
//			}
//		
//	}
	
//	public boolean insertOne(int item){
//		Node n = new Node();
//		n.value = item;
//		n.left = null;
//		n.right = null;
//		if(root == null){
//			root = n;
//			return true;
//		}
//		Node parent = root;
//		Node child = root;
//		while(child!= null){
//			parent = child;
//			if(item<child.value){
//				child = child.left;
//			} else {
//				child = child.right;
//			}
//		}
//		if(item<parent.value){
//			parent.left = n;
//		} else {
//			parent.right = n;
//		}
//		return true;
//	}
	
//	public boolean insertRoot(int item){
//		Node n = new Node();
//		n.value = item;
//		n.left = null;
//		n.right = null;
//		if(root == null){
//			root = n;
//			return true;
//		}
//		insertTree(root, item);
//		return true;
//	}
//	
//	public boolean insertTree(Node b,int item){
//		Node n = new Node();
//		n.value = item;
//		n.left = null;
//		n.right = null;
//		Node a = b;
//		if(item<a.value){
//			if(a.left == null){
//				a.left = n;
//				return true;
//			} else { 
//				insertTree(a.left, item);
//			}
//		} else {
//			if(a.right == null){
//				a.right = n;
//				return true;
//			} else {
//				insertTree(a.right, item);
//			}
//				
//			
//		}
//		return true;
//	}
	
	
	
	
	
	public boolean insert(int item){
		Node n = new Node();
		n.value = item;
		n.left = null;
		n.right = null;
		
		if (root == null){
			root = n;
			return true;
		} else {
			insertTree(root, item, n);
			return true;
		}
	}
	
	private boolean insertTree(Node b, int item, Node n){
		
		Node a = b;
		if(item<a.value){
			if(a.left == null){
				a.left = n;
				return true;
			} else {
				insertTree(a.left, item, n);
			}
		} else {
			if(a.right == null){
				a.right = n;
			} else {
				insertTree(a.right, item, n);
			}
		}
		return false;
		
	}
	
	
//	public boolean insertText(int item){
//		Node n = new Node();
//		n.value = item;
//		n.left = null;
//		n.right = null;
//		if (root == null){
//			root = n;
//			return true;
//		} else {
//			insertTextTree(root, item, n);
//		}
//		
//		return true;
//		
//	}
//	
//	private boolean insertTextTree(Node b, int item, Node n){
//		Node a = b;
//		if(item<b.value){
//			if(a.left == null){
//				a.left = n;
//				return true;
//			} else {
//				insertTextTree(a.left, item, n);
//			}
//		} else {
//			if(a.right == null){
//				a.right = n;
//				return true;
//			} else{
//				insertTextTree(a.right, item, n);
//			}
//		}
//		return true;
//	}
	
	
	public Node findNode(int item) {
		Node a = root;
		while (a != null) {
			if (a.value == item){
				return a;
			}
			if (a.value > item) {
				a = a.left;
			} else {
				a = a.right;
			}
		}
		return null;
	}
	
	
	
	public void printFromNode(Node a){
		Node b = a;
//		int c;
		if(b!= null){
			System.out.println(b.value);			
			printFromNode(b.right);
			printFromNode(b.left);	
		}
	}
	
	
	public int findMin(Node b){
		Node a = b;
		while(a.left ==null){
			return a.value;
		}
		return findMin(a.left);
	}

//	public void findMinNo(Node b){
//		Node a = b;
//		if(a!=null){
//
//			findMinNo(a.left);
//
//		}
//		
////		System.out.println(a.value);
//
//	}
	
	
	public void min5(Node b){
		Node a = b;
		if(a!= null){
//			System.out.println(a.value);
			min5(a.left);
//			System.out.println(a.value);
			System.out.println(c);
			if(c >5){
				return;
			}
			c++;

			System.out.println(a.value);

			min5(a.right);
//			System.out.println(a.value);

		}
		
	}
	
	
	
//	public boolean insertTwo(int item){
//		Node n = new Node();
//		n.value = item;
//		n.left = null;
//		n.right = null;
//		if(root == null){
//			root = n;
//			return true;
//		}
//		
//		Node parent = root;
//		Node child = root;
//		
//		while(child != null){
//			
//			parent = child;
//			
//			if(item<child.value){
//				child = child.left;
//			} else {
//				child = child.right;
//			}
//		}
//		
//		if(parent.value<item){
//			parent.left = n;
//		} else {
//			parent.right = n;
//		}
//		return true;
//	}
	
	class Node{
		private Node left;
		private Node right;
		private int value;
	}

}


public class Main {

	public static void main(String[] args) {

		BST bst = new BST();
		bst.insert(56);
		bst.insert(76);
		bst.insert(38);
		bst.insert(45);
		bst.insert(23);
		bst.insert(87);
		bst.insert(34);
		bst.insert(12);
		bst.insert(24);
		bst.insert(35);
		bst.insert(27);
		bst.insert(44);


		
//		
		System.out.println(bst.findMin(bst.findNode(56)));
//		System.out.println(bst.findMin(bst.findNode(56)));
		
//		bst.min5(bst.findNode(56));
//		bst.printFromNode(bst.findNode(56));
	}

}
