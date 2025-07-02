package com.poliana.dasbordVendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poliana.dasbordVendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
