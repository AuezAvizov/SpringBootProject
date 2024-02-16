package org.example.hwspring.repository;

import org.example.hwspring.entity.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface ApartmentRepository extends JpaRepository<Apartment, Long> {
    List<Apartment> findTopByOrderByRentedCountDesc(Pageable pageable);
}