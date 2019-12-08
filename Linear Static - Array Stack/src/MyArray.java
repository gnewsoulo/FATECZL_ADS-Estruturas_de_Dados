
public class MyArray {
	private Student[] objects;
	private int total;
	
	public MyArray(int size) {
		objects = new Student[size];
	}

	public void add(Student object) {
		makeSpace();
		objects[total] = object;
		total++;
	}

	public void add(int position, Student object) {
		if (!checkPosition(position)) {
			throw new IllegalArgumentException("Invalid position");
		}
		for (int i = total - 1; i >= position; i--) {
			objects[i + 1] = objects[i];
		}
		objects[position] = object;
		total++;
	}

	public boolean contains(Student object) {
		for (Object o : objects) {
			if (object == o) {
				return true;
			}
		}
		return false;
	}

	public Object get(int position) {
		if (!checkValue(position)) {
			throw new IllegalArgumentException("Invalid position");
		}
		return objects[position];
	}

	public void print() {
		StringBuffer print = new StringBuffer("[");
		for (int i = 0; i < total; i++) {
			System.out.println(i);
//			if (objects[i] != null) {
				System.out.println(objects[i].getName());
//			}
		}
		print.append("]");
		// System.out.println(print.toString());
	}

	public int size() {
		return total;
	}

	private boolean checkPosition(int position) {
		return (position >= 0 && position <= total);
	}

	private boolean checkValue(int position) {
		return (position >= 0 && position < total);
	}

	private void makeSpace() {
		if (total == objects.length) {
			Student[] newOne = new Student[objects.length + 10];
			for (int i = 0; i < objects.length; i++) {
				newOne[i] = objects[i];
			}
			this.objects = newOne;
		}
	}
}
