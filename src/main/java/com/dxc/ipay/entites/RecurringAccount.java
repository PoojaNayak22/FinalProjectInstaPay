package com.dxc.ipay.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class RecurringAccount {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long accountNumber;
	
	private String depositAmount;
	private String period;
	private String rateOfInterest;

	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(String depositAmount) {
		this.depositAmount = depositAmount;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public String getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(String rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	@Override
	public String toString() {
		return "RecurringAccount [accountNumber=" + accountNumber + ", depositAmount=" + depositAmount + ", period="
				+ period + ", rateOfInterest=" + rateOfInterest + "]";
	}

	


}
