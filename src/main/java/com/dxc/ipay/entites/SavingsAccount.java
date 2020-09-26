package com.dxc.ipay.entites;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class SavingsAccount {

	@Id
	private String accountNumber;
	
	private  String myBalance; 
	private  String withdraw;  //pojo
	private String miniStatement; //pojo
	private String monthlyStatement; //pojo
	private String utilityBills; //pojo
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getMyBalance() {
		return myBalance;
	}
	public void setMyBalance(String myBalance) {
		this.myBalance = myBalance;
	}
	public String getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(String withdraw) {
		this.withdraw = withdraw;
	}
	public String getMiniStatement() {
		return miniStatement;
	}
	public void setMiniStatement(String miniStatement) {
		this.miniStatement = miniStatement;
	}
	public String getMonthlyStatement() {
		return monthlyStatement;
	}
	public void setMonthlyStatement(String monthlyStatement) {
		this.monthlyStatement = monthlyStatement;
	}
	public String getUtilityBills() {
		return utilityBills;
	}
	public void setUtilityBills(String utilityBills) {
		this.utilityBills = utilityBills;
	}
	@Override
	public String toString() {
		return "SavingsAccount [accountNumber=" + accountNumber + ", myBalance=" + myBalance + ", withdraw=" + withdraw
				+ ", miniStatement=" + miniStatement + ", monthlyStatement=" + monthlyStatement + ", utilityBills="
				+ utilityBills + "]";
	}
	
}
