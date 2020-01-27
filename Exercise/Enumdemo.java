package Exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Enumdemo
{
	 public static void main(String args[])

{
		Map<String,Currency> countries=new HashMap<String,Currency>();
		List<Country> countrylist=new ArrayList<Country>();
		countries.put("India", new Currency(money.Rupee));
		countries.put("USA", new Currency(money.Dollar));
		countries.put("Kuwait", new Currency(money.Dinar));
		for(Map.Entry<String,Currency>country:countries.entrySet())
		{
			System.out.println(country.getKey()+country.getValue());
			countrylist.add(new Country(country.getKey(),country.getValue()));
		}
		
		
		
}

}    