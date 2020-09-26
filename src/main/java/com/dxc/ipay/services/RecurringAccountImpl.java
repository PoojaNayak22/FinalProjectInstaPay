package com.dxc.ipay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.ipay.entites.RecurringAccount;
import com.dxc.ipay.repositories.IRecurringAccountRepository;

@Service
public class RecurringAccountImpl implements IRecurringAccountService {

	@Autowired
	IRecurringAccountRepository repo;
	
	
	@Autowired
	RecurringAccount recuring;
	
	
	
	
	@Override
	public RecurringAccount addAmount(RecurringAccount recurr) {
		// TODO Auto-generated method stub
		return repo.save(recurr);
	}

}
