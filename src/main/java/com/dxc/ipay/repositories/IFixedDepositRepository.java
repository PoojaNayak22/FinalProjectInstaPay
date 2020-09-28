package com.dxc.ipay.repositories;

/*IFixedDepositRepository Interface which extends predefined JpaRepository
Using Respective Model and WrapperClass*/



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.ipay.entites.FixedDeposit;

@Repository

public interface IFixedDepositRepository extends JpaRepository<FixedDeposit, Long>{

}
