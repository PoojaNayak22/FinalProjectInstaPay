package com.dxc.ipay.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.ipay.entites.SavingsAccount;
import com.dxc.ipay.repositories.ISavingsAccountRepository;

@Service

public class SavingsAccountServiceImpl implements ISavingsAccountService {
	
	@Autowired
	ISavingsAccountRepository repo;//repo is the reference variable to indicate interface ISavingsAccountRepository  .
	
	
	
	@Autowired
	SavingsAccount savings;
	
	
	

	@Override
	public List<SavingsAccount> ministatement() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<SavingsAccount> statement() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
