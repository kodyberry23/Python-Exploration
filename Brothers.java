package pythonExploration;

public class Brothers {

	// Fields
	private String name;
	private int age;

	// Constructor
	public Brothers(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

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
		this.age = age;
	}

	public static void main(String[] args) {

		// Creating Brothers
		Brothers bro = new Brothers("Kody Berry", 25);
		Brothers bro1 = new Brothers("Kyle Berry", 25);
		Brothers bro2 = new Brothers("Tyler Berry", 28);

		// Putting Brothers into a family
		Brothers[] family = { bro, bro1, bro2 };

		// Printing out the family to the console
		for (Brothers e : family) {
			System.out.println(e);
		}

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Made person with name: " + this.name + " and an age of: " + this.age;
	}

}
