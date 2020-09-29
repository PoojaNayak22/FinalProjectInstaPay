package com.dxc.ipay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.ipay.entites.FixedDeposit;
import com.dxc.ipay.repositories.IFixedDepositRepository;

@Service
public class FixedDepositServiceImpl implements IFixedDepositService {
	
	@Autowired
	IFixedDepositRepository repo;
	
	@Autowired
	FixedDeposit fixedDepo;
	
	
	
	
	

	@Override
	public FixedDeposit addAmount(FixedDeposit fixed) {
		/*  throws FixedDepositDataException {
		
		  FixedDeposit  isValid = validateData(FixedDeposit);
		    
		    if(isValid != null) {
		    	// TODO Auto-generated method stub
				
		    }else {
		    	throw new FixedDepositDataException("data missing....!Sorry check again");
		    }
		    
	}

	private FixedDeposit validateData( FixedDeposit fixedDepo) {
		

		
		if((fixedDepo. getAccountNumber()  >=10000000l)
				
			&&(fixedDepo. getDepositAmount().length() >=5)
			
			&&(fixedDepo.getPeriod().length() <=2)
			
			&&(fixedDepo. getRateOfInterest().length() <=1)
			
			
			return fixedDepo;
			
		}
		
		return null;
		
		
	*/		
		// TODO Auto-generated method stub
		return repo.save(fixed);
	}

}
