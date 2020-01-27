package Exercise;

public class Addressbook {
	  private String name;
	  private Address tempAdd;
	  private Address normAdd;
	  private long phoneNumber;
	  private String emialid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getTempAdd() {
		return tempAdd;
	}
	public void setTempAdd(Address tempAdd) {
		this.tempAdd = tempAdd;
	}
	public Address getNormAdd() {
		return normAdd;
	}
	public void setNormAdd(Address normAdd) {
		this.normAdd = normAdd;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	  
	  
	class Address
	{
		public String houseaddress;
		public String name;
		public String city;
		public String state;
		public String street;
		public String getHouseaddress() {
			return houseaddress;
		}
		public void setHouseaddress(String houseaddress) {
			this.houseaddress = houseaddress;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		@Override
		public String toString() {
			return "Address [houseaddress=" + houseaddress + ", name=" + name + ", city=" + city + ", state=" + state
					+ ", street=" + street + "]";
		}
		
		
	}	
		
		

	}