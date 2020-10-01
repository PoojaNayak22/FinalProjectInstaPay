package com.dxc.ipay.repositories;

/*IDTHPaymentRepository Interface which extends predefined JpaRepository
Using Respective Model and WrapperClass*/


import org.springframework.data.jpa.repository.JpaRepository;

import com.dxc.ipay.entites.DTHPayment;

public interface IDTHPaymentRepository extends JpaRepository<DTHPayment,Long> {

}
