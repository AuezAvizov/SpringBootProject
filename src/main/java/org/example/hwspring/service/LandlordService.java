package org.example.hwspring.service;

import org.example.hwspring.entity.Landlord;
import org.example.hwspring.repository.LandlordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LandlordService {
    @Autowired
    private LandlordRepository landlordRepository;

    public void incrementRentedApartments(Long landlordId) {
        Landlord landlord = landlordRepository.findById(landlordId).orElse(null);
        if (landlord != null) {
            landlord.setRentedApartmentsThisMonth(landlord.getRentedApartmentsThisMonth() + 1);
            landlordRepository.save(landlord);
        }
    }
}