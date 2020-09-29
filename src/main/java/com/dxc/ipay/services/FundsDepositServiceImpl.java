package com.dxc.ipay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.ipay.entites.FixedDeposit;
import com.dxc.ipay.entites.FundsDeposit;
import com.dxc.ipay.repositories.IFixedDepositRepository;
import com.dxc.ipay.repositories.IFundsDepositRepository;

@Service
public class FundsDepositServiceImpl implements IFundsDepositService {
	
	@Autowired
	IFundsDepositRepository repo;
	
	@Autowired
	FundsDeposit funds ;
	
	

	@Override
	public FundsDeposit addDeposit(FundsDeposit funds) {
		// TODO Auto-generated method stub
		return repo.save(funds);
	}

}
