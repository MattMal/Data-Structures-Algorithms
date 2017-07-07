
public class dList {

	Node head;
	Node tail;

	public dList() {
		head = new Node();
		head.value = 0;
		head.previous = null;
		head.next = null;
		// System.out.println("The head address: "+head);
	}

//	public void insertItem(int item) {
//		Node x = new Node();
//		Node a = head;
//		while(a.next != null){
//			a = a.next;
//		}
//		if(a.next == null){
//			x.next =null;
//			x.previous = a;
//			x.value = item;
//			a.next = x;
//		}
//	}
	
	
//	//TRY CREATING A LIST THAT HAS A TAIL WHICH YOU ADD NEW ITEMS FROM IN ORDER TO SAVE TIE
//	public void insertItem(int item){
//		Node x = new Node();
//		Node a = tail;
//		x.value = item;
//		x.previous = a;
//		x.next = null;
//		tail = x;
//	}
	
	
	/////////TRY CREATING A CIRCULAR LINKED LIST THAT CONNECTS THE END TO THE START///////	
	public void insertItem(int item){
		Node x = new Node();
		Node a = head;
		Node b = head;
		
		x.value = item;
		x.next = a;
		a.previous = x;
		while(a.next!= null && a.next != b){
			a = a.next;
		}
		x.previous = a;
		a.next = x;
		head =x;
		
	}
	
	
//	public void insertItem(int item) {
//		Node x = new Node();
//		Node a = head;
//		x.value = item;
//		x.previous = null;
//		x.next =a;
//		a.previous = x;
//		tail = head;
//		head = x;
//		
//	}
	
	public void deleteItem(int item){
		
		
		if(head.value == item){
			head = head.next;
		}
		else{
			Node a = head;
			Node b = head.next;
			while(b.value != item){
				a = b;
				b = b.next;
				if(b.next.next == null){
					break;
				}
			}
			if(b.value == item ){
				a.next = b.next;
				b.next.previous = a;
			}else{
				System.out.println(item+ " is not in the data list so cannot be deleted");
				System.out.println();
			}
		}
		
	}
	

//	public boolean deleteItem(int item) {
//		if (head.link.value == item) {
//			head.link = head.link.link;
//		} else {
//			Node a = head.link;
//			Node b = head.link.link;
//			while (b.value != item||b.link==null) {
//				a = b;
//				b = b.link;
//				
//			}
//			if (b.value == item) {
//				a.link = b.link;
//			} else {
//				return false;
//			}
//		}
//		return false;
//
//	}
//	
//	
//	public void sortList() {
//		Node a = head.link;
//		int c;
//		while (a.link != null) {
//			Node b = head.link;
//			while (b.link != null) {
//				if (b.value < b.link.value) {
//					c = b.value;
//					b.value = b.link.value;
//					b.link.value = c;
//				}
//				b = b.link;
//			}
//			a = a.link;
//		}
//	}
//
	public void printList() {
		Node z = head;
		while (z.next!=head) {
			System.out.println(z.value);
			z = z.next;
		}
	}

	class Node {
		int value;
		Node next;
		Node previous;
	}
}