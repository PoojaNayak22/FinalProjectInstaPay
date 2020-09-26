package com.dxc.ipay.entites;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Component
@Entity
public class AdminSite {
	
	private String userId;
	private String requestStatement;
	private String fundsDeposit;
	private String serviceProvider;
	private boolean approval;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getRequestStatement() {
		return requestStatement;
	}
	public void setRequestStatement(String requestStatement) {
		this.requestStatement = requestStatement;
	}
	public String getFundsDeposit() {
		return fundsDeposit;
	}
	public void setFundsDeposit(String fundsDeposit) {
		this.fundsDeposit = fundsDeposit;
	}
	public String getServiceProvider() {
		return serviceProvider;
	}
	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}
	public boolean isApproval() {
		return approval;
	}
	public void setApproval(boolean approval) {
		this.approval = approval;
	}
	
	@Override
	public String toString() {
		return "AdminSite [userId=" + userId + ", requestStatement=" + requestStatement + ", fundsDeposit="
				+ fundsDeposit + ", serviceProvider=" + serviceProvider + ", approval=" + approval + "]";
	}
	

}
