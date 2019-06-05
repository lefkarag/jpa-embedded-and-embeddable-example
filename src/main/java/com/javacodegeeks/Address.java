package com.javacodegeeks;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

    private String postcode;

    private String street;

    private String city;

    private String country;

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address [postcode=" + postcode + ", street=" + street + ", city=" + city + ", country=" + country + "]";
    }
}