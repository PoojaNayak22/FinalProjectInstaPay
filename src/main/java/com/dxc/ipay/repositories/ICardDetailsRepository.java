package com.dxc.ipay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.ipay.entites.CardDetails;

@Repository
public interface ICardDetailsRepository extends JpaRepository<CardDetails, Long> {

}
