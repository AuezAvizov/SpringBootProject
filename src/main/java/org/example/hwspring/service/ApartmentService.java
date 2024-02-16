package org.example.hwspring.service;

import org.example.hwspring.entity.Apartment;
import org.example.hwspring.repository.ApartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class ApartmentService {
    @Autowired
    private ApartmentRepository apartmentRepository;

    public void setTopApartment() {
        Pageable pageable = (Pageable) PageRequest.of(0, 1);
        List<Apartment> topApartments = apartmentRepository.findTopByOrderByRentedCountDesc(pageable);
        if (!topApartments.isEmpty()) {
            Apartment topApartment = topApartments.get(0);
            topApartment.setTopApartment(true);
            apartmentRepository.save(topApartment);
        }
    }
}