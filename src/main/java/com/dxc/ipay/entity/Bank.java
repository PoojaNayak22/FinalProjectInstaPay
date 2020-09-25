package com.dxc.ipay.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Bank  implements Serializable{
	
	
	@Id
	private long accountNumber;
	
	private String accountType;
	
	private String panId;

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getPanId() {
		return panId;
	}

	public void setPanId(String panId) {
		this.panId = panId;
	}

	@Override
	public String toString() {
		return "Bank [accountType=" + accountType + ", accountNumber=" + accountNumber + ", panId=" + panId + "]";
	}
	
	

}
