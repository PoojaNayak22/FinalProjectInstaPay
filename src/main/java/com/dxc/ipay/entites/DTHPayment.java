/*This is the model class for DTHPayment*/

package com.dxc.ipay.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class DTHPayment  implements Serializable{
	@Id // indicates primary key in the database table of name DTHPayment

	private Long DTHId;
	private String amount;
	
	/*getters & setters methods for the above declared entities*/
	
	
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
	
    /* toString method for the entities*/

	@Override
	public String toString() {
		return "DTHPayment [DTHId=" + DTHId + ", amount=" + amount + "]";
	}
	

}
