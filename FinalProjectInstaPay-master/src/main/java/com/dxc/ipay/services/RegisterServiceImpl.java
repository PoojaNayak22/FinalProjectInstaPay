package com.dxc.ipay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.ipay.entites.Register;
import com.dxc.ipay.repositories.IRegisterRepository;

@Service
public class RegisterServiceImpl implements IRegisterService {

	@Autowired
	IRegisterRepository repo;//repo is the reference variable to indicate interface IRegisterRepository  .
	
	
	@Autowired
	Register register;
	
	
	
	
	@Override
	public Register addCustomer(Register register) {
		
		/*  throws RegisterDataException {
		
		Register  isValid = validateData(Register);
		    
		    if(isValid != null) {
		    	// TODO Auto-generated method stub
				
		    }else {
		    	throw new RegisterDataException("data missing....!Sorry check again");
		    }
		    
	}

	private Register   validateData(Register register  ) {
		

		
		if((register. getAccountNumber()  >=10000000l)
		
		&&(register.getUserId().length() >=5 )
				
			&&(register.getCustomerName().length() >=4)
			
			&&(register.getCustomerMailId().length() >=6)
			
			&&(register. getCustomerPhoneNo().length() ==10)
			
			&&(register.getCustomerAddress().length() >=12)
			
			&&(register.getCustomerGender().length() >=4)
			
		
			&&(register.getPanId().length() >==10)
			
			&&(register.getTransactionPassword().length() >=7)
		
			
			return register;
			
		}
		
		return null;
		
		
	*/		
		// TODO Auto-generated method stub
		return repo.save(register);
	}

}
