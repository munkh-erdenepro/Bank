package Main;
/**
 * @author munkh-erdene
 */
public class Student implements Person {
	private String name;
	private int age;
	private String ID;

	Student() {
		name = new String("UNKNOWN");
		age = new Integer(0);
		ID = new String("UNKNOWN");
	}
	Student(String name , int age , String ID){
		this.name = name;
		this.age = age;
		this.ID = ID;
	}
	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public String getName() {
		return name;
	}
}
