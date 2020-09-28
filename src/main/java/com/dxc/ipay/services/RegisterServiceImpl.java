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
		// TODO Auto-generated method stub
		return repo.save(register);
	}

}
