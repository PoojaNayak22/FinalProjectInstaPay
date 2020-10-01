package com.dxc.ipay.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.ipay.entites.AccountDetails;
import com.dxc.ipay.repositories.IAccountDetailsRepository;


@Service
public class AccountDetailsServiceImpl implements IAccountDetailsService{
	
	
	
	@Autowired
	IAccountDetailsRepository repo; //repo is the reference variable to indicate interface IAccountDetailsRepository.
	
	
	@Autowired
	AccountDetails account; //account is the reference variable to indicate AccountDetails Pojo Class.
	


	@Override
	public AccountDetails addDetails(AccountDetails account)   {
		/*  throws AccountDetailsNotFoundException {
		
	     AccountDetails isValid = validateAccount( AccountDetails);
	    
	    if(isValid != null) {
	    	// TODO Auto-generated method stub
			
	    }else {
	    	throw new AccountDetailsNotFoundException("AccountDetails Not Found !Try again....");
	    }
	    
}

  private  AccountDetails validateAccount( AccountDetails account) {
	

	
	if((account.getReceiverAccountNumber() >=100000000000l)
			
		&&(account.getBankIFSC().length() >=7)
		
		&&(account.getAccountHolderName().length() >7)
		
			
		
		return account;
		
	}
	
	return null;
	
	
*/		
		return repo.save(account);
	}


	@Override
	public AccountDetails updateDetails(AccountDetails account) {
		/*  throws AccountDetailsNotFoundException {
		
	     AccountDetails isValid = validateAccount( AccountDetails);
	    
	    if(isValid != null) {
	    	// TODO Auto-generated method stub
			
	    }else {
	    	throw new AccountDetailsNotFoundException("AccountDetails Not Found !Try again....");
	    }
	    
}

 private  AccountDetails validateAccount( AccountDetails account) {
	

	
	if((account.getReceiverAccountNumber() >=100000000000l)
			
		&&(account.getBankIFSC().length() >=7)
		
		&&(account.getAccountHolderName().length() >7)
		
			
		
		return account;
		
	}
	
	return null;
	
	
*/		
		// TODO Auto-generated method stub
		return repo.save(account);
	}


}
