package com.dxc.ipay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.ipay.entites.Withdraw;
import com.dxc.ipay.repositories.IWithdrawRepository;

@Service
public class WithdrawServiceImpl implements IWithdrawService {
	
	@Autowired
	IWithdrawRepository repo;
	
	@Autowired
	Withdraw withdraw;

	@Override
	public Withdraw debitMoney(Withdraw withdraw) {
		// TODO Auto-generated method stub
		return repo.save(withdraw);
	}

}
