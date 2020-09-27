package com.dxc.ipay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.ipay.entites.Register;

@Repository
public interface IRegisterRepository extends JpaRepository<Register, Long> {

}
