import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 class Employee
{
String name;
String employee_code;
char gender;
String location;
}
 
 
public class Employeedemo
{

public static void main(String[] args) 
{
int i=1;
char reply='y';
boolean flag=true;
String employee_code="0";

List<Employeedemo> empList=new ArrayList();
Scanner sc=new Scanner(System.in);

while(flag)
{
Employeedemo emp=new Employeedemo();
System.out.println("Enter the employee name");
String name=sc.next();
System.out.println("Enter the gender");
String gender=sc.next();
System.out.println("Enter employee Location");
String location=sc.next();
char st=location.charAt(0);

for(Employeedemo e: empList)
{
empList.add(emp);
}

if(i<=5)
{
System.out.println("Employee code:"+st+String.format("%04d", i));
i++;
}
else
flag=false;
}
}

}


