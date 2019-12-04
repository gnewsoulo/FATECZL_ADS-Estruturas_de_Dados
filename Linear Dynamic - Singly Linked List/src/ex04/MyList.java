package ex04;

public class MyList {
	private int size;
	private Student head = (Student) null;

	public MyList() {	
	}
	
	public MyList(String name, String code) {
		Student student = new Student(name, code);
		head = student;
	}
	
	public MyList(Student student) {
		head = student;
	}
	
	public void append(Student student) {
		if (size == 0) {
			head = student;
		} else {
			Student current = head;
			for (int i = 0; i < size -1; i++) {
				current = current.getNext();
			}
			current.setNext(student);
		}
		student.setNext(null);
		size++;
	}
	
	public void insert(int index, Student student) {
		if (size == 0) {
			System.out.println("The student has been added to the head of the empty list.");
			append(student);
		} else if (index == size) {
			append(student);
		} else if ( (index > size) || (index < 0)) {
			System.out.println("Pick an index between 0 and " + (size + 1) + "!");
		} else {
			Student current = head;
			for (int i = 0; i < index -1; i++) {
				current = current.getNext();
			}
			student.setNext(current.getNext());
			current.setNext(student);
			size++;			
		}
		
	}
	
	public void remove(int index) {
		Student current = head;
		for (int i = 0; i < index; i++) {
			current = current.getNext();
		}
	}
	
	public void remove(Student student) {
		Student previous = (Student) null;
		Student wanted = head;
		do {
			previous = wanted;
			wanted = wanted.getNext();
		} while (wanted!= student);
		previous.setNext(wanted.getNext());
	}
	
	public void pop() {
		System.out.println(head.getName() + " has been called.");
		head = head.getNext();
	}
	
	public void clear() {
		while (head != null) {
			System.out.println(head.getName() + " has been called.");
			head = head.getNext();
		}
		System.out.println("The list is now empty.");
	}
	
	public void search(String name) {
		Student dummy = head;
		for(int i = 0; i < size -1 ; i++) {
			if (dummy.getName() == name) {
				System.out.println(dummy.getName() + " is on the list.");
				break;
			}
			dummy = dummy.getNext();
		}
		if (dummy.getName() != name) {
			System.out.println(dummy.getName() + " is not on the list.");
		}
	}
	
	public void display(String name) {
		Student dummy = head;
		for(int i = 0; i < size -1 ; i++) {
			if (dummy.getName() == name) {
				System.out.println(dummy.getName() + ", code " + dummy.getcode() + " is enrolled to " + dummy.getSubject());
				break;
			}
			dummy = dummy.getNext();
		}
		if (dummy.getName() != name) {
			System.out.println(dummy.getName() + " is not on the list.");
		}
	}
	
}
