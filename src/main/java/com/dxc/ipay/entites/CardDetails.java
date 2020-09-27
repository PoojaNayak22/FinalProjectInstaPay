/*This is the model class for CardDetails*/
package com.dxc.ipay.entites;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class CardDetails {
	
	@Id // indicates primary key in the database table of name CardDetails

	private long cardNumber;
	private String cardHolderName;
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
    /* toString method for the entities*/

	@Override
	public String toString() {
		return "CardDetails [cardNumber=" + cardNumber + ", cardHolderName=" + cardHolderName + "]";
	}
	
	
	
	

}
