package br.fatec.services;

import br.fatec.models.Country;

/*
 * CountryService.java
 */

public class CountryService {
    
	public CountryService(){
		
	}
	
	public Country getCountryDetails(String countryCode) {
         
		System.out.println("countryCode =" + countryCode);
		Country country = null;

		if (countryCode != null) {
			if (countryCode.equalsIgnoreCase("SL")) {
				country = new Country("Sri Lanka");
				country.setCountryCode(countryCode);
				country.setCity("Colombo");
				return country;
			} 
			else if (countryCode.equalsIgnoreCase("FR")) {
				country = new Country("França");
				country.setCountryCode(countryCode);
				country.setCity("Paris");
				return country;
			}
			else if (countryCode.equalsIgnoreCase("BR")) {
				country = new Country("Brasil");
				country.setCountryCode(countryCode);
				country.setCity("Brasília");
				return country;
			}
		}

		return new Country("Não definido");
	}
}