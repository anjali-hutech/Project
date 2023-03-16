package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

}
