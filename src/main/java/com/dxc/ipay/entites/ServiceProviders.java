package com.dxc.ipay.entites;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class ServiceProviders {
	
	@Id //indicates primary key in the database table of name FixedDeposit
	private long serviceId;
	private String providerName;
	public long getServiceId() {
		return serviceId;
	}
	public void setServiceId(long serviceId) {
		this.serviceId = serviceId;
	}
	public String getProviderName() {
		return providerName;
	}
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	@Override
	public String toString() {
		return "ServiceProviders [serviceId=" + serviceId + ", providerName=" + providerName + "]";
	}
	
}