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
		if (size == 0) {
			System.out.println("The list is empty!");
		} else if ( (index < 0) || (index >= size) ) {
			System.out.println("Pick an index between 0 and " + (size - 1) + "!");
		} else {
			Student previous = (Student) null;
			Student wanted = head;
			for (int i = 0; i < index; i++) {
				previous = wanted;
				wanted = wanted.getNext();
			}
			previous.setNext(wanted.getNext());
			size--;			
		}
	}
	
	public void remove(String name) {
		Student previous = (Student) null;
		Student wanted = head;
		boolean is = false;
		for (int i = 0; i < size; i++){
			if ( wanted.getName().toLowerCase().equals(name.toLowerCase()) ) {
				is = true;
				previous.setNext(wanted.getNext());
				i = size;
				size--;
			}
			previous = wanted;
			wanted = wanted.getNext();
		}
		if (! is) {
			System.out.println(name + " is not on the list.");
		}
	}
	
	public void pop() {
		System.out.println(head.getName() + " has been removed from the list.");
		head = head.getNext();
		size--;
	}
	
	public void clear() {
		while (head != null) {
			System.out.println(head.getName() + " has been called.");
			head = head.getNext();
			size--;
		}
		System.out.println("The list is now empty.");
	}
	
	public void search(String name) {
		Student dummy = head;
		boolean is = false;
		for(int i = 0; i < size; i++) {
			if ( dummy.getName().toLowerCase().equals(name.toLowerCase()) ) {
				is = true;
				System.out.println(dummy.getName() + " is on the list.");
				i = size;
			}
			dummy = dummy.getNext();
		}
		
		if (! is) {
			System.out.println(name + " is not on the list.");
		}
	}
	
	public void display(String name) {
		Student dummy = head;
		boolean is = false;
		for(int i = 0; i < size -1 ; i++) {
			if ( dummy.getName().toLowerCase().equals(name.toLowerCase()) ) {
				is = true;
				System.out.println(dummy.getName() + ", code " + dummy.getCode() + ", is enrolled in " + dummy.getSubject() + ".");
				i = size;
			}
			dummy = dummy.getNext();
		}
		if (! is) {
			System.out.println(name + " is not on the list.");
		}
	}
	
	public int size() {
		return size;
	}
	
}
