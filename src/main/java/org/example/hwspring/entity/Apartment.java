package org.example.hwspring.entity;

import jakarta.persistence.*;

@Entity
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;
    private boolean topApartment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isTopApartment() {
        return topApartment;
    }

    public void setTopApartment(boolean topApartment) {
        this.topApartment = topApartment;
    }
}
