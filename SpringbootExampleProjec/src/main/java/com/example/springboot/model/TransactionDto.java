package com.example.springboot.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Data;

@Data
public class TransactionDto {

	private Long Id;
	 private BigDecimal totalExpenses;
	 private BigDecimal totalEarnings;
	 private String discription;
	 private String source;
	 private LocalDate date;
}
