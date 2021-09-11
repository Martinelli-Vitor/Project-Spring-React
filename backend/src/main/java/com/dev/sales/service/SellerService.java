package com.dev.sales.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.sales.dto.SellerDTO;
import com.dev.sales.entities.Seller;
import com.dev.sales.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repository;
	
	public List <SellerDTO>findAll(){
		List<Seller> result = repository.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}

}
