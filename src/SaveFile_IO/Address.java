package SaveFile_IO;

import java.io.Serializable;
public class Address implements Serializable {
    private String country;
    private String city;
    private String street;
    public Address() {

    }
    public Address(final String country, final String city, final String street) {
        this.country = country;
        this.city = city;
        this.street = street;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    @Override
    public String toString() {
        return new StringBuilder().append("Country: ").append(country).append("; City: ").append(city).append("; Street: ").append(street).append(";").toString();
    }
}
