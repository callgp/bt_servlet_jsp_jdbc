package com.gp.springcore.properties;

import java.util.Properties;

public class CountryLanguages {
	
	private Properties countryAndLangs;

	public Properties getCountryAndLangs() {
		return countryAndLangs;
	}

	public void setCountryAndLangs(Properties countryAndLangs) {
		this.countryAndLangs = countryAndLangs;
	}

	@Override
	public String toString() {
		return "CountryLanguages [countryAndLangs=" + countryAndLangs + "]";
	}
	

}