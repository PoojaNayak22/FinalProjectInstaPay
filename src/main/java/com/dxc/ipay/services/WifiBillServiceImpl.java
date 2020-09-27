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
	IWifiBillRepository repo;
	
	@Autowired
	WifiBill wifibill;
	
	
	@Override
	public WifiBill addBill(WifiBill wifibill) {
		// TODO Auto-generated method stub
		return repo.save(wifibill);

}

}