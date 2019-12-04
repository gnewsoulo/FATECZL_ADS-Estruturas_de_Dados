package ex04;

public class Student {

	private String name;
	private String code;
	final private String subject = "Data Structures";
	private double grade1;
	private double grade2;
	private double grade3;
	
	private Student next;
	
	public Student(String name, String code) {
		this.name = name;
		this.code = code;
		next = (Student) null;
	}
	
	public Student getNext() {
		return next;
	}
	public void setNext(Student next) {
		this.next = next;
	}	
	public String getcode() {
		return code;
	}
	public void setcode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public double getGrade1() {
		return grade1;
	}
	public void setGrade1(double grade1) {
		this.grade1 = grade1;
	}
	public double getGrade2() {
		return grade2;
	}
	public void setGrade2(double grade2) {
		this.grade2 = grade2;
	}
	public double getGrade3() {
		return grade3;
	}
	public void setGrade3(double grade3) {
		this.grade3 = grade3;
	}
}
