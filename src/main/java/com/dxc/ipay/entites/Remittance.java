package com.dxc.ipay.entites;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Remittance {
	
	@Id
	private String addAccount;
	private String accountNumber;
	private String ifsc;
	private String addCreditCard;
	private String cardNumber;
	private String serviceProvider;
	private String beneficiaryAccount;
	private String autoPayment;
	
	public String getAddAccount() {
		return addAccount;
	}
	public void setAddAccount(String addAccount) {
		this.addAccount = addAccount;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getAddCreditCard() {
		return addCreditCard;
	}
	public void setAddCreditCard(String addCreditCard) {
		this.addCreditCard = addCreditCard;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getServiceProvider() {
		return serviceProvider;
	}
	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}
	public String getBeneficiaryAccount() {
		return beneficiaryAccount;
	}
	public void setBeneficiaryAccount(String beneficiaryAccount) {
		this.beneficiaryAccount = beneficiaryAccount;
	}
	public String getAutoPayment() {
		return autoPayment;
	}
	public void setAutoPayment(String autoPayment) {
		this.autoPayment = autoPayment;
	}
	
	@Override
	public String toString() {
		return "Remittance [addAccount=" + addAccount + ", accountNumber=" + accountNumber + ", ifsc=" + ifsc
				+ ", addCreditCard=" + addCreditCard + ", cardNumber=" + cardNumber + ", serviceProvider="
				+ serviceProvider + ", beneficiaryAccount=" + beneficiaryAccount + ", autoPayment=" + autoPayment + "]";
	}

}
