package com.dxc.ipay.repositories;

/*IBenificiaryDetailsRepository Interface which extends predefined JpaRepository
Using Respective Model and WrapperClass*/


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.ipay.entites.AccountDetails;

@Repository
public interface IBenificiaryDetailsRepository extends JpaRepository <AccountDetails, Long>{

}
