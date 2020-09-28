package com.dxc.ipay.repositories;

/*IAdminSiteRepository Interface which extends predefined JpaRepository
Using Respective Model and WrapperClass*/

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.ipay.entites.AdminSite;


@Repository
public interface IAdminSiteRepository extends JpaRepository<AdminSite, Integer> {

	
	
	
}
