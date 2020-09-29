package com.dxc.ipay.services;

import org.springframework.stereotype.Service;

import com.dxc.ipay.entites.Withdraw;



@Service
public interface IWithdrawService {
	
	public Withdraw  debitMoney(Withdraw withdraw);
	

}
