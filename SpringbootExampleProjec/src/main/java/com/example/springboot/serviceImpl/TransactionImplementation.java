package com.example.springboot.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.entity.Customer;
import com.example.springboot.entity.Transaction;
import com.example.springboot.model.TransactionDto;
import com.example.springboot.repository.CustomerRepository;
import com.example.springboot.repository.TransactionRepository;
import com.example.springboot.service.TransactionService;

import jakarta.persistence.EntityNotFoundException;

@Service
public class TransactionImplementation implements TransactionService{

	@Autowired
	private TransactionRepository transactionRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public Transaction recordTransaction(TransactionDto transactionDto) {
		Transaction trans=new Transaction();
		trans.setSource(transactionDto.getSource());
		trans.setDiscription(transactionDto.getDiscription());
		trans.setDate(transactionDto.getDate());
		transactionRepository.save(trans);
		
		Customer customer=customerRepository.findById(transactionDto.getId()).orElseThrow(EntityNotFoundException::new);
		customer.setBalance(customer.getBalance().add(trans.getAmount()));
		
	}
	

}
