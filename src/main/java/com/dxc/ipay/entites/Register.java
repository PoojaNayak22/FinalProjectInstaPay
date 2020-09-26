package com.dxc.ipay.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Register implements Serializable {
	
	@Id
	
	private String userId;
	
	private String accountNumber;
	
	private String customerName;
	
	private String customerMailId;
	
	private String customerPhoneNo;
	
	private String customerAddress;
	
	private String customerGender;
	
	private String dob;
	private String panId;
	private String password;
	private String transactionPassword;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerMailId() {
		return customerMailId;
	}
	public void setCustomerMailId(String customerMailId) {
		this.customerMailId = customerMailId;
	}
	public String getCustomerPhoneNo() {
		return customerPhoneNo;
	}
	public void setCustomerPhoneNo(String customerPhoneNo) {
		this.customerPhoneNo = customerPhoneNo;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerGender() {
		return customerGender;
	}
	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPanId() {
		return panId;
	}
	public void setPanId(String panId) {
		this.panId = panId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTransactionPassword() {
		return transactionPassword;
	}
	public void setTransactionPassword(String transactionPassword) {
		this.transactionPassword = transactionPassword;
	}
	
	@Override
	public String toString() {
		return "Customer [userId=" + userId + ", accountNumber=" + accountNumber + ", customerName=" + customerName
				+ ", customerMailId=" + customerMailId + ", customerPhoneNo=" + customerPhoneNo + ", customerAddress="
				+ customerAddress + ", customerGender=" + customerGender + ", dob=" + dob + ", panId=" + panId
				+ ", password=" + password + ", transactionPassword=" + transactionPassword + "]";
	}
	
	
	

}
