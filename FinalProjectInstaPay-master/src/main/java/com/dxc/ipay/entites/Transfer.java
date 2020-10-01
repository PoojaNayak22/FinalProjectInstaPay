/*This is the model class for Transfer*/

package com.dxc.ipay.entites;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity

public class Transfer {
	
	@Id //	indicates primary key in the database table of name Transfer

	private long receiverAccountNumber;
	private String bankIFSC;
	private String amount;
	private String transactionPassword;
	
	/*getters & setters methods for the above declared entities*/
	
	
	public long getReceiverAccountNumber() {
		return receiverAccountNumber;
	}
	public void setReceiverAccountNumber(long receiverAccountNumber) {
		this.receiverAccountNumber = receiverAccountNumber;
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
    /* toString method for the entities*/

	@Override
	public String toString() {
		return "Transfer [receiverAccountNumber=" + receiverAccountNumber + ", bankIFSC=" + bankIFSC + ", amount="
				+ amount + ", transactionPassword=" + transactionPassword + "]";
	}
	
	
}