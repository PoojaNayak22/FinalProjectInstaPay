package com.dxc.ipay.entites;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity

public class Transfer {
	
	@Id
	private long receiverAccountNumber;
	private String ifsc;
	private String amount;
	private String transactionPassword;
	
	public long getReceiverAccountNumber() {
		return receiverAccountNumber;
	}
	public void setReceiverAccountNumber(long receiverAccountNumber) {
		this.receiverAccountNumber = receiverAccountNumber;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getTransactionPassword() {
		return transactionPassword;
	}
	public void setTransactionPassword(String transactionPassword) {
		this.transactionPassword = transactionPassword;
	}

	@Override
	public String toString() {
		return "Transfer [receiverAccountNumber=" + receiverAccountNumber + ", ifsc=" + ifsc + ", amount=" + amount
				+ ", transactionPassword=" + transactionPassword + "]";
	}
}
