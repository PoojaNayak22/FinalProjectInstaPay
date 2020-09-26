package com.dxc.ipay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.ipay.entites.RecurringAccount;

@Repository
public interface IRecurringAccountRepository extends JpaRepository<RecurringAccount, Long> {

}
