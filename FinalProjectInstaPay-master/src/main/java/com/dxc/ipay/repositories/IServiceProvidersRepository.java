package com.dxc.ipay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.ipay.entites.ServiceProviders;

@Repository
public interface IServiceProvidersRepository extends JpaRepository<ServiceProviders, Long>{
	

}
