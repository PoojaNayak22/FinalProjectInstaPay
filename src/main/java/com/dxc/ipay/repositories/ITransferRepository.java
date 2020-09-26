package com.dxc.ipay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.ipay.entites.Transfer;

@Repository
public interface ITransferRepository extends JpaRepository<Transfer,Long>{

}
