package com.dxc.ipay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.ipay.entites.DTHPayment;

import com.dxc.ipay.repositories.IDTHPaymentRepository;
@Service
public class DTHPaymentServiceImpl implements IDTHPaymentService{
	@Autowired
	IDTHPaymentRepository repo; //repo is the reference variable to indicate interface IDTHPaymentRepository .
	
	
	@Autowired
	DTHPayment dthpayment;
	

	@Override
	public DTHPayment addpayment(DTHPayment dthpayment) {
		// TODO Auto-generated method stub
		return repo.save(dthpayment);
	}

}