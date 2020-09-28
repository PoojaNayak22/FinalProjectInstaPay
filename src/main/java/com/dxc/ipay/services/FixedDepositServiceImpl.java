package com.dxc.ipay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.ipay.entites.FixedDeposit;
import com.dxc.ipay.repositories.IFixedDepositRepository;

@Service
public class FixedDepositServiceImpl implements IFixedDepositService {
	
	@Autowired
	IFixedDepositRepository repo;
	
	@Autowired
	FixedDeposit fixedDepo;
	
	
	
	
	

	@Override
	public FixedDeposit addAmount(FixedDeposit fixed) {
		// TODO Auto-generated method stub
		return repo.save(fixed);
	}

}
