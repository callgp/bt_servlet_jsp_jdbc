package com.w3schools.www.xml;

public class Main {

	private static TempConvertSoap tempConvertSoap;

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
   TempConvertLocator t=new TempConvertLocator();
   tempConvertSoap = t.getTempConvertSoap();
   
   
   String celcius="102";
   String celsiusToFahrenheit = tempConvertSoap.celsiusToFahrenheit(celcius);
   System.out.println("celsiusToFahrenheit is "+celsiusToFahrenheit	);
	}

}
