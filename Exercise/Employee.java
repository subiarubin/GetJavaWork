package Exercise;

public class Employee {
	private int employeeID;
	private StringBuilder employeeName;
	private boolean employeeStatus;
	private float employeeSalary;
	private String companyName;
	
	Employee()
	{
		
	}
	
	public Employee(int employeeID, StringBuilder employeeName, boolean employeeStatus, float employeeSalary,
			String companyName) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeStatus = employeeStatus;
		this.employeeSalary = employeeSalary;
		this.companyName = companyName;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public StringBuilder getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(StringBuilder employeeName) {
		this.employeeName = employeeName;
	}

	public boolean isEmployeeStatus() {
		return employeeStatus;
	}

	public void setEmployeeStatus(boolean employeeStatus) {
		this.employeeStatus = employeeStatus;
	}

	public float getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	

}
