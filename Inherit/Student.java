package Inherit;

public class Student extends Human{
		public int rollNumber;
		public StringBuilder studentName;
		
		Student()
		{
			System.out.print("student object constructed");
		}
		public Student(int rollNumber,StringBuilder studentName)
		{
			super();
			this.rollNumber=rollNumber;
			this.studentName=studentName;
		}
	}
