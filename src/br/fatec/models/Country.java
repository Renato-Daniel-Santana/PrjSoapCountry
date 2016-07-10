package br.fatec.models;

public class Country {

    String countryCode =null;
    String city=null;
    String name =null;
   
    public Country(){
          
    }
   
    public Country(String name){
           this.name=name;
    }
   
    public String getCountryCode() {
           return countryCode;
    }
    public void setCountryCode(String countryCode) {
           this.countryCode = countryCode;
    }
    public String getCity() {
           return city;
    }
    public void setCity(String city) {
           this.city = city;
    }
    public String getName() {
           return name;
    }
    public void setName(String name) {
           this.name = name;
    }            
}