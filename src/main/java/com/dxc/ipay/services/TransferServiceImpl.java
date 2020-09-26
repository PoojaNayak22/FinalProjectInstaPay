package com.dxc.ipay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.ipay.entites.Transfer;
import com.dxc.ipay.repositories.ITransferRepository;

@Service
public class TransferServiceImpl implements ITransferService {

	@Autowired
	ITransferRepository repo;
	
	@Autowired
	Transfer transfer;
	
	
	@Override
	public Transfer addTransfer(Transfer transfer) {
		// TODO Auto-generated method stub
		return repo.save(transfer);
	}

}
