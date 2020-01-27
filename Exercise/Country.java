package Exercise;

public class Country {
//instance variables
	private String countryName;
	private Currency currency;
	//default constructor
	Country(){
		
	}
	public Country(String countryName,Currency currency)
	{
		super();
		this.countryName=countryName;
		this.currency=currency;
	}
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + "]";
	}
	
}

