package com.dxc.ipay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.ipay.entites.ReoccurringAccount;

@Repository
public interface IReoccurringAccountRepository extends JpaRepository<ReoccurringAccount, Long> {

}
