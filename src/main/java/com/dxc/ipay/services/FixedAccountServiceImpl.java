package com.dxc.ipay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.ipay.entites.FixedDeposit;
import com.dxc.ipay.repositories.IFixedDepositRepository;

@Service
public class FixedAccountServiceImpl implements IFixedDepositService {
	
	@Autowired
	IFixedDepositRepository repo; //repo is the reference variable to indicate interface IFixedDepositRepository .
	
	
	
	@Autowired
	FixedDeposit fixedDepo;
	
	
	
	
	

	@Override
	public FixedDeposit addAmount(FixedDeposit fixed) {
		
		
		return repo.save(fixed);
	}

}
