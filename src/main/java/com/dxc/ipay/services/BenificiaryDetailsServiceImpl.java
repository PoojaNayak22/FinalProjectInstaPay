package com.dxc.ipay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.ipay.entites.AccountDetails;
import com.dxc.ipay.repositories.IBenificiaryDetailsRepository;

@Service
public class BenificiaryDetailsServiceImpl implements IBenificiaryDetailsService {
	
	
	
	@Autowired
	IBenificiaryDetailsRepository repo; //repo is the reference variable to indicate interface IBenificiaryDetailsRepository .
	
	@Autowired
	AccountDetails account;

	@Override
	public AccountDetails addBenificiaryDetails(AccountDetails account) {
		// TODO Auto-generated method stub
		return repo.save(account);
	}

	@Override
	public AccountDetails updateBenificiaryDetails(AccountDetails account) {
		// TODO Auto-generated method stub
		return repo.save(account);
	}

}
