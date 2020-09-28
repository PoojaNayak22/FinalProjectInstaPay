package com.dxc.ipay.repositories;

/*ISavingsAccountRepository  Interface which extends predefined JpaRepository
Using Respective Model and WrapperClass*/


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.ipay.entites.SavingsAccount;

@Repository
public interface ISavingsAccountRepository extends JpaRepository<SavingsAccount, Long> {

}
