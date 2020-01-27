package Activity;


	public class Services extends Bank
	{
		//abstraction
	private int accno, cibilscore, roi;
	private String period;
	//encapsulation
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getCibilscore() {
		return cibilscore;
	}
	public void setCibilscore(int cibilscore) {
		this.cibilscore = cibilscore;
	}
	public int getRoi() {
		return roi;
	}
	public void setRoi(int roi) {
		this.roi = roi;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public void display()
	{
		System.out.println("this is service");
	}
	}

	


