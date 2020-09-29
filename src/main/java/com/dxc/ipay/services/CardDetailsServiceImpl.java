package com.dxc.ipay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.ipay.entites.CardDetails;
import com.dxc.ipay.repositories.ICardDetailsRepository;

@Service
public class CardDetailsServiceImpl implements ICardDetailsService {
	
	@Autowired
	ICardDetailsRepository repo;//repo is the reference variable to indicate interface ICardDetailsRepository.
	
	
	@Autowired
	CardDetails card;
	
	

	@Override
	public CardDetails addCardDetails(CardDetails card) {
		
		/*  throws CardDataMissingException {
		
	     CardDetails  isValid = validateCard(CardDetails );
	    
	    if(isValid != null) {
	    	// TODO Auto-generated method stub
			
	    }else {
	    	throw new CardDataMissingException("Card data missing....");
	    }
	    
}

private  CardDetails validateCard( CardDetails card) {
	

	
	if((card.getCardNumber()  >=10000000l)
			
		&&(card. getCardHolderName().length() >=15)
		
		
		
		return card;
		
	}
	
	return null;
	
	
*/		
		// TODO Auto-generated method stub
		return repo.save(card);
	}

	@Override
	public CardDetails updateCardDetails(CardDetails card) {
		/*  throws CardDataMissingException {
		
	     CardDetails  isValid = validateCard(CardDetails );
	    
	    if(isValid != null) {
	    	// TODO Auto-generated method stub
			
	    }else {
	    	throw new CardDataMissingException("Card data missing....");
	    }
	    
}

private  CardDetails validateCard( CardDetails card) {
	

	
	if((card.getCardNumber()  >=10000000l)
			
		&&(card. getCardHolderName().length() >=15)
		
		
		
		return card;
		
	}
	
	return null;
	
	
*/		
		// TODO Auto-generated method stub
		return repo.save(card);
	}

}
