package com.poliana.dasbordVendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.poliana.dasbordVendas.dto.SaleDTO;
import com.poliana.dasbordVendas.dto.SaleSuccessDTO;
import com.poliana.dasbordVendas.dto.SaleSumDTO;
import com.poliana.dasbordVendas.entities.Sale;
import com.poliana.dasbordVendas.repositories.SaleRepository;
import com.poliana.dasbordVendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller(){
		return repository.amountGroupedBySeller();
	}

	@Transactional(readOnly = true)
	public List<SaleSuccessDTO>successGroupedBySeller(){
		return repository.sucessGroupedBySeller();
	}

}
