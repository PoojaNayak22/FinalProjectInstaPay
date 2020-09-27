package com.dxc.ipay.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.ipay.entites.AccountDetails;
import com.dxc.ipay.repositories.IAccountDetailsRepository;
import com.dxc.ipay.services.IAccountDetailsService;

@Service
public class AccountDetailsServiceImpl implements IAccountDetailsService{
	
	
	
	@Autowired
	IAccountDetailsRepository repo;
	
	
	@Autowired
	AccountDetails account;


	@Override
	public AccountDetails addDetails(AccountDetails account) {
		// TODO Auto-generated method stub
		return repo.save(account);
	}


	@Override
	public AccountDetails updateDetails(AccountDetails account) {
		// TODO Auto-generated method stub
		return repo.save(account);
	}


}
