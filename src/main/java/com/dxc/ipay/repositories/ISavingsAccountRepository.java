package com.dxc.ipay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.ipay.entites.SavingsAccount;

@Repository
public interface ISavingsAccountRepository extends JpaRepository<SavingsAccount, Long> {

}
