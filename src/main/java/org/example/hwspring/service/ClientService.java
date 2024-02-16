package org.example.hwspring.service;

import org.example.hwspring.entity.Client;
import org.example.hwspring.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public void incrementRentedMonths(Long clientId) {
        Client client = clientRepository.findById(clientId).orElse(null);
        if (client != null) {
            client.setRentedMonths(client.getRentedMonths() + 1);
            clientRepository.save(client);
        }
    }
}