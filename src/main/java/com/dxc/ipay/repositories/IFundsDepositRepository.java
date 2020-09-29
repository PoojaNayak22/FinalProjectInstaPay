package com.dxc.ipay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.ipay.entites.FundsDeposit;

@Repository
public interface IFundsDepositRepository extends JpaRepository<FundsDeposit,Long> {
	
	

}
