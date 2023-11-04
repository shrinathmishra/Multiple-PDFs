package com.example.MultiplePDFs;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Add custom query methods if needed
}
