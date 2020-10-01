package com.dxc.ipay.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.ipay.entites.Balance;

import com.dxc.ipay.repositories.IBalanceRepository;
@Service
public class BalanceServiceImpl implements IBalanceService{
	
	
	@Autowired
	IBalanceRepository repo; //repo is the reference variable to indicate interface IBalanceRepository.
	
	
	@Autowired
	Balance balance; //Balance is the reference variable to indicate Balance Pojo Class.
	


	@Override
	public List<Balance> getBalance() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	

}
