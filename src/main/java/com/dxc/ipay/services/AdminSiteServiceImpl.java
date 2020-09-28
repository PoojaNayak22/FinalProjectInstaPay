package com.dxc.ipay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.ipay.entites.AdminSite;
import com.dxc.ipay.repositories.IAdminSiteRepository;

@Service
public class AdminSiteServiceImpl implements IAdminSiteService {

	@Autowired
	IAdminSiteRepository repo; //repo is the reference variable to indicate interface IAdminSiteRepository .
	
	@Autowired
	AdminSite admin;
	
	
	
	
	@Override
	public AdminSite addRequest(AdminSite adminsite) {
		// TODO Auto-generated method stub
		return repo.save(admin);
	}

	@Override
	public AdminSite updateRequest(AdminSite adminsite) {
		// TODO Auto-generated method stub
		return repo.save(admin);
	}

	@Override
	public void deleteRequest(int userId) {
		// TODO Auto-generated method stub
		repo.deleteById(userId);
		
	}

}
