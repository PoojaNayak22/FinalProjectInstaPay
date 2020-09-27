package com.dxc.ipay.services;

import java.util.List;

import com.dxc.ipay.entites.SavingsAccount;

public interface ISavingsAccountService {
	
	
	public List<SavingsAccount> ministatement();
	
	public List<SavingsAccount> statement();
	
	
	

}
