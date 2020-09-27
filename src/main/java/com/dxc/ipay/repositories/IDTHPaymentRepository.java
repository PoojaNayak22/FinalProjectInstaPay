package com.dxc.ipay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dxc.ipay.entites.DTHPayment;

public interface IDTHPaymentRepository extends JpaRepository<DTHPayment,Long> {

}
