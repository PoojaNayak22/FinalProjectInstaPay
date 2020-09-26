package com.dxc.ipay.services;

import com.dxc.ipay.entites.AdminSite;

public interface IAdminSiteService {
	
	public AdminSite addRequest(AdminSite adminsite );
	
	public AdminSite updateRequest(AdminSite adminsite);
	
	public void deleteRequest(int userId);

}
