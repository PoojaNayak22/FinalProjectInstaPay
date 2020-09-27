package com.dxc.ipay.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class DTHPayment  implements Serializable{
	@Id
	private Long DTHId;
	private String amount;
	public Long getDTHId() {
		return DTHId;
	}
	public void setDTHId(Long dTHId) {
		DTHId = dTHId;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "DTHPayment [DTHId=" + DTHId + ", amount=" + amount + "]";
	}
	

}
