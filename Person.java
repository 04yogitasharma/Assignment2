package assignment_2;

public class Person {
	private String name;
	private int age;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>=0) {
			this.age=age; 
		}
		else{
			System.out.println("Age cannot be less then 0");
		}
		}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void display() {
		if(age<=0) {
			System.out.println("Name: "+name+
					           ", Age: Age cannot be less then zero"+
					           ", Address: "+address);
		}
		else {
		System.out.println("Name: "+name+
				           ", Age: "+age+
				           ", Address: "+address);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1=new Person("Yogita Sharma",20,"Noida");
		Person person2=new Person("Smriti Sharma",-5,"Delhi");
		person1.display();
		person2.setAge(15);
		person2.display();
//		person1.
	}
	
}
