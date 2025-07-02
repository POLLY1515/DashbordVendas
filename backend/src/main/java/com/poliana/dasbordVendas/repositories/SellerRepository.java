package com.poliana.dasbordVendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poliana.dasbordVendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
