package com.dxc.ipay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.ipay.entites.AdminSite;


@Repository
public interface IAdminSiteRepository extends JpaRepository<AdminSite, Integer> {

	
	
	
}
