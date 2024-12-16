package pl.joannaszczesna.jpa.model;

import jakarta.persistence.*;

@Entity
class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "STREET_NAME")
    private String streetName;
    @Column(name = "STREET_NUMBER")
    private String streetNumber;
    @Column(name = "POSTAL_CODE")
    private String postalCode;
    @Column(name = "CITY")
    private String city;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "DETAILS")
    private String details;

     Address(Builder builder) {
        this.streetName = builder.streetName;
        this.streetNumber = builder.streetNumber;
        this.postalCode = builder.postalCode;
        this.city = builder.city;
        this.country = builder.country;
        this.details = builder.details;
    }

    protected Address() {

    }

    static class Builder {
        private String streetName;
        private String streetNumber;
        private String postalCode;
        private String city;
        private String country;
        private String details;

        Builder streetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        Builder streetNumber(String streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        Builder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        Builder city(String city) {
            this.city = city;
            return this;
        }

        Builder country(String country) {
            this.country = country;
            return this;
        }

        Builder details(String details) {
            this.details = details;
            return this;
        }

        Address build() {
            return new Address(this);
        }
    }
}
