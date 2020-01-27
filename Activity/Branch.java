package Activity;

public class Branch extends Bank{

	//abstraction
private int branchid,locationid;


public Branch() 
{
	
}
//encapsulation
public int getBranchid() {
	return branchid;
}

public void setBranchid(int branchid) {
	this.branchid = branchid;
}

public int getLocationid() {
	return locationid;
}

public void setLocationid(int locationid) {
	this.locationid = locationid;
}
public void display()
{
	System.out.println("this is a branch");
}

}
