
public class Main {

	public static void main(String[] args) {

		HashTree ht = new HashTree();

		Student student1 = new Student("Yetty Malumi", "410", 4.0);
		Student student2 = new Student("Tunwa Malumi", "641", 3.0);
		Student student3 = new Student("segun Malumi", "392", 6.7);
		Student student4 = new Student("toyin Malumi", "563", 1.7);
		Student student5 = new Student("tola Malumi", "924", 1.9);
		Student student6 = new Student("mummy Malumi", "715", 2.8);

		
		
//		int std1key = ht.toHashCode(student1.getRollNo());
//		int std2key = ht.toHashCode(student2.getRollNo());
//		int std3key = ht.toHashCode(student3.getRollNo());
//		int std4key = ht.toHashCode(student4.getRollNo());
//		int std5key = ht.toHashCode(student5.getRollNo());
//		int std6key = ht.toHashCode(student6.getRollNo());


		ht.insert(student1.getRollNo(), student1);
		ht.insert(student2.getRollNo(), student2);
		ht.insert(student3.getRollNo(), student3);
		ht.insert(student4.getRollNo(), student4);
		ht.insert(student5.getRollNo(), student5);
		ht.insert(student6.getRollNo(), student6);
		System.out.println(ht.fetchStd("641"));
		
		ht.deleteStd("641");
		System.out.println(ht.totalStudents);
		ht.showData();
		
//		ht.showData();

	}

}


public class StdList {
		Node head;

	public StdList() {
		head = new Node();
		head.next = null;
		head.std = null;
	}
	
	public void insertStd(Student stdIn){
		Node n = new Node();
		n.std = stdIn;
		n.next = head;
		head = n;
	}
	
	public void deleteStd(Student stdIn){
		Node a = head;
		Node b = head.next;
		if( head.std.equals(stdIn)){
			head = head.next;
			return;
		}
		while(b != null && !(b.std.equals(stdIn))){
			
			a = b;
			b = b.next;
			}
		if(b!= null){
			a.next = b.next;
		} else {
			System.out.println("The student doesnt exist");
		}
	}
	
	public boolean findStd(String rollNoIn){
		Node a = head;
		boolean have = true;
		while(a.next != null && !(a.std.getRollNo().equals(rollNoIn))){
			
			a = a.next;
		}
		if (a.next != null){
			return have;
		} 
		return false;	
	}
	
	public  Student fetchData(String rollNoIn){
		Student f = null;
		Node a = head;
		while(a.next != null && !(a.std.getRollNo().equals(rollNoIn))){
			
			a = a.next;
		}
		if(a.next!= null){
			f = a.std;
			
		}
		return f;
	}
	
	public void showAll(){
		Node x = head;
		while(x.next != null){
			System.out.println(x.std.toString());
			System.out.println();
			x = x.next;
		}
	}
	
	
	class Node{
		Node next;
		Student std;
	}

}
public class HashTree{
	StdList[] arr;
	int totalStudents;
	
	public HashTree(){
		arr = new StdList[5];
		totalStudents=0;
	}
	
	private int toHashCode(String rollNoIn){
		int addASCII = 0;
		for(int i = 0; i < rollNoIn.length(); i++){
			addASCII = addASCII + rollNoIn.codePointAt(i);
		}
		int code = addASCII % 5;
		
		return code;
		
	}
	
	public boolean insert(String rollNoIn, Student stdIn){
		int a = toHashCode(rollNoIn);
		if(arr[a] == null){
			arr[a] = new StdList();
		}
		Student x = null;
		arr[a].insertStd(stdIn);
		totalStudents++;

		return true;
	}
	
	public int numberOfStudents(){
		return totalStudents;
	}
	
	public Student fetchStd(String rollNo){
		int a = toHashCode(rollNo);
		if(arr[a] == null){
			return null;
		}
		return arr[a].fetchData(rollNo);
	}
	
	public boolean deleteStd(String rollNo){
		int a = toHashCode(rollNo);
		if(arr[a] == null){
			return false;
		} else {
				Student x = arr[a].fetchData(rollNo);
				arr[a].deleteStd(x);
				totalStudents--;
				return true;
		}
		
	}
	
	public void showData() {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null)
				arr[i].showAll();
		}

	}
	
}
	

public class Student {
	
	private String name;
	private String rollNo;
	private double cgpa;

	public Student(String nameIn, String rollNoIn, double cgpaIn) {
		this.name = nameIn;
		this.rollNo = rollNoIn;
		this.cgpa = cgpaIn;
	}
	
	public String getName(){
		return name;
	}
	
	public String getRollNo(){
		return rollNo;
	}
	
	public double cgpa(){
		return cgpa;
	}
	
	public String toString(){
		return "Name: "+ name +"\nEnrollment Number: "+ rollNo + "\nCummulative GPA: " + cgpa;
	}

}





