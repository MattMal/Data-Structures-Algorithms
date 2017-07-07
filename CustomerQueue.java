
public class Main {

	public static void main(String[] args) {
		Person person1 = new Person("Jane", "419");
		Person person2 = new Person("Paul", "647");
		Person person3 = new Person("Adam", "111");
		
		PersonQue q = new PersonQue();
		
		q.enqueue(person1);
		q.enqueue(person2);
		q.enqueue(person3);
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
//		Intq q = new Intq();
//		
//		q.enqueue(3);
//		q.enqueue(5);
//		q.enqueue(7);
//		q.enqueue(9);
//		
//		System.out.println(q.dequeue());
//		System.out.println(q.dequeue());
//		System.out.println(q.dequeue());
//		
//		q.enqueue(12);
//		q.enqueue(23);
//		q.enqueue(34);
//
//		
//		q.showAll();

	}

}


public class PersonQue {

	private Person[] q;
	private int size;
	private int total;
	private int front;
	private int rear;

	public PersonQue() {
		this.size = 4;
		this.total = 0;
		this.front = 0;
		this.rear = 0;
		q = new Person[this.size];
	}

	public PersonQue(int sizeIn) {
		this.size = sizeIn;
		this.total = 0;
		this.front = 0;
		this.rear = 0;
		q = new Person[this.size];
	}

	public boolean enqueue(Person itemIn) {
		if (isFull())
			return false;
		else {
			total++;
			q[rear] = itemIn;
			rear = (rear + 1) % size;	//dont fuckin understand
			return true;
		}
	}
	
	public Person dequeue(){
		total--;
		Person item = q[front];
		front = (front + 1) % size;		//dont fuckin understand
		
		return item;
	}

	public boolean isFull() {
		if (total == size)
			return true;
		else
			return false;
	}
	
	
	
	public void showAll(){
		
		int f = front;
		if(total != 0){
			for(int i = 0; i<total; i++){
				System.out.println(q[f]);
				f = (f+1) %size;		//dont fuckin understand
			}
		}
	}

}


public class Person {

	private String name;
	private String rollNo;
	
	Person(){
		this.name = "Uju";
		this.rollNo = "234";
	}
	
	Person(String nameIn, String rollNoIn){
		this.name = nameIn;
		this.rollNo = rollNoIn;
	}
	
	public String toString(){
		return "This persons name is "+this.name+", and their area code is: "+this.rollNo;
	}
}
