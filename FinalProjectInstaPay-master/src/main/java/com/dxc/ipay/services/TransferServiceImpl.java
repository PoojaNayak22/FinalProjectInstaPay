package com.dxc.ipay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.ipay.entites.Transfer;
import com.dxc.ipay.exceptions.TransferException;
import com.dxc.ipay.repositories.ITransferRepository;

@Service
public class TransferServiceImpl implements ITransferService {

	@Autowired
	ITransferRepository repo;//repo is the reference variable to indicate interface ITransferRepository  .
	
	
	@Autowired
	Transfer transfer;
	
	
	@Override
	public Transfer addTransfer(Transfer transfer) {
	/*  throws TransferException {
		
		    Transfer isValid = validateTransfer(transfer);
		    
		    if(isValid != null) {
		    	// TODO Auto-generated method stub
				
		    }else {
		    	throw new TransferException("Transfer Failed....");
		    }
		    
	}
	
	private Transfer validateTransfer(Transfer transfer) {
		

		
		if((transfer.getReceiverAccountNumber() >=100000000000l)
				
			&&(transfer.getBankIFSC().length() >=7)
			
			&&(transfer.getAmount().length() >2)
			
				&&(transfer.getTransactionPassword().length() >=6)) {
			
			
			return transfer;
			
		}
		
		return null;
		
		
*/		
		
	return repo.save(transfer);
	}
			    	
		    	
	    
		
	

}
