package com.dxc.ipay.entites;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class FundsDeposit {
	
	@Id //indicates primary key in the database table of name FixedDeposit
	private long accountNumber;
	private String bankIFSC;
	private String amount;
	private String transactionPassword;
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBankIFSC() {
		return bankIFSC;
	}
	public void setBankIFSC(String bankIFSC) {
		this.bankIFSC = bankIFSC;
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
		return "FundsDeposit [accountNumber=" + accountNumber + ", bankIFSC=" + bankIFSC + ", amount=" + amount
				+ ", transactionPassword=" + transactionPassword + "]";
	}
	

}
