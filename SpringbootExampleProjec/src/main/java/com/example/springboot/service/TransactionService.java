package com.example.springboot.service;

import org.springframework.stereotype.Service;

import com.example.springboot.entity.Transaction;
import com.example.springboot.model.TransactionDto;

@Service
public interface TransactionService {

	public Transaction recordTransaction(TransactionDto transactionDto);
	
}
