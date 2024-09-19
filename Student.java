package assignment_2;

public class Student {

	private String name;
	private int grade;
	
	
	
	public Student(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name==null||name.trim().isEmpty()) {
			System.out.println("Name cannot be null");
			this.name=name;
		}
		else {
		this.name = name;
	}
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		if(grade<0||grade>100) {
			System.out.println("The grade should be between 0 and 100");
			this.grade=grade;
		}
		else {
		this.grade = grade;
	}
	}

   public void display() {
	   if((grade<0||grade>100)) {
		   System.out.println("Name: "+name+
		              ", Grade: The grade should be between 0 and 100");
	   }
	   else if(name=="null"||name.trim().isEmpty()) {
		   System.out.println("Name: Name cannot be null "+
	                          ", Grade: "+grade);
	   }
	   else {
		   System.out.println("Name: "+name+
				              ", Grade: "+grade);
	   }
   }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1=new Student("yogita",80);
		student1.display();
		Student student2=new Student("Harsh",-3);
		student2.display();
		student2.setName(null);
		student2.display();
	}

}
