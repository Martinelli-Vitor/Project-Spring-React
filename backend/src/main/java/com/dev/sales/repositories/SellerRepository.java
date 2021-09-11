package com.dev.sales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.sales.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller,Long> {

}
