package com.dxc.ipay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.ipay.entites.BroadcastPayment;

import com.dxc.ipay.repositories.IBroadcastPaymentRepository;
@Service
public class BroadcastPaymentServiceImpl implements IBroadcastPaymentService{
	@Autowired
	IBroadcastPaymentRepository repo; //repo is the reference variable to indicate interface IDTHPaymentRepository .
	
	
	@Autowired
	BroadcastPayment dthpayment;
	

	@Override
	public BroadcastPayment addpayment(BroadcastPayment dthpayment) {
		
		/*  throws PaymentDataException {
		
	   DTHPayment  isValid = validateCard(DTHPayment );
	    
	    if(isValid != null) {
	    	// TODO Auto-generated method stub
			
	    }else {
	    	throw new PaymentDataException("Payment data missing....!Sorry");
	    }
	    
}

private DTHPayment validateCard( DTHPayment dthpayment) {
	

	
	if((dthpayment.getDTHId().length()  >=10)
			
		&&(dthpayment. getAmount().length() >=5)
		
		
		
		return dthpayment;
		
	}
	
	return null;
	
	
*/		
		// TODO Auto-generated method stub
		return repo.save(dthpayment);
	}

}