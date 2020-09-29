package com.dxc.ipay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.ipay.entites.ServiceProviders;
import com.dxc.ipay.repositories.IServiceProvidersRepository;

@Service
public class ServiceProvidersServiceImpl implements IServiceProvidersService {
	
	@Autowired
	IServiceProvidersRepository repo;
	
	@Autowired
	ServiceProviders providers;

	@Override
	public ServiceProviders addProviders(ServiceProviders providers) {
		// TODO Auto-generated method stub
		return repo.save(providers);
	}

}
