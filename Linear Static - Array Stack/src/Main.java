
public class Main {
	public static void main(String[] args) {

		MyArray my_array = new MyArray(3);
		Student s1 = new Student("João", 156);
		Student s3 = new Student("Maria", 1534);
		Student s2 = new Student("Carlos", 6875);

		my_array.add(s1);
		my_array.add(s2);
		my_array.add(s3);

		my_array.print();
		System.out.println("");

		Student joana = new Student("Joana", 903);

		my_array.add(joana);

		my_array.print();
	}
}
