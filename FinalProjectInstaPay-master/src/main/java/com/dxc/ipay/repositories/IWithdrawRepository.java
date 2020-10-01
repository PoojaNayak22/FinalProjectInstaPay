package com.dxc.ipay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.ipay.entites.Withdraw;

@Repository
public interface IWithdrawRepository extends JpaRepository<Withdraw, Double>{

}
