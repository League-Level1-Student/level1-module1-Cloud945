
public class Car {
	private String name;
	private String type;
	private int age;
	
	public Car (String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge (int age) {
		if (age >= 0) {
			this.age = age;
		}
	}
	public void printAge() {
		
	
	if (age<130) {
		System.out.println(name + " the " + type+ " is "+age+" years old");
	}
	else {
		System.out.println(age+"! I'm not exactly sure that's even possible.");
		
	}
	}
	public static void main(String[] args) {
		Car o = new Car("Bob", "Prius");
		o.setAge(-5);
		int age = o.getAge();
		o.printAge();
		
	}
}

