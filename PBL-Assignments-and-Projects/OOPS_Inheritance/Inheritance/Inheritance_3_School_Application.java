package Inheritance;

class Person{
	String name, dateOfBirth;

	public Person(String name, String dateOfBirth) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}
class Teacher extends Person{
	double salary;
	String subject;
	public Teacher(String name, String dateOfBirth, double salary, String subject) {
		super(name, dateOfBirth);
		this.salary = salary;
		this.subject = subject;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
}
class Student extends Person{
	int studentId;

	public Student(String name, String dateOfBirth, int studentId) {
		super(name, dateOfBirth);
		this.studentId = studentId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
}
class CollegeStudent extends Student{
	String collegeName,year;

	public CollegeStudent(String name, String dateOfBirth, int studentId, String collegeName, String year) {
		super(name, dateOfBirth, studentId);
		this.collegeName = collegeName;
		this.year = year;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
}

public class Inheritance_3_School_Application {

	public static void main(String[] args) {
		CollegeStudent c = new CollegeStudent("Aravindh","16-08-1998",101,"UCEV","2019");
		Teacher t = new Teacher("Ajin","25-04-1994",5.3,"Computer Science");
		System.out.println("Student\n"+c.getName()+"\n"+c.getDateOfBirth()+"\n"+c.getStudentId()+"\n"+c.getCollegeName()+"\n"+c.getYear()+"\n\n");
        System.out.println("Teacher\n"+t.getName()+"\n"+t.getDateOfBirth()+"\n"+t.getSalary()+"\n"+t.getSubject());
	}

}
