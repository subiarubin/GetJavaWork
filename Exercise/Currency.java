package Exercise;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Set;

 enum money{Rupee,Dollar,yen,Dinar,Euro}
class Currency {
	//instance variables
     int currency;
     String countryName;
     money currencyType;
     money indianCurrency=money.Rupee;
     money usCurrency=money.Dollar;
     money kuwaitCurrency=money.Dinar;
     //default constructor
      Currency(){
    	  
      }
      Currency(money currencyType)
      {
    	  this.currencyType=currencyType;
      }

	@Override
	public String toString() {
		return " currency is"+currencyType;
	}
     
}    
     
    

