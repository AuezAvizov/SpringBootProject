package org.example.hwspring.controller;

import org.example.hwspring.service.LandlordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/landlords")
public class LandlordController {
    @Autowired
    private LandlordService landlordService;

    @PostMapping("/{landlordId}/increment-rented-apartments")
    public ResponseEntity<String> incrementRentedApartments(@PathVariable Long landlordId) {
        landlordService.incrementRentedApartments(landlordId);
        return ResponseEntity.ok("Rented apartments incremented successfully.");
    }
}
