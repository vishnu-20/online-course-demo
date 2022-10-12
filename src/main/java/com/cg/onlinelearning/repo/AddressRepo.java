package com.cg.onlinelearning.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.onlinelearning.dto.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {

}
