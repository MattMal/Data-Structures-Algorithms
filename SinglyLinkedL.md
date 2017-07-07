# Data-Structures-Algorithms
Playing-around-and-creating-various-types-Data-Structures-and-algorithms


public class IntLinkedList {

	private Node head;

	public IntLinkedList(int item) {
		head = new Node();
		head.value = item;
		head.link = null;

	}

	public boolean insertItem(int item) {
		Node n = new Node();
		n.value = item;
		n.link = head;
		head = n;
		return true;
	}

	public void printList() {
		Node z = head;
		while (z != null) {
			System.out.println(z.value);
			z = z.link;
		}
	}

	public boolean deleteItem(int item) {
		if (head.value == item) {
			head = head.link;
		} else {
			Node x = head;
			Node y = head.link;
			while (true) {
				if (y.value == item || y == null)
					break;
				else {
					x = y;
					y = y.link;
				}
			}
			if(y!=null){
				x.link = y.link;
			}
		}
		return false;
	}

	class Node {
		private int value;
		private Node link;
	}

}


public class Main {

	public static void main(String[] args) {
		IntLinkedList list = new IntLinkedList(5);
		
		list.insertItem(5);
		list.insertItem(8);
		list.insertItem(7);
		list.insertItem(4);
		
		list.deleteItem(8);
		
		list.printList();

	}

}
