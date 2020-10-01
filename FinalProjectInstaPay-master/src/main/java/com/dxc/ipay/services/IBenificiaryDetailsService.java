package com.dxc.ipay.services;

import com.dxc.ipay.entites.AccountDetails;

public interface IBenificiaryDetailsService {
	
	public AccountDetails addBenificiaryDetails(AccountDetails account);
	
	public AccountDetails updateBenificiaryDetails(AccountDetails account);

}
