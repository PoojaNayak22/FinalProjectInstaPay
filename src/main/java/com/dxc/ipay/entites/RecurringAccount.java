package com.dxc.ipay.entites;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Component
@Entity
public class RecurringAccount {
	
	private String accountNumber;
	

	private String depositAmount;
	private String period;
	private String rateOfInterest;
	private String withdraw;
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
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
	public String getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(String withdraw) {
		this.withdraw = withdraw;
	}
	
	@Override
	public String toString() {
		return "RecurringAccount [accountNumber=" + accountNumber + ", depositAmount=" + depositAmount + ", period="
				+ period + ", rateOfInterest=" + rateOfInterest + ", withdraw=" + withdraw + "]";
	}
	
	

}
