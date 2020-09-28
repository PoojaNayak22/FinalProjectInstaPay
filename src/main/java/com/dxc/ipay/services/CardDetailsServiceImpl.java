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
		// TODO Auto-generated method stub
		return repo.save(card);
	}

	@Override
	public CardDetails updateCardDetails(CardDetails card) {
		// TODO Auto-generated method stub
		return repo.save(card);
	}

}
