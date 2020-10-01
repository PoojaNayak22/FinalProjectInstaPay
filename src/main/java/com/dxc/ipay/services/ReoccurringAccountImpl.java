package com.dxc.ipay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.ipay.entites.ReoccurringAccount;
import com.dxc.ipay.exceptions.ReocurringDataException;
import com.dxc.ipay.repositories.IReoccurringAccountRepository;

@Service
public class ReoccurringAccountImpl implements IReoccurringAccountService {

	@Autowired
	IReoccurringAccountRepository repo;//repo is the reference variable to indicate interface IReoccurringAccountRepository  .
	
	
	
	@Autowired
	ReoccurringAccount reocuring;
	
	
	
	
	@Override
	public ReoccurringAccount addAmount(ReoccurringAccount recurr) throws ReocurringDataException {
		
		 ReoccurringAccount  isValid = validateData(recurr);
		    
		    if(isValid != null) {
		    	// TODO Auto-generated method stub
		    	return repo.save(reocuring);
				
		    }else {
		    	throw new ReocurringDataException("data missing....!Sorry check again");
		    }
		    
	}

	private ReoccurringAccount validateData( ReoccurringAccount reocuring) {
		

		
		if((reocuring. getDepositAmount().length() >=200000)
			
			&&(reocuring.getPeriod().length() >=3)
			
			&&(reocuring. getRateOfInterest().length() <=5)){
			
			
			
			return reocuring;
			
		}
		
		return null;
		
		
		
		// TODO Auto-generated method stub
		
	}

}
