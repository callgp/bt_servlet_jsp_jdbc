package org.tempuri;

import java.math.BigDecimal;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ConverterLocator locator=new ConverterLocator();
		ConverterSoap converterSoap = locator.getConverterSoap();
		Calendar rateDate = Calendar.getInstance();
		BigDecimal conversionRate = converterSoap.getConversionRate("USD", "INR", rateDate);
		System.out.println("conversionRate 1 usd is same as rupees on this date 	 "+conversionRate + rateDate);
		
	}

}
