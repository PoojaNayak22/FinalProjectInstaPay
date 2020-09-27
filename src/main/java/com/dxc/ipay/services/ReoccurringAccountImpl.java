package com.dxc.ipay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.ipay.entites.ReoccurringAccount;
import com.dxc.ipay.repositories.IReoccurringAccountRepository;

@Service
public class ReoccurringAccountImpl implements IReoccurringAccountService {

	@Autowired
	IReoccurringAccountRepository repo;
	
	
	@Autowired
	ReoccurringAccount recuring;
	
	
	
	
	@Override
	public ReoccurringAccount addAmount(ReoccurringAccount recurr) {
		// TODO Auto-generated method stub
		return repo.save(recurr);
	}

}
