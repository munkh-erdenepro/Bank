package Main;

import java.util.ArrayList;
import java.util.List;
/**
 * @author munkh-erdene
 */
public class Course {
	private ArrayList<Student> Students;
	private Lecturer Lecturer;
	Course(){
		Students = new ArrayList<Student>(); 
		Lecturer = new Lecturer();
	}
	public int getIndexStudent(int index) {
		return  Students.indexOf(index);
	}
	public void addStudent(String name , int age , String ID) {
		Student stud = new Student(name,age,ID);
		Students.add(stud);
	}
	public void removeStudent(int index) {
		Students.remove(index);
	}
	public Lecturer getLecturer() {
		return Lecturer;
	}
	public void setLecturer(Lecturer lecturer) {
		Lecturer = lecturer;
	}
	public void print() {
		System.out.println("Lecturer Name : " + Lecturer.getName());
		System.out.println("Number of Students : " + Students.size());
		for(int i = 0 ; i<Students.size() ; i++) {
			System.out.println("Student:" + Students.get(i).getName());
		}
	}
}
