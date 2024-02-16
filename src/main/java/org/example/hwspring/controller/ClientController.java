package org.example.hwspring.controller;

import org.example.hwspring.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clients")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping("/{clientId}/increment-rented-months")
    public ResponseEntity<String> incrementRentedMonths(@PathVariable Long clientId) {
        clientService.incrementRentedMonths(clientId);
        return ResponseEntity.ok("Rented months incremented successfully.");
    }
}
