/*This is the model class for WifiBill*/

package com.dxc.ipay.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class WifiBill implements Serializable {
	
	@Id // 	indicates primary key in the database table of name Wifibill

	private Long billId;
	private String amount;
	
	/*getters & setters methods for the above declared entities*/
	
	
	public Long getBillId() {
		return billId;
	}
	public void setBillId(Long billId) {
		this.billId = billId;
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
		return "WifiBill [billId=" + billId + ", amount=" + amount + "]";
	}

}
