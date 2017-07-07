
public class App {

	public static void main(String[] args) {

		// Stacker stacker = new Stacker();

		// stacker.push(12);
		// stacker.push(23);
		// stacker.push(34);
		// stacker.push(45);
		// stacker.push(56);
		// stacker.push(67);
		//
		// System.out.println(stacker.pop());
		// System.out.println(stacker.pop());
		// System.out.println(stacker.pop());
		// System.out.println(stacker.pop());
		// System.out.println(stacker.pop());

		Person person1 = new Person("Jane", "419");
		Person person2 = new Person("Paul", "647");
		Person person3 = new Person("Adam", "111");


		PersonStacker personStacker = new PersonStacker();

		personStacker.push(person1);
		personStacker.push(person2);
		personStacker.push(person3);

		System.out.println(personStacker.pop());
		System.out.println(personStacker.pop());

	}

}


public class PersonStacker {
	private int size;
	private int top;
	private Person[] stack;
	int x;

	public PersonStacker() {
		size = 3;
		top = -1;
		stack = new Person[size];
	}

	public PersonStacker(int sizeIn) {
		this.size = sizeIn;
		stack = new Person[this.size];
		top = -1;
	}

	public boolean push(Person personIn) {

		if (top < size - 1) {
			top++;
			stack[top] = personIn;
			return true;
		} else
			return false;
	}

	public Person pop() {
		if (top >= 0)
			return stack[top--];
		else
			return null;
	}

}

public class Person {
	
	private String name;
	private String rollNo;
	
	public Person(String nameIn, String rollNoIn){
		this.name= nameIn;
		this.rollNo = rollNoIn;
	}

//	public String getName() {
//		return name;
//	}
//
//	public String getRollNo() {
//		return rollNo;
//	}
	
	
	public String toString(){
		return "The name is: "+name+ " and the roll no is: "+ rollNo;
	}

}
