/*This is the model class for AccountDetails*/
package com.dxc.ipay.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity

public class AccountDetails implements Serializable {
	
	@Id //indicates primary key in the database table of name AccountDetails
	private long  accountNumber;
	
	private String accountHolderName;
	
	private String bankIFSC;

	/*getters & setters methods for the above declared entities*/
	
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
    /* toString method for the entities*/
	
	@Override
	public String toString() {
		return "AccountDetails [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
				+ ", bankIFSC=" + bankIFSC + "]";
	}
	
	
	
	
	
	
	

}
