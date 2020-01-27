package Activity;
import static java.lang.System.out;
import java.util.Scanner;
public class Customer {
	//abstraction
		private String name;
		private int age	;
		private String address;
		private String dob;
		private int no;	
		private String d_name;
		private int p_no;
		private String reason;
		private String status;
		//encapsulation
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
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public int getNo() {
			return no;
		}
		public void setNo(int no) {
			this.no = no;
		}
		public String getD_name() {
			return d_name;
		}
		public void setD_name(String d_name) {
			this.d_name = d_name;
		}
		public int getP_no() {
			return p_no;
		}
		public void setP_no(int p_no) {
			this.p_no = p_no;
		}
		public String getReason() {
			return reason;
		}
		public void setReason(String reason) {
			this.reason = reason;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public void display()
		{
			System.out.println("this is a customer");
		}
	
		/* Scanner sc = new Scanner(System.in);
		out.println("Enter Account No: ");
		long Accno = sc.nextLong();
		out.println("Enter Account type: ");
		String Acctype = sc.next();
		out.println("Enter Balance: ");
		float Bal = sc.nextFloat();
		out.println("Enter Username: ");
		String username = sc.next();
		out.println("Enter IFSC Code: ");
		String Ifsc = sc.next();
		out.println("Account no :" +Accno);
		out.println("Account type :" +Acctype);
		out.println("Balance:" +Bal);
		out.println("Username :" +username);
		out.println("Ifsc:" +Ifsc);*/
	}

 
	


