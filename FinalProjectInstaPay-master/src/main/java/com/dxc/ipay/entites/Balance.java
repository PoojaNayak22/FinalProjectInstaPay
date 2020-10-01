package com.dxc.ipay.entites;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Balance {
	@Id
	private long balancePin;
	private long balance;
	
	public long getBalancePin() {
		return balancePin;
	}
	
	public void setBalancePin(long balancePin) {
		this.balancePin = balancePin;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Balance [balancePin=" + balancePin + ", balance=" + balance + "]";
	}

}
