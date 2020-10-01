package com.dxc.ipay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.ipay.entites.ReoccurringAccount;
import com.dxc.ipay.repositories.IReoccurringAccountRepository;

@Service
public class ReoccurringAccountImpl implements IReoccurringAccountService {

	@Autowired
	IReoccurringAccountRepository repo;//repo is the reference variable to indicate interface IReoccurringAccountRepository  .
	
	
	
	@Autowired
	ReoccurringAccount reocuring;
	
	
	
	
	@Override
	public ReoccurringAccount addAmount(ReoccurringAccount recurr) {
		
		/*  throws ReocurringDataException {
		
		 ReoccurringAccount  isValid = validateData(ReoccurringAccount);
		    
		    if(isValid != null) {
		    	// TODO Auto-generated method stub
				
		    }else {
		    	throw new ReocurringDataException("data missing....!Sorry check again");
		    }
		    
	}

	private ReoccurringAccount validateData( ReoccurringAccount reocuring) {
		

		
		if((reocuring. getAccountNumber()  >=10000000l)
				
			&&(reocuring. getDepositAmount().length() >=5)
			
			&&(reocuring.getPeriod().length() <=2)
			
			&&(reocuring. getRateOfInterest().length() <=1)
			
			
			return reocuring;
			
		}
		
		return null;
		
		
	*/		
		// TODO Auto-generated method stub
		return repo.save(reocuring);
	}

}
