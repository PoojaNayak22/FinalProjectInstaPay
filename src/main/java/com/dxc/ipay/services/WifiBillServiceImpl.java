package com.dxc.ipay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.ipay.entites.Transfer;
import com.dxc.ipay.entites.WifiBill;
import com.dxc.ipay.repositories.ITransferRepository;
import com.dxc.ipay.repositories.IWifiBillRepository;
@Service
public class WifiBillServiceImpl  implements IWifiBillService{
	@Autowired
	IWifiBillRepository repo;//repo is the reference variable to indicate interface IWifiBillRepository  .
	
	
	@Autowired
	WifiBill wifibill;
	
	
	@Override
	public WifiBill addBill(WifiBill wifibill) {
		/*  throws WifiDataException {
		
		   WifiBill  isValid = validatedata(WifiBill );
		    
		    if(isValid != null) {
		    	// TODO Auto-generated method stub
				
		    }else {
		    	throw new WifiDataException("wifi data missing....!Sorry");
		    }
		    
	}

	private WifiBill  validatedata( WifiBill wifibill) {
		

		
		if((wifibill.getBillId().length()  >=10)
				
			&&(wifibill.getAmount().length() >=5)
			
			
			
			return wifibill;
			
		}
		
		return null;
		
		
	*/		
		// TODO Auto-generated method stub
		return repo.save(wifibill);

}

}