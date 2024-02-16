package org.example.hwspring.controller;

import org.example.hwspring.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/apartments")
public class ApartmentController {
    @Autowired
    private ApartmentService apartmentService;

    @PostMapping("/set-top-apartment")
    public ResponseEntity<String> setTopApartment() {
        apartmentService.setTopApartment();
        return ResponseEntity.ok("Top apartment set successfully.");
    }
}
