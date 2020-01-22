// An immutable class
public final class Student1
{
final String name;
final int regNo;

public Student1(String name, int regNo)
{
this.name = name;
this.regNo = regNo;
}
public String getName()
{
return name;
}
public int getRegNo()
{
return regNo;
}
}

// Driver class
class Test
{
public static void main(String args[])
{
Student1 s = new Student1("subia", 72);
System.out.println(s.getName());
System.out.println(s.getRegNo());

// Uncommenting below line causes error
// s.regNo = 102;
}
} 

