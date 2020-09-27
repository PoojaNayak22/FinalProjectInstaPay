package com.dxc.ipay.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity

public class AccountDetails implements Serializable {
	
	@Id
	private long  accountNumber;
	
	private String accountHolderName;
	
	private String bankIFSC;

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getBankIFSC() {
		return bankIFSC;
	}

	public void setBankIFSC(String bankIFSC) {
		this.bankIFSC = bankIFSC;
	}

	@Override
	public String toString() {
		return "AccountDetails [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
				+ ", bankIFSC=" + bankIFSC + "]";
	}
	
	
	
	
	
	
	

}
