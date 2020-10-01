/*This is the model class for Withdraw*/
package com.dxc.ipay.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Withdraw {
	
	@Id //indicates primary key in the database table of name FixedDeposit
	private double amount;
	private String transactionPassword;
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
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
		return "Withdraw [amount=" + amount + ", transactionPassword=" + transactionPassword + "]";
	}
	
	/*getters & setters methods for the above declared entities*/
	

}
