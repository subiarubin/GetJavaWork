package Inherit;

public class Studentdemo {
	public static void main(String[] args) {
		Student s1=new Student(1219,new StringBuilder("Vinni"));
		/*s1.rollNumber=1219;
		s1.studentName.append("Vinni");*/
		s1.brethe();
		s1.talk();
		s1.walk();
	}

}
