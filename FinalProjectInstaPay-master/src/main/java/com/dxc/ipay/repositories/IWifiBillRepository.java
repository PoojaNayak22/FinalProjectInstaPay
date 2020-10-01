package com.dxc.ipay.repositories;

/*IWifiBillRepository  Interface which extends predefined JpaRepository
Using Respective Model and WrapperClass*/



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.ipay.entites.WifiBill;
@Repository
public interface IWifiBillRepository  extends JpaRepository<WifiBill,Long>{

}
