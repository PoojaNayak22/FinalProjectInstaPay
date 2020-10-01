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
		
		/*  throws BeneficiaryDataMissingException {
		
	     AccountDetails isValid = validateAccount( AccountDetails);
	    
	    if(isValid != null) {
	    	// TODO Auto-generated method stub
			
	    }else {
	    	throw new BeneficiaryDataMissingException("Beneficiary data missing....");
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

	@Override
	public AccountDetails updateBenificiaryDetails(AccountDetails account) {
		/*  throws BeneficiaryDataMissingException {
		
	     AccountDetails isValid = validateAccount( AccountDetails);
	    
	    if(isValid != null) {
	    	// TODO Auto-generated method stub
			
	    }else {
	    	throw new BeneficiaryDataMissingException("Beneficiary data missing....");
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
