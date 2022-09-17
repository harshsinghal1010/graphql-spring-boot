package com.gql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gql.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
