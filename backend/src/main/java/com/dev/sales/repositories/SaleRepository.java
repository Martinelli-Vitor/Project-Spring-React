package com.dev.sales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.sales.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
