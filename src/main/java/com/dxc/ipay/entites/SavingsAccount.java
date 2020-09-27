package com.dxc.ipay.entites;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class SavingsAccount {                                

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long transactionId;                     
	private String transactionType;
    private Date transactionDate;
	private String amount;
	public long gettransactionId() {
		return transactionId;
	}
	public void settransactionId(long transactionId) {
		this.transactionId = transactionId ;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "SavingsAccount [transactionId=" + transactionId + ", transactionType=" + transactionType
				+ ", transactionDate=" + transactionDate + ", amount=" + amount + "]";
	}
		
	
}
