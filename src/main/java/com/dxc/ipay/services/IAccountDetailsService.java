package com.dxc.ipay.services;



import com.dxc.ipay.entites.AccountDetails;

public interface IAccountDetailsService {
	
	public AccountDetails addDetails(AccountDetails account);
	
	public AccountDetails updateDetails(AccountDetails account);
	
}
