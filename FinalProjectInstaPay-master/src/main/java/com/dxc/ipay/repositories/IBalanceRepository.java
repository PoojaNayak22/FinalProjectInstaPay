package com.dxc.ipay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.ipay.entites.Balance;
@Repository
public interface IBalanceRepository extends JpaRepository<Balance,Long> {

}
