package com.dxc.ipay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.ipay.entites.FixedDeposit;
import com.dxc.ipay.exceptions.FixedDepositDataException;
import com.dxc.ipay.repositories.IFixedDepositRepository;

@Service
public class FixedDepositServiceImpl implements IFixedDepositService {
	
	@Autowired
	IFixedDepositRepository repo;
	
	@Autowired
	FixedDeposit fixedDepo;
	
	
	
	
	

	@Override
	public FixedDeposit addAmount(FixedDeposit fixed) throws FixedDepositDataException {
		
		  FixedDeposit  isValid = validateData(fixed);
		    
		    if(isValid != null) {
		    	// TODO Auto-generated method stub
		    	return repo.save(fixed);
				
		    }else {
		    	throw new FixedDepositDataException("data missing....!Sorry check again");
		    }
		    
	}

	private FixedDeposit validateData( FixedDeposit fixedDepo) {
		

		
		if((fixedDepo. getDepositAmount().length() >=50000)
			
			&&(fixedDepo.getPeriod().length() <=4)
			
			&&(fixedDepo. getRateOfInterest().length() <=4)) {
			
			
			return fixedDepo;
			
		}

		
		return null;

	
	
   }

}
