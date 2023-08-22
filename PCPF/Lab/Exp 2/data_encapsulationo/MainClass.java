class Person {
	private int age;
	private String name;

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
}

class MainClass {
	public static void main(String arg[]){
		Person person = new Person();
		person.setName("Ajaykumar");
		System.out.println("Name: "+person.getName());
		person.setAge(19);
		System.out.println("Age: "+person.getAge());
	}
}